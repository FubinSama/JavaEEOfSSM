package service;

import pojo.Goods2;

import java.util.List;

public interface GoodsService2 {
    boolean save(Goods2 g);
    List<Goods2> getGoods();
}
