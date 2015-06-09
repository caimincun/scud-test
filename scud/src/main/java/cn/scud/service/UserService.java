package cn.scud.service;


import cn.scud.model.User;

import java.util.List;

/**
 * Created by cmc on 14-12-9.
 */

public interface UserService {

    void add(User user);

    List<User> findAll();

}
