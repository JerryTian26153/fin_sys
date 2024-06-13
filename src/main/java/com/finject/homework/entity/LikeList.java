package com.finject.homework.entity;

public class LikeList {
    private long SN;
    private int OrderName;
    private String Account;
    private long TotalFee;
    private long TotalAmount;
    public long getSN() {
        return SN;
    }
    public void setSN(long sN) {
        SN = sN;
    }
    public int getOrderName() {
        return OrderName;
    }
    public void setOrderName(int orderName) {
        OrderName = orderName;
    }
    public String getAccount() {
        return Account;
    }
    public void setAccount(String account) {
        Account = account;
    }
    public long getTotalFee() {
        return TotalFee;
    }
    public void setTotalFee(long totalFee) {
        TotalFee = totalFee;
    }
    public long getTotalAmount() {
        return TotalAmount;
    }
    public void setTotalAmount(long totalAmount) {
        TotalAmount = totalAmount;
    }
    
}
