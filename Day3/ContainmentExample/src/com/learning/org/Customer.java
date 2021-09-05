package com.learning.org;

public class Customer {
    private String cId;
    private String cName;
    private String cAddress;
    private long mobileNo;
    private Product product;


    public Customer(){
        System.out.println("Default constructor of customer is called");
        cId="";
        cName="";
        cAddress="";
        mobileNo=0;
        product=new Product();

    }

    public Customer(String cId, String cName, String cAddress,long mobileNo,Product product) {
        System.out.println("Parameterised constructor of customer is called");
        this.cId = cId;
        this.cName = cName;
        this.cAddress = cAddress;
        this.mobileNo = mobileNo;
        this.product=product;
    }

    public String getCId() {
        return cId;
    }

    public void setCId(String cId) {
        this.cId = cId;
    }

    public String getCName() {
        return cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    public String getCAddress() {
        return cAddress;
    }

    public void setCAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", cAddress='" + cAddress + '\'' +
                ", mobileNo=" + mobileNo +
                ", product=" + product +
                '}';
    }
}
