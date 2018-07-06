package Unidad1.RelojD;

import javax.swing.JOptionPane;

public class TestDisplay {
    public static void main(String[] args) {
        Reloj r = new Reloj();
        JOptionPane.showMessageDialog(null, r.darHora());
    }
}
