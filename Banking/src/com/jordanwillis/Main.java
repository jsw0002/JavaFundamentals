package com.jordanwillis;

public class Main {

    public static void main(String[] args) {
        // Your job is to create a simple banking application.
        // There should be a Bank class
        // It should have an ArrayList of Branches
        // Each Branch should have an ArrayList of Doubles (transactions)
        // Customer:
        // Name and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("National City Bank");
        if (bank.addBranch("Indianapolis")){
            System.out.println("Indianapolis branch created");
        }

        bank.addCustomer("Indianapolis", "Jordan", 5000.36);
        bank.addCustomer("Indianapolis", "Mike", 175.34);
        bank.addCustomer("Indianapolis", "Percy", 220.12);

        bank.addBranch("Fishers");
        bank.addCustomer("Fishers", "Bob", 15.54);

        bank.addCustomerTranaction("Indianapolis", "Jordan", 253.52);
        bank.addCustomerTranaction("Indianapolis", "Jordan", 25.22);
        bank.addCustomerTranaction("Indianapolis", "Mike", 23.72);

        bank.listCustomers("Indianapolis", true);
        bank.listCustomers("Fishers", true);

        bank.addBranch("Carmel");

        if (!bank.addCustomer("Carmel", "Brian", 5.53)){
            System.out.println("Error Carmel branch does not exist");
        }

        if (!bank.addBranch("Fishers")){
            System.out.println("Fishers branch already exists");
        }

        if (!bank.addCustomerTranaction("Indianapolis", "Fergus", 52.33)){
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Fishers", "Bob", 52.36)){
            System.out.println("Customer Bob already exists");
        }
    }
}
