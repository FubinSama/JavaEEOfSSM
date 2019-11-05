package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/index")
public class IndexController {
    @RequestMapping("/login")
    public String login(HttpSession session, HttpServletRequest request){
        session.setAttribute("skey", "session范围的值");
        request.setAttribute("rkey", "request范围的值");
        return "login";
    }
    @RequestMapping("/register")
    public String register(Model model){
        //在视图中可以使用EL表达式${success}取出model中的值。
        model.addAttribute("success", "注册成功！");
        return "register";
    }

    @RequestMapping("/login2")
    public String login2(){
        //转发到一个请求方法，同一个控制器中可以省略/index/
        return "forward:/index/isLogin";
    }

    @RequestMapping("/isLogin")
    public String isLogin(){
        //重定向到一个请求方法
        return "redirect:/index/isRegister";
    }

    //注意：不管重定向还是转发，都必须符合视图解析器的配置，如果直接转发到一个不需要DispatcherServlet的资源，
    // 则必须配置<mvc:resources lication="" mapping="" />
    @RequestMapping("/isRegister")
    public String isRegister(){
        //转发到一个视图
        return "register";
    }
}
