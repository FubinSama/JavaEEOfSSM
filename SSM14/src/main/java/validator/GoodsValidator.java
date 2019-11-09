package validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import pojo.Goods;

import java.util.Date;

@Component
public class GoodsValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        //要验证的model，返回值为false则不验证
        return Goods.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Goods goods = (Goods) target; //要验证的对象
        //goods.name.required是错误消息属性文件中的编码（国际化后对应的是国际化的信息）
        ValidationUtils.rejectIfEmpty(errors, "name", "goods.name.required");
        ValidationUtils.rejectIfEmpty(errors, "description", "goods.description.required");
        if (goods.getPrice() > 100 || goods.getPrice() < 0) {
            errors.rejectValue("price", "price.invalid");
        }
        Date date =  goods.getDate();
        if (date != null && date.after(new Date())) {
            errors.rejectValue("date", "date.invalid");
        }
    }
}
