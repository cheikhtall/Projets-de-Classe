package sn.model;

import sn.model.convertions.IconvertionCelcius;
import sn.model.convertions.IconvertionKelvin;
import sn.observer.Observable;
import sn.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Model implements Observable {

    private List<Observer> observers = new ArrayList<>();
    public double valeur;
    public IconvertionKelvin convertion;
    public IconvertionCelcius convertionCelcius;

    public  Model (IconvertionKelvin convertionKelvin, IconvertionCelcius convertionCelcius) {
        this.convertion = convertionKelvin;
        this.convertionCelcius = convertionCelcius;
    }

    public Double getValeur() {
        return valeur;
    }
    public void setValeur(Double valeur) {
        this.valeur = valeur;
        notifyObservers();
    }

    public double ConvertionKelvin () {
        return this.convertion.convertionKelvin(valeur);
    }

    public double ConvertionCelcius () {
        return this.convertionCelcius.convertionCelcius(valeur);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
