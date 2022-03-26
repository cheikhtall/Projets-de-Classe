package sn.vue;

import sn.observer.Observable;
import sn.observer.Observer;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class View implements Observer {

    private JFrame frame;
    private JLabel tempLabel;
    private JLabel kelvinLabel;
    private JTextField temperature;
    private JTextField kelvin;
    private JButton button;
    private JButton celcius;

    public JFrame getFrame() {
        return frame;
    }
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JTextField getTemperature() {
        return temperature;
    }
    public void setTemperature(JTextField temperature) {
        this.temperature = temperature;
    }

    public JTextField getKelvin() {
        return kelvin;
    }

    public void setKelvin(JTextField kelvin) {
        this.kelvin = kelvin;
    }

    public JButton getButton() {
        return button;
    }
    public void setButton(JButton button) {
        this.button = button;
    }

    public JButton getCelcius() {
        return celcius;
    }

    public void init() {
        frame = new JFrame("CONVERTION");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 300);
        frame.setVisible(true);

        tempLabel = new JLabel("Température Celcius");
        kelvinLabel = new JLabel("Température Kelvin");

        temperature = new JTextField();
        temperature.setColumns(15);

        kelvin = new JTextField();
        kelvin.setColumns(15);

        button = new JButton("Convertir");
        celcius = new JButton("Convertir");

        GroupLayout layout = new GroupLayout(frame.getContentPane());
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(tempLabel)
                        .addComponent(kelvinLabel)
                )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(temperature)
                        .addComponent(kelvin)
                )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(button)
                        .addComponent(celcius)

                )
        );
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(tempLabel)
                        .addComponent(temperature)
                        .addComponent(button)
                )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(kelvinLabel)
                        .addComponent(kelvin)
                        .addComponent(celcius)

                )
        );

        layout.linkSize (SwingConstants.HORIZONTAL, button);
        frame.getContentPane().setLayout(layout);
    }

    @Override
    public void update(Observable observable) {

    }
}
