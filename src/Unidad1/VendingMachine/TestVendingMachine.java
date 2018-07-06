package Unidad1.VendingMachine;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TestVendingMachine {
    public static void main(String[] args) {
        String img = "src/Unidad1/VendingMachine/imgs/";
        String r[] = {"Coca Classic",
            "Coca Zero",
            "Coca Life",
            "Coca Light",
            "Fanta"};

        Object e;
        e = JOptionPane.showInputDialog(null, "Vending Machine Coca-Cola",
                "Ingrese refresco", -1,
                new ImageIcon(img + "sol.jpg"),
                r, r[0]);

        if (e != null) {
            switch (e.toString()) {
                case "Coca Classic":
                    JOptionPane.showMessageDialog(null, null, "Coca Classic",
                            -1, new ImageIcon(img + "Coca-Classic.jpg"));
                    break;
                case "Coca Zero":
                    JOptionPane.showMessageDialog(null, null, "Coca Zero",
                            -1, new ImageIcon(img + "Coca-Zero.jpg"));
                    break;
                case "Coca Life":
                    JOptionPane.showMessageDialog(null, null, "Coca Life",
                            -1, new ImageIcon(img + "Coca-Life.jpg"));
                    break;
                case "Coca Light":
                    JOptionPane.showMessageDialog(null, null, "Coca Light",
                            -1, new ImageIcon(img + "Coca-Light.jpg"));
                    break;
                case "Fanta":
                    JOptionPane.showMessageDialog(null, null, "Fanta",
                            -1, new ImageIcon(img + "Fanta.png"));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Refresco no disponible");
                    break;
            }
        }
    }
}
