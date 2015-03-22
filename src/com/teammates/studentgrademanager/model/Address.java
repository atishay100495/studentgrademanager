package com.teammates.studentgrademanager.model;

public class Address {
    public Address() {
        super();
    }

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String pincode;

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPincode() {
        return pincode;
    }

    public String toString() {
        String address = addressLine1 + "\n" +
            addressLine2 + "\n" +
            city + "\n" +
            state + "\n" +
            pincode + "\n";
        return address;
    }
}
