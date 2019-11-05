package service;

import org.springframework.stereotype.Service;
import pojo.UserForm;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean login(UserForm user) {
        if ("wfb".equals(user.getUname()) && "123456".equals(user.getUpass())) return true;
        else return false;
    }

    @Override
    public boolean register(UserForm user) {
        if ("wfb".equals(user.getUname()) && "123456".equals(user.getUpass())) return true;
        else return false;
    }
}
