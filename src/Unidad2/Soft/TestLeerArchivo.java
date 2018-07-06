package Unidad2.Soft;

import java.util.ArrayList;

public class TestLeerArchivo {
    public static void main(String[] args) {
        Lector l = new Lector();
        ArrayList<String> información = l.dameDatos();

        for (String linea : información) {
            String[] pedacito = linea.split(",");
            String tipo = (pedacito.length == 5 ? "Prgramador" : "Administrativo");
            System.out.println(tipo + " --> " + pedacito[2] + " --> "
                    + (pedacito[0].equals("S") ? "Secretaria"
                    : (pedacito[0].equals("C") ? "Chofer" : "Empleado")));
        }
    }
}
