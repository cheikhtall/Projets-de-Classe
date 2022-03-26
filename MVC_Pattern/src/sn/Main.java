package sn;

import sn.controlleur.Controlleur;
import sn.controlleur.ControlleurCelcius;
import sn.model.*;
import sn.model.convertions.ConvertionCelcius;
import sn.model.convertions.ConvertionKelvin;
import sn.model.convertions.IconvertionCelcius;
import sn.model.convertions.IconvertionKelvin;
import sn.vue.View;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        view.init();
        IconvertionKelvin convertion = new ConvertionKelvin();
        IconvertionCelcius convertionCelcius = new ConvertionCelcius();
        Model m = new Model(convertion, convertionCelcius);
        Model mi = new Model(convertion, convertionCelcius);
        Controlleur c = new Controlleur(m, view);
        ControlleurCelcius ci = new ControlleurCelcius(mi, view);
        m.addObserver(view);
        m.addObserver(c);
        view.getButton().addActionListener(c);
        mi.addObserver(view);
        mi.addObserver(ci);
        view.getCelcius().addActionListener(ci);
    }
}
