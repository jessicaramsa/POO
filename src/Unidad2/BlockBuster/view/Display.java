package Unidad2.BlockBuster.view;

import javax.swing.JOptionPane;

public class Display {
    public int menu() {
        String[] opciones = {"Alta de usuarios",
                             "Alta película"};
        String eleccion = (String) JOptionPane.showInputDialog(null,
                "Elija", "BlockBuster.com", -1, null,
                opciones, opciones[0]);

        if (eleccion != null) {
            if (eleccion.equals(opciones[0])) {
                return 0;
            }else return 1;
        } else {
            return -1;
        }
    }

    public void datosUsuario(){
        String curp;
        
        do{
            curp = JOptionPane.showInputDialog("CURP");
        } while(curp == null || curp.length() != 18);
    }
}
