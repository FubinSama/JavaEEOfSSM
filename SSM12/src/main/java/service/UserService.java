package service;

import pojo.User;

import java.util.List;

public interface UserService {
    boolean addUser(User u);
    List<User> getUsers();
}
