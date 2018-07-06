package Unidad1.DarkSouls;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class DarkSouls3 {
    final String path = "src/Unidad1/DarkSouls/";
    JFrame    ventana;
    JPanel    panel;
    JLabel    etiqueta;
    JComboBox combo;
    JButton   boton;
    JButton   recuadro;
    Border    borde;
    DefaultComboBoxModel datos;
    
    public static void main(String[] args) {
        DarkSouls3 videoGame = new DarkSouls3();
        videoGame.show();
    }

    void show() {
        create();
        assamble();
        launch();
    }

    void create() {
        ventana  = new JFrame();
        panel    = new JPanel();
        etiqueta = new JLabel();
        boton    = new JButton("Ver");
        datos    = new DefaultComboBoxModel();
        recuadro = new JButton();
        borde    = new LineBorder(Color.GRAY, 6);
    }
    
    void assamble() {
        ventana.setTitle("DarkSouls3 - On sale in April 2016");
        ventana.setSize(715, 430);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

        panel.setLayout(null);

        etiqueta.setIcon(new ImageIcon(path + "DarkSouls3_1.jpg"));
        etiqueta.setBounds(0, 0, 700, 400);

        datos.addElement("ArtBook");
        datos.addElement("Figurines");
        datos.addElement("Collector's Box");
        datos.addElement("Metal Case");
        
        combo = new JComboBox(datos);
        combo.setBounds(500, 30, 100, 30);

        boton.setBounds(620, 30, 70, 30);
        boton.addActionListener(new clickLeftListener());

        recuadro.setBorder(borde);
        recuadro.setBounds(175, 25, 350, 350);
        recuadro.setVisible(false);
        recuadro.addActionListener(new clickLeftListener());

        panel.add(combo);    
        panel.add(boton);
        panel.add(recuadro); 
        panel.add(etiqueta);
    }

    void launch() {
        ventana.getContentPane().add(panel);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    class clickLeftListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton) {
                etiqueta.setIcon(new ImageIcon(path + "DarkSouls3_2.jpg"));
                recuadro.setIcon(new ImageIcon(path + combo.getSelectedItem() + ".jpg"));
                recuadro.setVisible(true);
                boton.setEnabled(false);
                combo.setEnabled(false);
            } else if (e.getSource() == recuadro) {
                boton.setEnabled(true);
                combo.setEnabled(true);
                recuadro.setVisible(false);
                etiqueta.setIcon(new ImageIcon(path + "DarkSouls3_1.jpg"));
            }
        }
    }
}