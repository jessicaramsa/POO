package Unidad4.MangaCreaturesInJava.Interfaces;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class LectorArchivo implements Lector{
    public ArrayList<String> leer() {
        ArrayList<String> lista = new ArrayList();
        
        try {
            File archivo = new File("src/Unidad4/MangaCreaturesInJava/Interfaces/hoja.txt");
            Scanner in = new Scanner((archivo));
            
            while(in.hasNext()) {
                lista.add(in.nextLine());
            }
        } catch(Exception e) {
            
        }
        
        return lista;
    }
}
