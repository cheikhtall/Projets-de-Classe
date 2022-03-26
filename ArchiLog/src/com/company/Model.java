package com.company;

public class Model implements Conversions {
    private String firstname;
    private String lastname;
    private Double temp;

    public Model (String firstname, String lastname, Double temp){
        this.firstname = firstname;
        this.lastname = lastname;
        this.temp = temp;
    }

    public String getFirstname() {
        return firstname;
    }
    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public void setFirstname(String firstname) {

        this.firstname = firstname;
    }

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {

        this.lastname = lastname;
    }
    public Double conversionKelvin(Double nombre){
        nombre = nombre + 273;
        return nombre;
    }
}


