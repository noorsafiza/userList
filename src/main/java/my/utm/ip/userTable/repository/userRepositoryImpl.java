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
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public User getUserById(int userId) {
        String sql = "SELECT * FROM user WHERE userId = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{userId}, new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public void addUser(User user) {
        String sql = "INSERT INTO user (username, password, email, name, contact, status, address, category) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getEmail(),
                user.getName(), user.getContact(), user.getStatus(), user.getAddress(), user.getCategory());
    }

    @Override
    public void updateUser(User user) {
        String sql = "UPDATE user SET username = ?, password = ?, email = ?, name = ?, " +
                     "contact = ?, status = ?, address = ?, category = ? WHERE userId = ?";
        jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getEmail(),
                user.getName(), user.getContact(), user.getStatus(), user.getAddress(),
                user.getCategory(), user.getUserId());
    }

    @Override
    public void deleteUser(int userId) {
        String sql = "DELETE FROM user WHERE userId = ?";
        jdbcTemplate.update(sql, userId);
    }
}