package Unidad5.Archivos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class TestObjectOutputStream {
    public static void main(String [] args) throws IOException, ClassNotFoundException{
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream
            ("ActricesFamosas.loquequeramos"));
        ){
            Alumno a = (Alumno) in.readObject();
            System.out.println(a.nombre);
        }
    }
}
    
class Alumno implements Serializable{
    String nombre;
    double calificacion;
    
    public Alumno(String n, double c){
        nombre = n;
        calificacion = c;
    }
}
