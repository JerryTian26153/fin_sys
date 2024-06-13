package com.finject.homework.entity;

public class Product {
    private long No;
    private String ProductName;
    private int Price;
    private double FeeRate;
    public long getNo() {
        return No;
    }
    public void setNo(long no) {
        No = no;
    }
    public String getProductName() {
        return ProductName;
    }
    public void setProductName(String productName) {
        ProductName = productName;
    }
    public int getPrice() {
        return Price;
    }
    public void setPrice(int price) {
        Price = price;
    }
    public double getFeeRate() {
        return FeeRate;
    }
    public void setFeeRate(double feeRate) {
        FeeRate = feeRate;
    }
    
}
