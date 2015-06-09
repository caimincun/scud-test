package cn.scud.user.service.impl;

import cn.scud.user.dao.UserDao;
import cn.scud.user.model.User;
import cn.scud.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cmc on 14-12-9.
 */
@Service("userService")
public class UserServiceImpl implements UserService {



    @Resource
    private UserDao userDao;


    @Override
    public void add(User user) {
        userDao.add(user);
    }

    // 级联查询
    @Override
    public List<User> findAll() {

        return userDao.selectAll();
    }
}
