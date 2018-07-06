package Unidad5.Archivos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeeObjetosPerdidos {
    public static void main(String[] args) throws IOException {
        try(ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("ObjetosPerdidos.dat"));
            ){}
    }
}
