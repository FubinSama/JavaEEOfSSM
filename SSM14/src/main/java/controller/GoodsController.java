package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Goods;
import service.GoodsService;

import javax.annotation.Resource;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    private static final Log log = LogFactory.getLog(GoodsController.class);

    @Autowired
    private GoodsService goodsService;

    @Resource
    private Validator validator;

    @RequestMapping("/input")
    public String input(Model model) {
        model.addAttribute("goods", new Goods());
        return "addGoods";
    }

    @RequestMapping("/save")
    public String save(@ModelAttribute Goods goods, BindingResult result, Model model) {
        this.validator.validate(goods, result);
        if (result.hasErrors()) {
            return "addGoods";
        }
        goodsService.save(goods);
        log.info("添加成功！");
        model.addAttribute("goodsList", goodsService.getGoods());
        return "goodsList";
    }
}
