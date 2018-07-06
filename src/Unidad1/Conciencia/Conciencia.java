package Unidad1.Conciencia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Conciencia {
    JFrame  ventana;
    JLabel  imagenFondo, angel, diablo;
    JButton boton;
    JPanel  panel;
    
    public static void main(String[] args) {
        Conciencia propuesta = new Conciencia();
        propuesta.correr();
    }

    private void correr() {
        instanciar();
        armar();
        desplegar();
    }
    
    void instanciar(){
        ventana     = new JFrame();
        boton       = new JButton();
        imagenFondo = new JLabel();
        angel       = new JLabel();
        diablo      = new JLabel();
        panel       = new JPanel();
    }
    
    void armar(){
        ventana.setSize(500, 500);
        ventana.setTitle("Ejemplo de clases internas");
        
        imagenFondo.setIcon(new ImageIcon("src/Unidad1/Conciencia/Principal.png"));
        imagenFondo.setBounds(0, 0, 500, 500);
        
        boton.setIcon(new ImageIcon("src/Unidad1/Conciencia/Botón.png"));
        boton.setBounds(195, 375, 90, 93);
        
        boton.addActionListener(new AngelListener());
        boton.addActionListener(new DiabloListener());

        angel.setIcon(new ImageIcon("src/Unidad1/Conciencia/Ángel.png"));            
        angel.setBounds(10, 20, 100, 120);
        angel.setVisible(true);
     
        diablo.setIcon(new ImageIcon("src/Unidad1/Conciencia/Diablo.png"));
        diablo.setBounds(390, 20, 100, 120);
        diablo.setVisible(true);

        panel.setLayout(null);
        panel.add(angel);
        panel.add(diablo);
        panel.add(imagenFondo);
        panel.add(boton);
    }
    
    void desplegar(){
        ventana.getContentPane().add(panel);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String [] mensaje = {"Come frutas y verduras",
                                 "Aliméntate sanamente",
                                 "Cuida tu alimentación",
                                 "Haz deporte",
                                 "Cuerpo sano, mente sana"
                                };
            angel.setVisible(true);
            angel.setToolTipText(mensaje[(int)(Math.random()*mensaje.length)]);
        }
    }

    private class DiabloListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String [] mensaje = {"Come pastel y papitas fritas...",
                                 "Éntrale a las fritangas...",
                                 "Come lo que quieras, no pasa nada...",
                                 "Una vez al mes no hace daño..."
                                };
            
            diablo.setVisible(true);
            diablo.setToolTipText(mensaje[(int)(Math.random()*mensaje.length)]);
        }
    }
}