package services;

import model.user.User;
import repo.RepositoryProvider;
import repo.UserRepository;

import java.util.Random;

public class SuperManagerServices {
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String EMAIL_ALLOW_BASE = CHAR_LOWER + CHAR_UPPER + NUMBER + "_.";
    private static final String OTHER_CHAR = "!@#$%&*()_+-=[]?";
    private static final String PASSWORD_ALLOW_BASE = CHAR_LOWER + CHAR_UPPER + NUMBER + OTHER_CHAR;
    private static final Random random = new Random();
    private static SuperManagerServices instance = new SuperManagerServices();
    RepositoryProvider repositoryProvider = new RepositoryProvider();
    private UserRepository userRepository = repositoryProvider.getUserRepository();

    private SuperManagerServices() {
    }

    public static SuperManagerServices getInstance() {
        return instance;
    }


    public String createAccount(User user) {
        if (isUserAlreadyExist(user))
            return "User is already Exist";
        else if (!isValidEmail(user.getCredentials().getLogin())) {
            return "Your Email is not valid";
        } else if (!isStrongPassword(user.getCredentials().getPassword())) {
            return "Please Use a strong password";
        } else {
            userRepository.addUser(user);
            return "success";
        }
    }

    private boolean isUserAlreadyExist(User user) {
        for (User userRepositoryUser : userRepository.getUsers()) {
            if (userRepositoryUser.getCredentials().equals(user.getCredentials())) {
                return true;
            }
        }
        return false;
    }

    public String generateRandomEmail() {
        StringBuilder sb = new StringBuilder();
        int length = random.nextInt(10) + 5; // Random length between 5 and 14
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(EMAIL_ALLOW_BASE.length());
            sb.append(EMAIL_ALLOW_BASE.charAt(index));
        }
        sb.append("@example.com");
        return sb.toString();
    }

    public String generateStrongPassword() {
        StringBuilder sb = new StringBuilder();
        int length = 9; // Length of the password
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(PASSWORD_ALLOW_BASE.length());
            sb.append(PASSWORD_ALLOW_BASE.charAt(index));
        }
        return sb.toString();
    }

    public boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(regex);
    }

    public boolean isStrongPassword(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        return password.matches(regex);
    }
}
