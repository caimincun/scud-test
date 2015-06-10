package cn.scud.main.user.dao;


import cn.scud.main.user.model.User;

import java.util.List;

/**
 * Created by cmc on 14-12-9.
 */
public interface UserDao {
    void add(User user);
    List<User> selectAll();
}
