package Unidad1.Trabajador;

import javax.swing.*;

public class TestTrabajador {
    public static void main(String[] args) {
        String img = "src/Unidad1/Trabajador/";
        String[] t = {"Cirilo Naranjo",
            "José Gerardo Carpio",
            "Héctor José Puga"};
        Trabajador numberOne = new Trabajador();

        Object r = JOptionPane.showInputDialog(null, "Elige", null, -1,
                new ImageIcon(img + "LogoITL.png"),
                t, t[0]);

        if (r != null) {
            switch (r.toString()) {
                case "Cirilo Naranjo":
                    JOptionPane.showMessageDialog(null, r.toString(), numberOne.ORGANIZACION,
                            -1, new ImageIcon(img + "Cirilo.jpg"));
                    break;
                case "José Gerardo Carpio":
                    JOptionPane.showMessageDialog(null, r.toString(), numberOne.ORGANIZACION,
                            -1, new ImageIcon(img + "Carpio.jpg"));
                    break;
                case "Héctor José Puga":
                    JOptionPane.showMessageDialog(null, r.toString(), numberOne.ORGANIZACION,
                            -1, new ImageIcon(img + "Puga.jpg"));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Trabajador NO localizado",
                            numberOne.ORGANIZACION, -1,
                            new ImageIcon(img + "NoD.png"));
            }
        }
    }
}
