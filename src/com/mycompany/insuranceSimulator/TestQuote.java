package com.mycompany.insuranceSimulator;

import com.mycompany.insuranceSimulator.customer.Customer;
import com.mycompany.insuranceSimulator.qote.Questionnaire;

public class TestQuote {
    public static void main(String[] args){
        Questionnaire aQuestionnaire = new Questionnaire();
        Customer customer = aQuestionnaire.questionCustomer();
        System.out.println(customer.toString());

        if (customer.getContractType()==1){
            System.out.println("Contrat assurance habitation");
        }
        else if(customer.getContractType() == 2){
            System.out.println("Contrat assurance voiture");
        }
        else if (customer.getContractType() == 3){
            System.out.println("Contrat assurance moto");
        }
    }
}
