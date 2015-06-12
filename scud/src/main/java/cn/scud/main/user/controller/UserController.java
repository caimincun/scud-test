package cn.scud.main.user.controller;

import cn.scud.commoms.response.ListSucRes;
import cn.scud.main.user.model.User;
import cn.scud.main.user.service.UserService;
import cn.scud.utils.WebUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
    public String addUser(User user,HttpServletRequest request){
        // 判断手机号码是否被注册
        String ip = WebUtil.getRemoteHost(request);
        user.setLastLoginIp(ip);
        userService.addUser(user);
        return "success";
    }



}
