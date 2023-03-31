package repo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import constants.Constants;
import model.user.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements Repository {
    private static final String filePath = "src/main/java/doa/" + Constants.USER_TABLE;
    private List<User> users;

    public UserRepository() {
        this.users = loadUsersFromFile();
    }

    public void addUser(User user) {
        users.add(user);
        saveUsersToFile();
    }

    public void removeUser(User user) {
        users.remove(user);
        saveUsersToFile();
    }

    public void updateUser(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getCredentials().getLogin().equals(user.getCredentials().getLogin())) {
                users.set(i, user);
                saveUsersToFile();
                break;
            }
        }
    }

    public List<User> getUsers() {
        return users;
    }

    private List<User> loadUsersFromFile() {
        try {
            Reader reader = new FileReader(filePath);
            List<User> userList = new Gson().fromJson(reader, new TypeToken<List<User>>() {
            }.getType());
            reader.close();
            return userList != null ? userList : new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private void saveUsersToFile() {
        try {
            Writer writer = new FileWriter(filePath);
            new Gson().toJson(users, writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
