package com.company;

public class BankAccount {

        private int accNumber;
        private float Balance;
        String customerName;
        private long phNumber;
        String eMail;

    public BankAccount(float balance, String customerName, String eMail) {
        this(1234,balance,customerName,12345,eMail);
    }

    public  BankAccount(){
/*
            System.out.println("Constructor called");
*/
        }

        public BankAccount(int accNumber , float Balance , String customerName , long phNumber , String eMail){
/*
            System.out.println("Parameterised constructor called");
*/
            this.accNumber = accNumber;
            this.Balance = Balance;
            this.customerName = customerName;
            this.phNumber = phNumber;
            this.eMail = eMail;
        }




    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public float getBalance() {
        return Balance;
    }

    public void setBalance(float balance) {
        Balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(long phNumber) {
        this.phNumber = phNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void Deposit(double ammount){
        this.Balance = (float) (this.Balance + ammount);
    }

    public float Withdrawl(int amount){
        this.Balance = this.Balance - amount;
        if(this.Balance <= 0){
            return -1;
        }
        else {
            return this.getBalance();
        }
    }


}
