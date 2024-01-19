package my.utm.ip.userTable.service;

import my.utm.ip.userTable.model.User;
import my.utm.ip.userTable.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceDatabaseImpl implements userService {

    @Autowired
    private userRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User getUserById(int userId) {
        return userRepository.getUserById(userId);
    }

    @Override
    public void addUser(User user) {
        userRepository.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    @Override
    public void deleteUser(int userId) {
        userRepository.deleteUser(userId);
    }
}