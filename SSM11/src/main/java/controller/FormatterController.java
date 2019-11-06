package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.GoodsModel2;

@Controller
@RequestMapping("/my")
public class FormatterController {
    @RequestMapping("/formatter")
    public String myConverter(GoodsModel2 gm, Model model) {
        model.addAttribute("goods", gm);
        return "showGoods2";
    }
}
