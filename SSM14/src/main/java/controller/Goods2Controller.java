package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Goods2;
import service.GoodsService2;

import javax.validation.Valid;

@Controller
@RequestMapping("/goods2")
public class Goods2Controller {
    private static final Log log = LogFactory.getLog(Goods2Controller.class);

    @Autowired
    private GoodsService2 goodsService;

    @RequestMapping("/input")
    public String input(Model model) {
        model.addAttribute("goods", new Goods2());
        return "addGoods2";
    }

    @RequestMapping("/save")  //注意这里有个@Valid标签，表示用JSR303验证该model
    public String save(@Valid @ModelAttribute("goods") Goods2 goods, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addGoods2";
        }
        goodsService.save(goods);
        log.info("添加成功！");
        model.addAttribute("goodsList", goodsService.getGoods());
        return "goods2List";
    }
}
