package com.mycompany.insuranceSimulator.contract;

import com.mycompany.insuranceSimulator.customer.Customer;

public abstract class Contract {
    private Customer customer;
    private Integer contractType;
    private Float rate;
    private final double [] TAB_MAJORATION = new double[]{1, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6};

    public abstract Float calculateRate();
    public abstract void print();

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getContractType() {
        return contractType;
    }

    public void setContractType(Integer contractType) {
        this.contractType = contractType;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Contract {" +
                "Client:  " + customer +
                ", Type de contrat: " + contractType +
                ", tarif: " + rate +
                '}';
    }
}
