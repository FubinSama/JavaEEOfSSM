package converter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.convert.converter.Converter;
import pojo.GoodsModel;

import java.util.Arrays;

public class GoodsConverter implements Converter<String, GoodsModel> {
    private final Log log = LogFactory.getLog(GoodsConverter.class);
    @Override
    public GoodsModel convert(String source) {
        GoodsModel goods = new GoodsModel();
        log.info(goods);
        String[] stringValues = source.split(",");
        if (stringValues != null && stringValues.length == 3) {
            goods.setGoodsName(stringValues[0]);
            goods.setGoodsPrice(Double.parseDouble(stringValues[1]));
            goods.setGoodsNumber(Integer.parseInt(stringValues[2]));
            return goods;
        } else {
            throw  new IllegalStateException(
                    String.format("类型转换失败，需要格式‘apple,10.58,200’，但格式[%s]", source));
        }
    }
}
