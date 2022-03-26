package com.company;

import javax.swing.*;
import java.awt.*;

public class Vue {
//utilisation de swing pour l'interface utilisateur
    private JFrame frame;
    private JLabel firstnameLabel;
    private JLabel lastnameLabel;
    private  JLabel tempLabel;
    private JTextField firstnameTextfield;
    private JTextField lastnameTextfield;
    private JTextField tempTextfield;
    private JButton firstnameSaveButton;
    private JButton tempSaveButton;
    private JButton hello;
    private JButton bye;

    public  Vue (String title){
        frame = new JFrame(title);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        firstnameLabel = new JLabel("Prénom");
        lastnameLabel = new JLabel("Nom");
        tempLabel = new JLabel("Température");
        firstnameTextfield = new JTextField();
        lastnameTextfield = new JTextField();
        tempTextfield = new JTextField();
        firstnameSaveButton = new JButton("Voir les infos");
        tempSaveButton = new JButton("Voir la temperature");
        hello = new JButton("voir le resultat!");
        bye = new JButton("bye!");

        GroupLayout layout = new GroupLayout(frame.getContentPane());
                layout.setAutoCreateGaps(true);
                layout.setAutoCreateContainerGaps(true);
                layout.setHorizontalGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(firstnameLabel)
                                .addComponent(lastnameLabel)
                                .addComponent(tempLabel)

                        )

                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(firstnameTextfield)
                                        .addComponent(lastnameTextfield)
                                        .addComponent(tempTextfield)
                                )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(firstnameSaveButton)
                                .addComponent(tempSaveButton)
                        )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(hello)
                               
                        )
                );

                layout.setVerticalGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(firstnameLabel)
                                .addComponent(firstnameTextfield)
                                .addComponent(firstnameSaveButton)
                                .addComponent(hello)
                        )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lastnameLabel)
                                .addComponent(lastnameTextfield)
                                
                        )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(tempLabel)
                                .addComponent(tempTextfield)
                                .addComponent(tempSaveButton)
                                
                        )
                );

                layout.linkSize(SwingConstants.HORIZONTAL, firstnameSaveButton, tempSaveButton);
                layout.linkSize(SwingConstants.HORIZONTAL, hello);
                frame.getContentPane().setLayout(layout);

    }

    public JLabel getTempLabel() {
        return tempLabel;
    }

    public void setTempLabel(JLabel tempLabel) {
        this.tempLabel = tempLabel;
    }

    public JTextField getTempTextfield() {
        return tempTextfield;
    }

    public void setTempTextfield(JTextField tempTextfeld) {
        this.tempTextfield = tempTextfeld;
    }

    public JButton getTempSaveButton() {
        return tempSaveButton;
    }

    public void setTempSaveButton(JButton tempSaveButton) {
        this.tempSaveButton = tempSaveButton;
    }

    public JFrame getFrame(){
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
    public JLabel getFirstnameLabel() {
        return firstnameLabel;
    }
    public void setFirstnameLabel(JLabel firstnameLabel) {
        this.firstnameLabel = firstnameLabel;
    }
    public JLabel getLastnameLabel() {
        return lastnameLabel;
    }
    public void setLastnameLabel(JLabel lastnameLabel) {
        this.lastnameLabel = lastnameLabel;
    }
    public JTextField getFirstnameTextfield() {
        return firstnameTextfield;
    }
    public void setFirstnameTextfield(JTextField firstnameTextfield) {
        this.firstnameTextfield = firstnameTextfield;
    }
    public JTextField getLastnameTextfield() {
        return lastnameTextfield;
    }
    public void setLastnameTextfield(JTextField lastnameTextfield) {
        this.lastnameTextfield = lastnameTextfield;
    }
    public JButton getFirstnameSaveButton() {
        return firstnameSaveButton;
    }
    public void setFirstnameSaveButton(JButton firstnameSaveButton) {
        this.firstnameSaveButton = firstnameSaveButton;
    }
    public JButton getHello() {
        return hello;
    }
    public void setHello(JButton hello) {
        this.hello = hello;
    }
    public JButton getBye() {
        return bye;
    }
    public void setBye(JButton bye) {
        this.bye = bye;
    }

}
