package cn.scud.main.user.controller;

import cn.scud.commoms.response.ListSucRes;
import cn.scud.main.user.model.User;
import cn.scud.main.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmc on 14-12-9.
 */
//@RestController
@Controller
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 添加用户
     * @param user
     * @return
     */
    @RequestMapping(value="/user/add",method = RequestMethod.POST)
    public String addUser(User user){
        System.out.println("user:"+user);
       userService.add(user);
        return "success";
    }
    @ResponseBody
    @RequestMapping(value="/user/json")
    public ListSucRes testJson(User user)
    {
//        return new SuccessJsonRes();
        List<User> users = new ArrayList<User>();
        User user1 = new User();
        user1.setName("name1");
        user1.setPassword("pwd1");
        User user2 = new User();
        user2.setName("name2");
        user.setPassword("pwd");
        users.add(user1);
        users.add(user2);
        ListSucRes list = new ListSucRes();
        list.setData(users);
        return list;
    }


    @RequestMapping(value="/user/add2")
    public ModelAndView addUser2(User user){
        System.out.println("user:"+user);
        userService.add(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("success");
        return modelAndView;

    }




}
