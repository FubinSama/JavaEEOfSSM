package service;

import org.springframework.stereotype.Service;
import pojo.Goods2;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsService2Impl implements GoodsService2 {

    private static List<Goods2> goods = new ArrayList<>();

    @Override
    public boolean save(Goods2 g) {
        goods.add(g);
        return true;
    }

    @Override
    public List<Goods2> getGoods() {
        return goods;
    }
}
