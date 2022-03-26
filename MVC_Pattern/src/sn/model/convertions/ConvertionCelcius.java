package sn.model.convertions;

public class ConvertionCelcius implements IconvertionCelcius {

    @Override
    public double convertionCelcius(double valeur) {
        valeur -= 273.5;
        return valeur;
    }
}


