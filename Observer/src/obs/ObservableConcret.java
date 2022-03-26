package obs;

import java.util.ArrayList;
import java.util.List;

public class ObservableConcret implements Observable{

    private List<Observer> observers = new ArrayList<>();
    private int etat;
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
       for (Observer observer : observers)
            observer.update(this);
    }

    public int getEtat() {
        return etat;
    }
    public void setEtat(int etat) {
        this.etat = etat;
        notifyObservers();
    }
}
