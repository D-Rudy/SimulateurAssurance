package com.mycompany.insuranceSimulator.qote;

import com.mycompany.insuranceSimulator.customer.Customer;

import java.util.Scanner;



public class Questionnaire {
    private Integer type;
    private char isMarried;
    private char hasChild;

    public Scanner input = new Scanner(System.in);
    public Customer questionCustomer(){
    Customer aCustomer = new Customer();

    return aCustomer;
    }


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public char getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(char isMarried) {
        this.isMarried = isMarried;
    }

    public char getHasChild() {
        return hasChild;
    }

    public void setHasChild(char hasChild) {
        this.hasChild = hasChild;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "type=" + type +
                ", isMarried=" + isMarried +
                ", hasChild=" + hasChild +
                ", input=" + input +
                '}';
    }
}
