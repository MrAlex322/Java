package java_oop.HW_5.controller;

import java.util.List;

import java_oop.HW_5.model.User;
import java_oop.HW_5.service.UserService;
import java_oop.HW_5.service.UserServicelmpl;

public class UserController {
    private UserService userService = new UserServicelmpl();

    public void saveUser(String name, int age) {
        userService.saveUser(new User(name, age));
    }

    public void removeUser(User user) {
        userService.removeUser(user);
    }

    public void updateUser(int index, User user) {
        userService.updateUser(index, user);
    }

    public List<User> getUserList() {
        return userService.getUserList();
    }
}
