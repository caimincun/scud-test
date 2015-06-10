package cn.scud.main.user.model;

import cn.scud.commoms.response.AbstractJsonRes;
import cn.scud.commoms.response.SuccessJsonRes;
import cn.scud.main.user.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by cmc on 14-12-9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserTest {

    //    private static Log logger = LogFactory.getLog(UserTest.class.getClass());
    static Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
//static Logger logger = LogManager.getLogger(UserTest.class.getClass());// 似乎是传递的类的名称有问题

    /**
     * 日志功能测试测试
     */
    @Test
    public void testLog(){

        User user=new User();
        user.setId(4);
        user.setName("cmc");
        user.setPassword("123456");

        //  记录 debug 级别的信息

        logger.debug("This log message leavel.debug:"+user);

        //  记录 info 级别的信息

        logger.info("This log message leavel.info:"+user);

        //  记录 error 级别的信息

        logger.error("This log message leavel.error:"+user);

        userService.add(user);

    }


    @Autowired
    private UserService userService;


    /**
     * 简单的springmvc mybatis junit 插入测试
     */
    @Test
    public void addUser(){
        try {
            User user=new User();
            user.setId(2);
            user.setName("cmc");
            user.setPassword("123456");
            userService.add(user);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("测试成功");

    }

    /**
     * 数据转换异常拦截处理测试
     */
    @Test
    public void testNumberFormatException() {
        //这里就会发生NumberFormatException，然后就会返回定义在SpringMVC配置文件中的number视图
//        Integer.parseInt("abc");
    }

    /**
     * 测试返回json
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/user/json")
    public AbstractJsonRes testJson(User user)
    {
        return new SuccessJsonRes();
    }

    /**
     * 测试返回 json List<Date></>
     * @param user
     * @return
     */
//    @ResponseBody
//    @RequestMapping(value="/user/json")
//    public ListSucRes testJson(User user)
//    {
////        return new SuccessJsonRes();
//        List<User> users = new ArrayList<User>();
//        User user1 = new User();
//        user1.setName("name1");
//        user1.setPassword("pwd1");
//        User user2 = new User();
//        user2.setName("name2");
//        user.setPassword("pwd");
//        users.add(user1);
//        users.add(user2);
//        ListSucRes list = new ListSucRes();
//        list.setData(users);
//        return list;
//    }
}
