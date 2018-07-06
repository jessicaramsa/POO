package Repaso.Figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JApplet;

public class TestFiguras extends JApplet {
    ArrayList<Círculo> listaCírculos;

    @Override
    public void init() {
        this.setSize(400, 400);
        listaCírculos = new ArrayList();
        listaCírculos.add(new Círculo(10, 10, Color.RED, 100));
        listaCírculos.add(new Círculo(200, 10, Color.BLUE, 100));
    }

    @Override
    public void paint(Graphics g) {
        for (Círculo c : listaCírculos) {
            c.dibujar(g);
        }
        g.drawString("Área" + Repaso.Figuras.Geometricas.areaDeCirculo(100), 55, 55);
    }
}
