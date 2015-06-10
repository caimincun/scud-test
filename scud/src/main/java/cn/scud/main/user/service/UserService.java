package cn.scud.main.user.service;


import cn.scud.main.user.model.User;

import java.util.List;

/**
 * Created by cmc on 14-12-9.
 */

public interface UserService {

    void add(User user);

    List<User> findAll();

}
