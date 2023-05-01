package java_oop.HW_5.service;

import java.util.List;

import java_oop.HW_5.model.User;
import java_oop.HW_5.repository.UserRepository;

public class UserServicelmpl implements UserService {

    @Override
    public void saveUser(User user) {
        if (user == null) {
            System.out.println("User is null!");
        }

        UserRepository.saveUser(user);

    }

    @Override
    public void removeUser(User user) {
        if (user != null) {
            UserRepository.removeUser(user);
        } else {
            System.out.println("User is null!");
        }
    }

    @Override
    public void updateUser(int index, User user) {
        if (user != null) {
            UserRepository.updateUser(index, user);
        } else {
            System.out.println("User is null!");
        }
    }

    @Override
    public List<User> getUserList() {
        return UserRepository.getUserList();
    }
}
