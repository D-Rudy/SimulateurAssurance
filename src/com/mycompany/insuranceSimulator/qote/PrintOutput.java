package com.mycompany.insuranceSimulator.qote;

import com.mycompany.insuranceSimulator.contract.Home;
import com.mycompany.insuranceSimulator.customer.Customer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class PrintOutput {
    private Customer customer;
    private Double amount;
    protected String destination;

    public PrintOutput(Customer customer, Double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public void testBufferedWriter(String destination) {
        this.destination = destination;
        processing();
    }

    private void processing() {
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter(destination));
            if(customer.getContractType() == 1){
                file.write("""
                                  +----------------------------+
                                  | DEVIS ASSURANCE HABITATION |
                                  +----------------------------+
                        """);
                file.newLine();
            }
            file.write("Nom: " + customer.getLastName());
            file.newLine();
            file.write("Prénom: " + customer.getFirstName());
            file.newLine();
            file.write("Le tarif à payer pour l'assurance ");
            if(customer.getContractType() == 1){
                file.write("habitation");
            }
            file.write(" est de " + amount);
            file.newLine();
            file.write("""
                    Veuillez joindre:
                    - Le contrat de location,
                    - Un RIB,
                    - Carte d'identité de l'assuré.
                    """);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
