package obs;

public class Main {
    public static void main(String[] args){
        ObservableConcret sujet = new ObservableConcret();
        ObserverImp obs = new ObserverImp();
        sujet.addObserver(obs);
        sujet.setEtat(6);
    }
}