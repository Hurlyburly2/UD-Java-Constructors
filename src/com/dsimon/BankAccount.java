package com.dsimon;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("Your deposited $" + deposit + " and your current balance is: $" + this.balance);
    }

    public void withdrawFunds(double withdrawal) {
        if (this.balance - withdrawal >= 0) {
            this.balance -= withdrawal;
            System.out.println("You withdrew $" + withdrawal + " and your current balance is: $" + this.balance);
        } else {
            System.out.println("You do not have enough funds for that withdrawal");
        }
    }
}
