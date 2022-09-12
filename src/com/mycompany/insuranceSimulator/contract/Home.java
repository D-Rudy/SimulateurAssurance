package com.mycompany.insuranceSimulator.contract;

import com.mycompany.insuranceSimulator.customer.Customer;
import com.mycompany.insuranceSimulator.qote.PrintOutput;

public class Home extends Contract {

    private String houseType;
    private Integer area;
    private Boolean hasGarage;
    private Integer household;
    //private Customer customer;

    @Override
    public void calculateRate() {
        //Tarif de base est de 15€
        double amount = 15.0;

        //Calculer la majoration surface
        if (getArea() >= 10 && getArea() <= 50) {
            amount = amount * super.getTAB_MAJORATION()[0];
        }
        if (getArea() >= 51 && getArea() <= 60) {
            amount = amount * super.getTAB_MAJORATION()[1];
        }
        if (getArea() >= 61 && getArea() <= 70) {
            amount = amount * super.getTAB_MAJORATION()[2];
        }
        if (getArea() >= 71 && getArea() <= 80) {
            amount = amount * super.getTAB_MAJORATION()[3];
        }
        if (getArea() >= 81 && getArea() <= 90) {
            amount = amount * super.getTAB_MAJORATION()[4];
        }
        if (getArea() >= 91 && getArea() <= 100) {
            amount = amount * super.getTAB_MAJORATION()[5];
        }
        if (getArea() > 100) {
            amount = amount * super.getTAB_MAJORATION()[6];
        }

        //Calculer la majoration garage
        if (getHasGarage()) {
            if (getArea() >= 10 && getArea() <= 50) {
                amount = amount + 0;
            }
            if (getArea() >= 51 && getArea() <= 60) {
                amount = amount + 1;
            }
            if (getArea() >= 61 && getArea() <= 70) {
                amount = amount + 2;
            }
            if (getArea() >= 71 && getArea() <= 80) {
                amount = amount + 3;
            }
            if (getArea() >= 81 && getArea() <= 90) {
                amount = amount + 4;
            }
            if (getArea() >= 91 && getArea() <= 100) {
                amount = amount + 5;
            }
            if (getArea() > 100) {
                amount = amount + 6;
            }
        }

        //Calculer la majoration foyer
        if (getHousehold() > 7) {
            amount = amount + 7;
        }

        amount = switch (getHousehold()) {
            case 1 -> amount + 0;
            case 2 -> amount + 2;
            case 3 -> amount + 3;
            case 4 -> amount + 4;
            case 5 -> amount + 5;
            case 6 -> amount + 6;
            case 7 -> amount + 7;
            default -> amount;
        };
        super.setRate(amount);
        System.out.println(getRate());
    }

    @Override
    public void print() {
        PrintOutput printOutput = new PrintOutput(super.getCustomer(), super.getRate());
        printOutput.testBufferedWriter("devis_habitation_"+ super.getCustomer().getLastName()+"_"+super.getCustomer().getFirstName()+".txt");
    }

    public Home(Customer customer) {
        super.setCustomer(customer);

    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Boolean getHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(Boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public Integer getHousehold() {
        return household;
    }

    public void setHousehold(Integer household) {
        this.household = household;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Logement {" +
                "Type: '" + houseType + '\'' +
                ", Surface: " + area +
                ", A un garage?: " + hasGarage +
                ", Nombre de personne au foyer: " + household +
                '}';
    }
}
