package cn.scud.user.controller;

import cn.scud.user.model.User;
import cn.scud.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

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
