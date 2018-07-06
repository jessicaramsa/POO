package Unidad1.Alcancía;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TestAlcancía {
    public static void main(String[] args) {
        Alcancía batman = new Alcancía();

        batman.dinero = 100;
        batman.forma = "src/Unidad1/Alcancía/Batman.jpg";
        System.out.println(batman.dinero);
        JOptionPane.showMessageDialog(null,
                "$" + batman.dinero,
                "Evaluación diagnóstica de POO",
                JOptionPane.PLAIN_MESSAGE,
                new ImageIcon(batman.forma));
    }
}
