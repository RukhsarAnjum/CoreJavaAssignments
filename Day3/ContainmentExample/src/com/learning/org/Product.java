package com.learning.org;

import java.util.Date;

public class Product{
    private String productName;
    private double productPrice;
    private Date manufacturingDate;

    public Product(){
        productName="";
        productPrice=0;
        manufacturingDate=new Date();
    }

    public Product(String productName, double productPrice, Date manufacturingDate) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.manufacturingDate = manufacturingDate;

    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }
}
