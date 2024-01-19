package my.utm.ip.userTable.repository;

import my.utm.ip.userTable.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class userRepositoryImpl implements userRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getAllUsers() {
        // Implement logic to fetch all users from the database
        return null;
    }

    @Override
    public User getUserById(int userId) {
        // Implement logic to fetch a user by ID from the database
        return null;
    }

    @Override
    public void addUser(User user) {
        // Implement logic to add a new user to the database
    }

    @Override
    public void updateUser(User user) {
        // Implement logic to update an existing user in the database
    }

    @Override
    public void deleteUser(int userId) {
        // Implement logic to delete a user by ID from the database
    }
}