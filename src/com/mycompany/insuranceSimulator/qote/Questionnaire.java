package com.mycompany.insuranceSimulator.qote;

import com.mycompany.insuranceSimulator.contract.Home;
import com.mycompany.insuranceSimulator.customer.Customer;

import java.util.Scanner;


public class Questionnaire {
    char response;
    int resp;
    public Scanner input = new Scanner(System.in);

    public Customer questionCustomer() {

        Customer aCustomer = new Customer();
        System.out.println("Quel est votre nom?");
        aCustomer.setLastName(input.nextLine());

        System.out.println("Quel est votre prénom?");
        aCustomer.setFirstName(input.nextLine());

        System.out.println("Quel est votre date de naissance? (jj/mm/aaaa)");
        aCustomer.setDateOfBirth(input.nextLine());

        while (aCustomer.getMarried() == null) {
            System.out.println("Êtes-vous marié? (o/n)");
            response = input.next().charAt(0);
            if (response == 'o') {
                aCustomer.setMarried(true);
            } else if (response == 'n') {
                aCustomer.setMarried(false);
            }
        }
        while (aCustomer.getHasChildren() == null) {
            System.out.println("Avez-vous des enfants? (o/n)");
            response = input.next().charAt(0);
            if (response == 'o') {
                aCustomer.setHasChildren(true);
            } else if (response == 'n') {
                aCustomer.setHasChildren(false);
            }
        }
        while (aCustomer.getContractType() == null) {
            System.out.println("""
                    A quel type de contrat voulez-vous souscrire:
                    1: habitation
                    2: voiture
                    3: moto
                    """);
            aCustomer.setContractType(input.nextInt());
        }
        return aCustomer;
    }

    public void quoteHome(Customer customer) {
        Home home = new Home(customer);

        while (home.getHouseType() == null) {
            System.out.println("""
                    Quel type de logement avez-vous?
                    1- Maison
                    2- Appartement
                    """);
            resp = input.nextInt();
            if (resp == 1) {
                home.setHouseType("Maison");
            } else if (resp == 2) {
                home.setHouseType("Appartement");
            }
            while (home.getArea() == null) {
                System.out.println("Superficie de votre logement en m²");
                home.setArea(input.nextInt());
            }
            while (home.getHasGarage() == null) {
                System.out.println("Avez-vous un garage? (o/n)");
                response = input.next().charAt(0);
                if (response == 'o') {
                    home.setHasGarage(true);
                } else if (response == 'n') {
                    home.setHasGarage(false);
                }
            }
            while (home.getHousehold() == null) {
                System.out.println("De combien de personnes est composé votre foyer?");
                home.setHousehold(input.nextInt());
            }
            home.calculateRate();
            home.print();
        }
        input.close();
    }

}
