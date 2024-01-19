package my.utm.ip.userTable.repository;

import my.utm.ip.userTable.model.User;

import java.util.List;

public interface userRepository {
    
    List<User> getAllUsers();

    User getUserById(int userId);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int userId);

}