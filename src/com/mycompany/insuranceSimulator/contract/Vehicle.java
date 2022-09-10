package com.mycompany.insuranceSimulator.contract;

public abstract class Vehicle extends Contract  {

    private Integer fiscalHorsPower;
    private Float bonusMalus;
    private Integer insuranceYears;

    public Integer getFiscalHorsPower() {
        return fiscalHorsPower;
    }

    public void setFiscalHorsPower(Integer fiscalHorsPower) {
        this.fiscalHorsPower = fiscalHorsPower;
    }

    public Float getBonusMalus() {
        return bonusMalus;
    }

    public void setBonusMalus(Float bonusMalus) {
        this.bonusMalus = bonusMalus;
    }

    public Integer getInsuranceYears() {
        return insuranceYears;
    }

    public void setInsuranceYears(Integer insuranceYears) {
        this.insuranceYears = insuranceYears;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Nombre de chevaux fiscaux" + fiscalHorsPower +
                ", bonus / malus=" + bonusMalus +
                ", Nombre d'années assurées=" + insuranceYears +
                '}';
    }
}
