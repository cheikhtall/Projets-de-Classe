package sn.model.convertions;

public class ConvertionKelvin implements IconvertionKelvin {

    @Override
    public double convertionKelvin(double valeur) {
        valeur+=273.5;
        return valeur;
    }

}
