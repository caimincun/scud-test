package cn.scud.user.dao;


import cn.scud.user.model.User;

import java.util.List;

/**
 * Created by cmc on 14-12-9.
 */
public interface UserDao {
    void add(User user);
    List<User> selectAll();
}
