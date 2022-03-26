package obs;

public class ObserverImp implements Observer{
    
    @Override
    public void update(Observable observable){
        int etat = ((ObservableConcret)observable).getEtat();
        System.out.println("Résultat :"+etat*4);
    }

}
