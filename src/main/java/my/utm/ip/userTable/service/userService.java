package my.utm.ip.userTable.service;

import my.utm.ip.userTable.model.User;

import java.util.List;

public interface userService {

    List<User> getAllUsers();

    User getUserById(int userId);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int userId);
    
}