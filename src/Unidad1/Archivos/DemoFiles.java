package Unidad1.Archivos;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class DemoFiles {
    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(new FileInputStream("src/Unidad1/Archivos/p.txt"));
            while(teclado.hasNext()) {
                String[] partes = teclado.nextLine().split(",");
                System.out.println(partes[1]);
            }
        } catch (IOException ex) {
            System.err.println("Problemas con el archivo... " + ex.getMessage());
        }
    }
}
