package Unidad1.Menú2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        String[] opc = {"Kiss", "Iron Maiden", "Iron Maiden2", "Rammstein",
            "Metallica", "Rolling Stones", "Guns n Roses"};
        Object r = JOptionPane.showInputDialog(null, "Ingrese una banda",
                "ReallyRock.com", -1,
                new ImageIcon("src/Unidad1/Menú2/giphy.gif"),
                opc, opc[2]);
        if (r != null) {
            JOptionPane.showMessageDialog(null, r.toString(), "ReallyRock.com", -1,
                    new ImageIcon("src/Unidad1/Menú2/" + r.toString() + ".gif"));
        }
    }
}
