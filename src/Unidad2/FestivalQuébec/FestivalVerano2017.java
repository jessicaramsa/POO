package Unidad2.FestivalQuébec;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JPasswordField;

public class FestivalVerano2017 {
    final String p = "src/Unidad2/FestivalQuébec/imgs/";
    JFrame      ventana;
    JPanel      panel;
    JLabel      etiqueta;
    JComboBox   combo;
    JButton     boton;

    public static void main(String[] args) {
        FestivalVerano2017 festival = new FestivalVerano2017();
        
        JPasswordField campoContraseña = new JPasswordField();
        int opcion;

        opcion = JOptionPane.showConfirmDialog(null,
                campoContraseña,
                "Ingrese su contraseña",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        // - Aceptar || Cancelar
        if (opcion == JOptionPane.OK_OPTION) {
            String pwd = new String(campoContraseña.getPassword());
            System.out.println(pwd);

            if (pwd.equals("tecleon")) {
                JOptionPane.showMessageDialog(null, "Bienvenido a la sesión");
                festival.Québec();
            } else {
                System.out.println("Contraseña errónea, verifique por favor");
            } // - pwd
        } // - OK_OPTION
    }

    void Québec() {
        crear();
        configurar();
        desplegar();
    }

    void crear() {
        ventana         = new JFrame();
        panel           = new JPanel();
        etiqueta        = new JLabel();
        boton           = new JButton("Aceptar");
        String[] bandas = {"Rammstein", "Red Hot Chili Peppers", "Metallica"};
        combo           = new JComboBox(bandas);
    }

    void configurar() {
        ventana.setSize(655, 640);
        ventana.setTitle("Festival de Verano Québec 2016");
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        
        panel.setBounds(0, 0, 655, 640);
        panel.setLayout(null);
        ventana.getContentPane().add(panel);

        etiqueta.setIcon(new ImageIcon(p + "Québec_1.png"));
        etiqueta.setBounds(0, 0, 655, 640);

        String[] banda = {"Rammstein", "Red Hot Chili Peppers", "Metallica"};

        combo = new JComboBox(banda);
        combo.setBounds(350, 30, 130, 40);

        boton.setBounds(500, 30, 100, 40);
        boton.addActionListener(new ProgramaciónBotónIzq());

        panel.setLayout(null);
        panel.add(combo);
        panel.add(boton);
        panel.add(etiqueta);
    }

    private ImageIcon escalarImagen(String archivo) {
        Image i = new ImageIcon(archivo).getImage(); // - Escalar imagen con calidad
        ImageIcon ir = new ImageIcon(i.getScaledInstance(499, 450, Image.SCALE_SMOOTH));
        
        return ir;
    }

    class ProgramaciónBotónIzq implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int opcion2;
            if (e.getSource() == boton) {
                opcion2 = JOptionPane.showConfirmDialog(null,
                        "Acabas de seleccionar:\n" + combo.getSelectedItem(), 
                        "FestivalVerano2017",
                        JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if(opcion2 == JOptionPane.YES_OPTION){
                    etiqueta.setIcon(new ImageIcon(p + combo.getSelectedItem() + ".gif"));
                    etiqueta.setVisible(true);
                    boton.setEnabled(true);
                    combo.setEnabled(true);
                } else if(opcion2 == JOptionPane.NO_OPTION){
                    return;
                }
            } else{
                JOptionPane.showMessageDialog(null, "¿Qué haces?");
            }
        }
    }
    
    void desplegar() {
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
