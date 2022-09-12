package com.mycompany.insuranceSimulator.contract;

public class Car extends Vehicle {
    private Boolean insuredPartner;
    private Boolean insuredChildren;

    @Override
    public void calculateRate() {
    }

    @Override
    public void print() {

    }

    public Boolean getInsuredPartner() {
        return insuredPartner;
    }

    public void setInsuredPartner(Boolean insuredPartner) {
        this.insuredPartner = insuredPartner;
    }

    public Boolean getInsuredChildren() {
        return insuredChildren;
    }

    public void setInsuredChildren(Boolean insuredChildren) {
        this.insuredChildren = insuredChildren;
    }

    @Override
    public String toString() {
        return "Voiture {" +
                "Conjoint assuré ?: " + insuredPartner +
                ", Enfant assuré ?: " + insuredChildren +
                '}';
    }
}
