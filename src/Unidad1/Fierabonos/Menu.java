package Unidad1.Fierabonos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        String r = "src/Unidad1/Fierabonos/";
        String[] op = {"Sol",
            "Preferente",
            "Zona A"};

        Object e;
        e = JOptionPane.showInputDialog(null, "Venta de Fierabonos",
                "Ingrese zona", -1,
                new ImageIcon(r + "enelcampo.jpg"),
                op, op[0]);

        if (e != null) {
            if (e.toString().equals("Sol")) {
                System.out.println("2000");
                JOptionPane.showMessageDialog(null, null, "Sol $2000", -1,
                        new ImageIcon(r + "sol.jpg"));
            } else if (e.toString().equals("Preferente")) {
                System.out.println("2300");
                JOptionPane.showMessageDialog(null, null, "Preferente $2300", -1,
                        new ImageIcon(r + "preferente.jpg"));
            } else {
                System.out.println("2500");
                JOptionPane.showMessageDialog(null, null, "Zona A $2500", -1,
                        new ImageIcon(r + "norte.jpg"));
            }
        }
    }
}
