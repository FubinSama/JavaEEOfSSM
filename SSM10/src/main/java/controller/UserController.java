package controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pojo.UserForm;
import service.UserService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    private static final Log logger = LogFactory.getLog(UserController.class);

    @RequestMapping("/login")
    public String login(UserForm user, HttpSession session, Model model) {
        if ("wfb".equals(user.getUname()) && "123456".equals(user.getUpass())) {
            session.setAttribute("u", user);
            logger.info("成功！");
            return "main";
        } else {
            logger.info("失败！");
            model.addAttribute("messageError", "用户名或密码错误");
            return "login";
        }
    }

    @RequestMapping("/register")
    public String register(UserForm user, Model model) {
        if ("wfb".equals(user.getUname()) && "123456".equals(user.getUpass())) {
            logger.info("成功！");
            return "main";
        } else {
            logger.info("失败！");
            model.addAttribute("uname", user.getUname());
            return "register";
        }
    }

    @RequestMapping(value = "/register4/{uname}/{upass}", method = RequestMethod.GET)
    public String register4(@PathVariable String uname, @PathVariable String upass, Model model) {
        if ("wfb".equals(uname) && "123456".equals(upass)) {
            logger.info("成功！");
            return "main";
        } else {
            logger.info("失败！");
            model.addAttribute("uname", uname);
            return "register";
        }
    }

    //RequestParam标记后，如果请求参数与接收参数名不一致则报404错误，不加该注解则不会报错
    @RequestMapping(value = "/register2")
    public String register2(@RequestParam String uname, @RequestParam String upass, Model model) {
        if ("wfb".equals(uname) && "123456".equals(upass)) {
            logger.info("成功！！");
            return "main";
        } else {
            logger.info("失败！！");
            model.addAttribute("uname", uname);
            return "register";
        }
    }

    //@ModelAttribute("user") 相当于model.addAttribute("user", user);
    @RequestMapping("/register3")
    public String register3(@ModelAttribute("user") UserForm user) {
        if ("wfb".equals(user.getUname()) && "123456".equals(user.getUpass())) {
            logger.info("成功！");
            return "main";
        } else {
            logger.info("失败！");
            return "register";
        }
    }

    @Autowired
    private UserService userService;
    @RequestMapping("/login5")
    public String login5(UserForm user, HttpSession session, Model model) {
        if (userService.login(user)) {
            session.setAttribute("u", user);
            logger.info("成功！");
            return "main";
        } else {
            logger.info("失败！");
            model.addAttribute("messageError", "用户名或密码错误");
            return "login";
        }
    }


}
