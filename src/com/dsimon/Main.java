package com.dsimon;

public class Main {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        myAccount.setAccountNumber(12345);
        myAccount.setBalance(12.23);
        myAccount.setCustomerName("Doug");
        myAccount.setEmail("doug@doug.com");
        myAccount.setPhoneNumber("123456789");
        
        myAccount.depositFunds(23.34);
        myAccount.withdrawFunds(10.00);
    }
}
