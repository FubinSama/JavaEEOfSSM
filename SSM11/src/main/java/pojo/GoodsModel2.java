package pojo;

import java.util.Date;

public class GoodsModel2 {
    private String goodsName;
    private double goodsPrice;
    private int goodsNumber;
    private Date goodsDate;

    @Override
    public String toString() {
        return "GoodsModel2{" +
                "goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsNumber=" + goodsNumber +
                ", goodsDate=" + goodsDate +
                '}';
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(int goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Date getGoodsDate() {
        return goodsDate;
    }

    public void setGoodsDate(Date goodsDate) {
        this.goodsDate = goodsDate;
    }
}
