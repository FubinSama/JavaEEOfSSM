package service;

import org.springframework.stereotype.Service;
import pojo.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static List<User> users = new ArrayList<>();

    @Override
    public boolean addUser(User u) {
        if (!"IT民工".equals(u.getCareer())) {
            users.add(u);
            return true;
        }
        return false;
    }

    @Override
    public List<User> getUsers() {
        return users;
    }
}
