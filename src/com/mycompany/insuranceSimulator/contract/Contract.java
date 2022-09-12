package com.mycompany.insuranceSimulator.contract;

import com.mycompany.insuranceSimulator.customer.Customer;

import java.io.IOException;

public abstract class Contract {
    private Customer customer;
    private Double rate;
    private final double[] TAB_MAJORATION = new double[]{1, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6};

    //public abstract void calculateRate(Home home);
    public abstract void calculateRate();

    public abstract void print() throws IOException;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public double[] getTAB_MAJORATION() {
        return TAB_MAJORATION;
    }

    @Override
    public String toString() {
        return "Contract {" +
                "Client:  " + customer +
                ", Tarif: " + rate +
                '}';
    }
}
