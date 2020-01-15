package com.company;

public class VipCustomer {

    private String Name;
    private double CreditLimit;
    private String Email;

    public VipCustomer() {

    }

    public VipCustomer(String name,String email){
        this.Email = email;
        this.Name = name;
    }

    public VipCustomer(String name, int i, String email) {
        this.Name = name;
        this.CreditLimit = i;
        this.Email = email;
    }





}
