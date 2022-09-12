package com.mycompany.insuranceSimulator;

import com.mycompany.insuranceSimulator.customer.Customer;
import com.mycompany.insuranceSimulator.qote.Questionnaire;

import java.io.IOException;

public class TestQuote {
    public static void main(String[] args) throws IOException {
        Questionnaire aQuestionnaire = new Questionnaire();
        Customer customer = aQuestionnaire.questionCustomer();

        if (customer.getContractType() == 1) {
            aQuestionnaire.quoteHome(customer);
        } else if (customer.getContractType() == 2) {
            System.out.println("Contrat assurance voiture");
        } else if (customer.getContractType() == 3) {
            System.out.println("Contrat assurance moto");
        }
    }
}
