package Unidad2.Tiendita;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Tiendita2 {
    public static void main(String[] args) {
        Refrigerador cocaCola = new Refrigerador();
        cocaCola.cargar();
    }
}

class Refrigerador {
    Refresco[][] inventario;

    public Refrigerador() {
        inventario = new Refresco[4][4];
    }

    public void cargar() {
        try {
            Scanner lector = new Scanner(
                    new FileInputStream("src/Unidad2/Tiendita/inv.txt"));
            System.out.println(lector.nextLine());
        } catch (IOException ex) {
            System.out.println("Falta la libreta");
            System.exit(1);
        }
    }
}
