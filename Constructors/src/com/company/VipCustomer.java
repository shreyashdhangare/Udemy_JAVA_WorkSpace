package com.company;

public class VipCustomer {
    private String Name;
    private double CreditLimit;
    private String Email;

    public VipCustomer(){
        System.out.println("SIMPLE CONSTRUCTOR");
    }


    public VipCustomer(String name, int i, String email) {
        this.Name = name;
        this.CreditLimit = i;
        this.Email = email;
    }




}
