package cn.scud.main.user.controller;

import cn.scud.commoms.response.*;
import cn.scud.main.user.model.User;
import cn.scud.main.user.service.UserService;
import cn.scud.utils.JsonSerializer;
import cn.scud.utils.StreamSerializer;
import cn.scud.utils.WebUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
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
    @RequestMapping(value="/user/add")
    @ResponseBody
    public OperatorResponse addUser(HttpServletRequest request) throws Exception {
        User user =  StreamSerializer.streamSerializer(request.getInputStream(), User.class);
        String ip = WebUtil.getRemoteHost(request);
        user.setLastLoginIp(ip);
        userService.addUser(user);
        System.out.println("user"+user);
        GetObjSucRes objSucRes = new GetObjSucRes();
        objSucRes.setData(user);
        return objSucRes;
    }

    @RequestMapping(value="/index")
    public String index(HttpServletRequest request, HttpServletResponse response){
        return "index";
    }

    @RequestMapping("/select")
    @ResponseBody
    public OperatorResponse selectAll(){
        System.out.println(userService.findAll());
        return new SuccessJsonRes();
    }


}
