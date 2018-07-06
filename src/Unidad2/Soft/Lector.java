package Unidad2.Soft;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lector {
    ArrayList<String> lineas;

    public Lector() {
        lineas = new ArrayList();
    }

    public ArrayList<String> dameDatos() {
        try {
            Scanner lector = new Scanner(new FileInputStream(
                    "src/Unidad2/Soft/Trabajador.txt"), "latin1");
            while (lector.hasNext()) {
                lineas.add(lector.nextLine());
            }
        } catch (IOException ex) {
            System.err.println("Falta archivo de datos" + ex.getMessage());
        }
        return lineas;
    }
}
