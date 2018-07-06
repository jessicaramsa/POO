package Unidad4.MangaCreaturesInJava.Interfaces;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Creatura {
    private int numero;
    private String descripción, categoría;
    
    public Creatura() {}
    
    public Creatura(int numero) {
        this.numero = numero;
    }
    
    public Creatura(int numero, String d, String c) {
        this.numero = numero;
        descripción = d;
        categoría = c;
    }
    
    public String getNombre() {
        return categoría + " -> " + descripción;
    }
    
    public Image getImage() {
        return new ImageIcon("src/Unidad4/MangaCreaturesInJava/" + numero + ".png").getImage();
    }
}
