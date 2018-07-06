package Repaso.Figuras;

import java.awt.Color;
import java.awt.Graphics;

class Círculo extends Figura {
    private float radio;

    public Círculo() {}

    public Círculo(int x, int y, Color color, float radio) {
        super(x, y, color);
        this.radio = radio;
    }

    void dibujar(Graphics plumón) {
        plumón.setColor(getColor());
        plumón.drawOval(getX(), getY(), (int) radio, (int) radio);
    }
}
