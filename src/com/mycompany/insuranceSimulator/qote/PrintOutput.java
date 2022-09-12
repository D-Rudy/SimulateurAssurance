package com.mycompany.insuranceSimulator.qote;

import com.mycompany.insuranceSimulator.customer.Customer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class PrintOutput {
    private final Customer CUSTOMER;
    private final Double AMOUNT;
    protected String destination;

    public PrintOutput(Customer CUSTOMER, Double amount) {
        this.CUSTOMER = CUSTOMER;
        this.AMOUNT = amount;
    }

    public void testBufferedWriter(String destination) {
        this.destination = destination;
        processing();
    }

    private void processing() {
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter(destination));
            if(CUSTOMER.getContractType() == 1){
                file.write("""
                                  +----------------------------+
                                  | DEVIS ASSURANCE HABITATION |
                                  +----------------------------+
                        """);
                file.newLine();
            }
            file.write("Nom: " + CUSTOMER.getLastName());
            file.newLine();
            file.write("Prénom: " + CUSTOMER.getFirstName());
            file.newLine();
            file.write("Le tarif à payer pour l'assurance ");
            if(CUSTOMER.getContractType() == 1){
                file.write("habitation");
            }
            file.write(" est de " + AMOUNT);
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
