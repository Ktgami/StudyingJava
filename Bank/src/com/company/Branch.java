package com.company;

import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customers;
    private String name;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }



    public boolean addCustomerTransaction(String customerName, double trans) {
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(trans);
            return true;
        }
        return false;
    }

    public boolean newCustomer(String name, double initialTransaction) {
        if (findCustomer(name) == null) {
            Customer newCustomer = new Customer(name, initialTransaction);
            this.customers.add(newCustomer);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for(int i = 0; i<this.customers.size(); i++) {
            if (this.customers.get(i).getName().equals(customerName)) {
                return this.customers.get(i);
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}