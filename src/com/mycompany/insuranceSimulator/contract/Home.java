package com.mycompany.insuranceSimulator.contract;

public class Home extends Contract{

    private String houseType;
    private Integer area;
    private Boolean hasGarage;
    private Integer houshold;

    @Override
    public Float calculateRate() {
        return null;
    }

    @Override
    public void print() {

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

    public Integer getHoushold() {
        return houshold;
    }

    public void setHoushold(Integer houshold) {
        this.houshold = houshold;
    }

    @Override
    public String toString() {
        return "Logement {" +
                "Type: '" + houseType + '\'' +
                ", Surface: " + area +
                ", A un garage?: " + hasGarage +
                ", Nombre de personne au foyer: " + houshold +
                '}';
    }
}
