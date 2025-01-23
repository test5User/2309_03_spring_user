package by.itclass.model.services.imp;

import by.itclass.model.dao.UserDao;
import by.itclass.model.entities.User;
import by.itclass.model.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private UserDao dao;

    @Autowired
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public List<User> getAllUsers() {
        return dao.selectAllUsers();
    }
}
