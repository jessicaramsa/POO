package Unidad5.Archivos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjetosPerdidos {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Objeto[] lista = {new Objeto("Memoria USB azul", "Laboratorio D15", "12 de Mayo"),
            new Objeto("Cargador de celular", "Salón F8", "15 de Mayo"),
            new Objeto("Zapato derecho de charol", "Auditorio", "17 de Mayo")};

        try(ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("ObjetosPerdidos.dat"));
            ){
            out.writeObject(lista);
        }
    }

    public static class Objeto implements java.io.Serializable {
        public Objeto(String obj, String lugar, String dia) {}
    }
}
