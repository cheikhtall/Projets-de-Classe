package sn.controlleur;

import sn.model.Model;
import sn.observer.Observable;
import sn.observer.Observer;
import sn.vue.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlleurCelcius implements ActionListener, Observer {
    public Model m;
    public View view;

    public ControlleurCelcius(Model m, View view) {
        this.m = m;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        m.setValeur(Double.parseDouble(view.getKelvin().getText()));
    }

    @Override
    public void update(Observable observable) {
        Model m =(Model) observable;
        JTextField temperature = view.getTemperature();
        temperature.setText(String.valueOf(m.ConvertionCelcius()));
    }
}
