package services;

import model.user.User;
import repo.RepositoryProvider;
import repo.UserRepository;

public class UserService {


    public static UserService userService = new UserService();
    RepositoryProvider repositoryProvider = new RepositoryProvider();
    public final UserRepository userRepository = repositoryProvider.getUserRepository();

    public UserService() {

    }

    public static UserService getInstance() {
        return userService;
    }

    public String registerUser(User user) {
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

    public User loginUser(String email, String password) {
        for (User user : userRepository.getUsers()) {
            if (user.getCredentials().getLogin().equals(email)
                    && user.getCredentials().getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    private boolean isUserAlreadyExist(User user) {
        for (User userRepositoryUser : userRepository.getUsers()) {
            if (userRepositoryUser.getCredentials().equals(user.getCredentials())) {
                return true;
            }
        }
        return false;
    }

    public User getUserByEmail(String email) {
        for (User userRepositoryUser : userRepository.getUsers()) {
            if (userRepositoryUser.getCredentials().getLogin().equals(email)) {
                return userRepositoryUser;
            }
        }
        return null;
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
