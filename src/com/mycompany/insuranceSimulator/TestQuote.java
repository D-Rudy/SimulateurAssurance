package com.mycompany.insuranceSimulator;

import com.mycompany.insuranceSimulator.customer.Customer;
import com.mycompany.insuranceSimulator.qote.Questionnaire;

public class TestQuote {
    public static void main(String[] args){
        Questionnaire aQuestionnaire = new Questionnaire();
        Customer customer = aQuestionnaire.questionCustomer();
        System.out.println(customer.toString());
    }
}
