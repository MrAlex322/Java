package java_oop.HW_5.service;

import java.util.List;

import java_oop.HW_5.model.User;

public interface UserService {
     void saveUser(User user);

     void removeUser(User user);

     void updateUser(int index, User user);

     List<User> getUserList();
}
