package com.dsimon;

public class Main {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        myAccount.setAccountNumber("12345");
        myAccount.setBalance(12.23);
        myAccount.setCustomerName("Doug");
        myAccount.setEmail("doug@doug.com");
        myAccount.setPhoneNumber("123456789");
        
        myAccount.depositFunds(23.34);
        myAccount.withdrawFunds(10.00);

        BankAccount bobsAccount = new BankAccount("12345", 0.00, "Bob Brown", "myemail@bob.com", "123456789");
        bobsAccount.withdrawFunds(100.0);

        bobsAccount.depositFunds(50.0);
        bobsAccount.withdrawFunds(100.0);

        bobsAccount.depositFunds(51.0);
        bobsAccount.withdrawFunds(100.0);

        BankAccount dougsAccount = new BankAccount("Doug", "doug@doug.com", "12345");
        System.out.println(dougsAccount.getAccountNumber() + " name " + dougsAccount.getCustomerName());

        VipCustomer newCustomer = new VipCustomer();
        System.out.println("name: " + newCustomer.getName() + " email: " + newCustomer.getEmail() + " credit limit: " + newCustomer.getCreditLimit());

        VipCustomer newCustomerTwo = new VipCustomer("Bob", "Bob@Bob.com");
        System.out.println("name: " + newCustomerTwo.getName() + " email: " + newCustomerTwo.getEmail() + " credit limit: " + newCustomerTwo.getCreditLimit());

        VipCustomer newCustomerThree = new VipCustomer("Doug", 1000.00, "Doug@doug.com");
        System.out.println("name: " + newCustomerThree.getName() + " email: " + newCustomerThree.getEmail() + " credit limit: " + newCustomerThree.getCreditLimit());
    }
}
