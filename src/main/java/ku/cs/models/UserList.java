package ku.cs.models;

import java.util.ArrayList;

public class UserList {
    private ArrayList<User> users;

    public UserList() {
        users = new ArrayList<>();
    }

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.isUsername(username)) {
                return user;
            }
        }
        return null;
    }

    public void addUser(String username, String password) {
        User exist = findUserByUsername(username);
        if (exist == null) {
            users.add(new User(username, password));
        }
    }


    //TODO: implements this method to change user's password to newPassword by verified oldPassword
    //TODO: return true if process is completed, otherwise return false
    public boolean changePassword(String username, String oldPassword, String newPassword) {
        User exist = findUserByUsername(username);
        if (exist != null) {
            if (exist.validatePassword(oldPassword)) {
                exist.setPassword(newPassword);
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    //TODO: implements this method to find user in users with valid password
    //TODO: return User object if username and password is correct, otherwise return null
    public User login(String username, String password) {
        User exist = findUserByUsername(username);
        if (exist != null) {
            if (exist.validatePassword(password) && exist.getUsername().equals(username)) {
                return exist;
            }
            else {
                return null;
            }
        }
        return null;
    }
}