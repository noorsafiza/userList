package my.utm.ip.userTable.controller;

import java.util.List;
import java.util.Objects;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import my.utm.ip.userTable.model.User;
import my.utm.ip.userTable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import my.utm.ip.userTable.model.User;


@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    JdbcTemplate template;

    @Autowired
    private my.utm.ip.userTable.service.userService userService;

    @RequestMapping("/")
    ModelAndView viewHome() {
        final List<String> result = new ArrayList<String>();
        result.add("It's working");
        ModelAndView mv = new ModelAndView("output");
        mv.addObject("title", "Home");
        mv.addObject("result", result);
        return mv;
    }

    @RequestMapping ("/jdbc-test")
    ModelAndView jdbcTest(){
    ModelAndView mv = new ModelAndView("output");
    final List<String> result = new ArrayList<String>();
    result.add((template!=null) ? "Passed":"Failed");
    mv.addObject("title", "Loading JDBC");
    result.add(template.toString());
    mv.addObject("result", result);
    return mv;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @PutMapping("/{userId}")
    public void updateUser(@PathVariable int userId, @RequestBody User user) {
        user.setUserId(userId);
        userService.updateUser(user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable int userId) {
        userService.deleteUser(userId);
    }
}