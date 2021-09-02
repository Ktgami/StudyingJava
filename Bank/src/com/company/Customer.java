package com.company;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTrans) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialTrans);
    }

    public void addTransaction(double trans) {
        this.transactions.add(trans);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}