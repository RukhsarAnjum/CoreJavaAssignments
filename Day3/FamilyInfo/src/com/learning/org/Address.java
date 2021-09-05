package com.learning.org;

public class Address {
    private String state;
    private String city;
    private String area;
    private String buildingWithFlatNo;
    private long pinCode;

    public Address(){
        System.out.println("Default constructor of address is called");
        state=" ";
        city=" " ;
        area="";
        buildingWithFlatNo="";
        pinCode=0;
    }

    public Address(String state, String city, String area, String buildingWithFlatNo, long pinCode) {
        this.state = state;
        this.city = city;
        this.area = area;
        this.buildingWithFlatNo = buildingWithFlatNo;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", buildingWithFlatNo='" + buildingWithFlatNo + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
