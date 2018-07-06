package Unidad2.BlockBuster.test;

import javax.swing.*;

public class DemoDesktop {
    public static void main(String[] args) {
        JFrame v = new JFrame();
        
        v.setSize(400, 400);
        v.setTitle("Demo");
        v.setLocationRelativeTo(null);
        v.setResizable(false);
        v.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        v.setVisible(true);
        
        JOptionPane.showMessageDialog(v, "(C)", "Demo",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
