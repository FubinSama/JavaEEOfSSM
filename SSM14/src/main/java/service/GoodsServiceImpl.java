package service;

import org.springframework.stereotype.Service;
import pojo.Goods;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    private static List<Goods> goods = new ArrayList<>();

    @Override
    public boolean save(Goods g) {
        goods.add(g);
        return true;
    }

    @Override
    public List<Goods> getGoods() {
        return goods;
    }
}
