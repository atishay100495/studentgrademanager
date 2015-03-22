package com.teammates.studentgrademanager.model;

public class PhoneNumber {
    public PhoneNumber() {
        super();
    }

    private String countryCode;
    private String phonenumber;

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    @Override
    public String toString() {
        return countryCode + "-" + phonenumber;
    }
}
