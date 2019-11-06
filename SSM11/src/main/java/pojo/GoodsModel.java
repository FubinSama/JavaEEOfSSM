package pojo;

public class GoodsModel {
    private String goodsName;
    private double goodsPrice;
    private int goodsNumber;

    @Override
    public String toString() {
        return "GoodsModel{" +
                "goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsNumber=" + goodsNumber +
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
}
