package com.zhch.demo04;


public class Item {
    // 如果去掉getter setter,属性改成public，　是不行的．那样属性都不会赋值．
    private String from;
    private int count;
    private double price;
    private String addr;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{from:" + from + ", count:" + count + ", price:" + price + "}";
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
