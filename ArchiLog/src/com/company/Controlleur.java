package com.company;

import javax.swing.JOptionPane;

public class Controlleur {

    private Model model;
    private  Vue vue;

    public Controlleur ( Model m, Vue v) {

        model = m;
        vue = v;
        initVue();
    }

    private void initVue() {
        vue.getFirstnameTextfield().setText(model.getFirstname());
        vue.getLastnameTextfield().setText(model.getLastname());
        vue.getTempTextfield().setText(String.valueOf(model.getTemp()));
    }

    public  void initControlleur() {
        vue.getFirstnameSaveButton().addActionListener(e -> saveFirstname());
        vue.getTempSaveButton().addActionListener(e -> saveTemp());
        vue.getHello().addActionListener(e -> sayHello());
        vue.getBye().addActionListener(e -> sayBye());
    }

    private void saveFirstname(){
        model.setFirstname(vue.getFirstnameTextfield().getText());
        model.setLastname(vue.getLastnameTextfield().getText());
        JOptionPane.showMessageDialog(
                null, "Votre nom compet  :  "
                        +model.getFirstname()+ " " +model.getLastname(),


                "info", JOptionPane.INFORMATION_MESSAGE
        );
    }
    private void saveTemp(){
        model.setTemp(Double.valueOf(vue.getTempTextfield().getText()));
        JOptionPane.showMessageDialog(
                null, "Température  :"
                        +model.getTemp() + " °C",
                "info", JOptionPane.INFORMATION_MESSAGE
        );
    }
    private void sayHello() {
        JOptionPane.showMessageDialog(null, "Bonjour, \n Votre nom est : "
                + model.getFirstname()
                + "\n Votre prénom est : " + model.getLastname()
                + "\n La température convertie en Kelvin donne :  " + model.conversionKelvin(Double.valueOf(vue.getTempTextfield().getText())) + " Kelvin",
                "Info", JOptionPane.INFORMATION_MESSAGE);
    }
    private void sayBye() {

        System.exit(0);
    }

}
