package com.mycompany.insuranceSimulator;

import com.mycompany.insuranceSimulator.customer.Customer;
import com.mycompany.insuranceSimulator.qote.Questionnaire;


public class TestQuote {
    public static void main(String[] args){
        Questionnaire questionnaire = new Questionnaire();
        Customer customer = questionnaire.questionCustomer();

        if (customer.getContractType() == 1) {
            questionnaire.quoteHome(customer);
        } else if (customer.getContractType() == 2) {
            System.out.println("Contrat assurance voiture");
        } else if (customer.getContractType() == 3) {
            System.out.println("Contrat assurance moto");
        }
    }
}
