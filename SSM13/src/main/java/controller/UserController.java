package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.User;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @RequestMapping("/toLogin")
    public String initLogin() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(User user, Model model, HttpSession session) {
        System.out.println(user.getName());
        if ("wfb".equals(user.getName()) && "123456".equals(user.getPwd())){
            session.setAttribute("user", user);
            return "redirect:main";
        }
        model.addAttribute("msg", "用户名或密码错误，请重新登录！");
        return "login";
    }

    @RequestMapping("/main")
    public String toMain(){
        return "main";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "login";
    }
}
