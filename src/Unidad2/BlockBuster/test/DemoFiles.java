package Unidad2.BlockBuster.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class DemoFiles {
    public static void main(String[] args) {
        try{
            Scanner teclado = new Scanner(new 
                    FileInputStream("src/Unidad2/BlockBuster/p.txt"));
            while(teclado.hasNext()){
                String [] partes = teclado.nextLine().split(",");
                byte   numLista = Byte.parseByte(partes[0].trim());
                String nombre = partes[1].trim();
                short  sem = Short.parseShort(partes[2].trim());
                int    numC = Integer.parseInt(partes[3].trim());
                
                System.out.println(nombre);
            }                      
        }catch(IOException ex){
            System.err.println("Problemas con el archivo... "+
                    ex.getMessage());
        }
    }
}
