package service;

import pojo.Goods;

import java.util.List;

public interface GoodsService {
    boolean save(Goods g);
    List<Goods> getGoods();
}
