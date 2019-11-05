package com.po;

import java.util.List;

public class Orders2 {
    private Integer id;
    private String ordersn;
    private List<Product> products;

    @Override
    public String toString() {
        return "Orders2{" +
                "id=" + id +
                ", ordersn='" + ordersn + '\'' +
                ", products=" + products +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdersn() {
        return ordersn;
    }

    public void setOrdersn(String ordersn) {
        this.ordersn = ordersn;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
