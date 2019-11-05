package controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpSession;

public class BaseController {
    //@ModelAttribute可以用来控制登录权限，因为被其注解的方法在每次调用该控制器的请求处理方法前都会被调用
    @ModelAttribute
    public void isLogin(HttpSession session) throws Exception{
        if (session.getAttribute("user") == null)
            throw new Exception("没有权限");
    }
}
