package Unidad1.Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {
    public static void main(String[] args) {
        try {
            File libreta = new File("src/Unidad1/Archivos/out.txt");
            FileWriter pluma = new FileWriter(libreta);
            pluma.write("POO - Homework\n");
            pluma.write("Ceci Ponce Video Tutorial");
            pluma.close();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
