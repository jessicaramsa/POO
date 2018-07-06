package Unidad4.ProyectoSegundoPlazo;

import java.util.ArrayList;

public class TestConexión {
    public static void main(String[] args) {
        Conexión gv = new Conexión();
        ArrayList<String> out = gv.leer();
        if(gv.c != null) {
            out = gv.leer();
            for(int i = 0; i < out.size(); i++) {
                System.out.println(out.get(i));
            }
        }
    }
}
