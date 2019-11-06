package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.GoodsModel;

@Controller
@RequestMapping("/my")
public class ConverterController {
    @RequestMapping("/converter")
    public String myConverter(@RequestParam("goods")GoodsModel gm, Model model){
        model.addAttribute("goods", gm);
        return "showGoods";
    }
}
