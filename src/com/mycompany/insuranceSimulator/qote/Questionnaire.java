package com.mycompany.insuranceSimulator.qote;

import com.mycompany.insuranceSimulator.customer.Customer;

import java.util.Scanner;



public class Questionnaire {
    private Integer type;
    private char response;
   // private char hasChild;
    public Scanner input = new Scanner(System.in);

    public Customer questionCustomer(){

        Customer aCustomer = new Customer();
        System.out.println("Quel est votre nom?");
        aCustomer.setLastName(input.nextLine());

        System.out.println("Quel est votre prénom?");
        aCustomer.setFirstName(input.nextLine());

        System.out.println("Quel est votre date de naissance?");
        aCustomer.setDateOfBirth(input.nextLine());

        System.out.println("Êtes-vous marié");
        response = input.next().charAt(0);
        if(response == 'o'){
            aCustomer.setMarried(true);
        }
        else if (response == 'n'){
            aCustomer.setMarried(false);
        }
        System.out.println("Avez-vous des enfants");
        response = input.next().charAt(0);
        if(response == 'o'){
            aCustomer.setHasChildren(true);
        }
        else if (response == 'n'){
            aCustomer.setHasChildren(false);
        }

    return aCustomer;
    }


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }



    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

}
