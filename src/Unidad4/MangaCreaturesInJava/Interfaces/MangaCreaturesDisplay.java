package Unidad4.MangaCreaturesInJava.Interfaces;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JApplet;

public class MangaCreaturesDisplay extends JApplet {
    LectorArchivo in;
    Creatura uno;
    
    public void init() {
        setSize(500, 600);
        in = new LectorArchivo();
        ArrayList<String> lista = in.leer();
        String [] partes = lista.get(1).split("; ");
        uno = new Creatura(Integer.parseInt(partes[0].trim()),
                            partes[2].trim(),
                            partes[1].trim());
    }

    public void paint (Graphics plumón) {
        plumón.drawImage(uno.getImage(), 100, 10, null);
        plumón.drawString(uno.getNombre(), 1, 15);
    }
}
