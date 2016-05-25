package com.jordanwillis;

/**
 * Created by Jordan on 5/24/2016.
 */
public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;



    public BankAccount(){
        this(56789, 2.50, "Default name", "Default address", "default phone");

        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999, 100.55, customerName, email, phoneNumber);
    }

    // Code then generate then getter and setter then select all and it auto creates the getters/setters

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

//    public void depositToAccount(double deopsitAmount){
//        double newAmount = this.balance + deopsitAmount;
//        setBalance(newAmount);
//        System.out.println(this.balance);
//    }

    public  void depositToAccount(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + this.balance);
    }

//    public void withdrawalFromAccount(double withdrawalAmount){
//        if (withdrawalAmount > this.balance){
//            System.out.println("Not enough money in account");
//        } else {
//            double newAmount = this.balance - withdrawalAmount;
//            setBalance(newAmount);
//            System.out.println(this.balance);
//        }
//    }

    public void withdrawalFromAccount(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0){
            System.out.println("Only $" + this.balance + " available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed. Remaining balance = $" + this.balance);
        }
    }

    public void accountInfo(){
        System.out.println(this.customerName + " has an account number: " + this.accountNumber + ". The current balance is $" + this.balance + ".  The email on this account is " + this.email + " and the phone number is " + this.phoneNumber + ".");
    }
}
