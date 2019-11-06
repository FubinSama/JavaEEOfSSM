package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.User;
import service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    private static final Log log = LogFactory.getLog(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/input")
    public String inputUser(Model model){
        modelCreate(model);
        return "userAdd";
    }

    @RequestMapping("/save")
    public String adduser(@ModelAttribute User user, Model model) {
        if (userService.addUser(user)) {
            log.info("成功");
            return "redirect:/user/list";
        } else {
            modelCreate(model);
            return "userAdd";
        }
    }

    @RequestMapping("/list")
    public String listUsers(Model model) {
        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "userList";
    }

    private void modelCreate(Model model) {
        Map<String, String> hobbys = new HashMap<>();
        hobbys.put("篮球", "篮球");
        hobbys.put("兵乓球", "兵乓球");
        hobbys.put("电玩", "电玩");
        hobbys.put("游泳", "游泳");
        model.addAttribute("user", new User());
        model.addAttribute("hobbys", hobbys);
        model.addAttribute("careers", new String[]{"教师", "学生", "coding搬运工", "IT民工", "其他"});
        model.addAttribute("houseRegisters", new String[]{"北京", "上海", "广州", "深圳", "其他"});
    }
}
