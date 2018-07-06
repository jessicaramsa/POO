package Unidad2.BlockBuster.test;

import Unidad2.BlockBuster.view.Display;

public class TestAltaSocio {
    public static void main(String[] args) {
        Display pantalla = new Display();
        
        int op = pantalla.menu();
        if(op == 0){
            pantalla.datosUsuario();
        }
    }
}
