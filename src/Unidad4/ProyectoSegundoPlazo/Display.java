package Unidad4.ProyectoSegundoPlazo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Display {
    Conexión cx = new Conexión();
    
    final String imgs = "src/Unidad4/ProyectoSegundoPlazo/imgs/";
    
    JFrame ventana;
    JPanel panel;
    JLabel imagenFondo;
    JLabel texto;
    JButton ver;
    JComboBox combo;
    DefaultComboBoxModel listaOpc;
    
    public void show() {
        crear();
        configurar();
        lanzar();
    }
    
    void crear() {
        ventana = new JFrame();
        panel = new JPanel();
        imagenFondo = new JLabel();
        texto = new JLabel();
        ver = new JButton("Ver");
        listaOpc = new DefaultComboBoxModel();
    }
    
    void configurar() {
        ventana.setTitle("Librerías Gonvill - Inventario");
        ventana.setSize(700, 400);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        
        imagenFondo.setIcon(new ImageIcon(imgs + "logo2.jpg"));
        imagenFondo.setBounds(0, 0, 680, 380);
        
        texto.setBounds(300, 300, 350, 400);
        texto.setVisible(false);
        
        listaOpc.addElement("Todos");
        listaOpc.addElement("Emperador - Miedo");
        listaOpc.addElement("Siete esqueletos decapitados");
        listaOpc.addElement("1Q84");
        listaOpc.addElement("A sangre fría");
        listaOpc.addElement("El séptimo sello");
        
        combo = new JComboBox(listaOpc);
        combo.setBounds(50, 450, 120, 550);
        
        ver.setBounds(50, 570, 120, 640);
        ver.addActionListener(new clickLeft());
        
        panel.add(texto);
        panel.add(combo);
        panel.add(ver);
        panel.add(imagenFondo);
    }
    
    void lanzar() {
        ventana.getContentPane().add(panel);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    class clickLeft implements ActionListener {
        @Override
        public void actionPerformed (ActionEvent e) {
            if(e.getSource() == ver) {
                imagenFondo.setIcon(new ImageIcon(imgs + combo.getSelectedItem() + ".jpg"));
                ver.setVisible(true);
                combo.setVisible(true);
                texto.setVisible(true);
                texto.setText("" + cx.leer().toString() + "->" + combo.getSelectedItem());
            } else {
                JOptionPane.showMessageDialog(null, "¿Qué haces?");
            }
        }
    }
}
