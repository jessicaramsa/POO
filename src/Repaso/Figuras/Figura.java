package Repaso.Figuras;

import java.awt.Color;
import java.awt.Graphics;

abstract class Figura {
    private int x, y;
    private Color color;

    Figura() {}

    Figura(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    void setColor(Color color) {
        this.color = color;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }

    Color getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return x + ". " + y + ", " + color;
    }

    abstract void dibujar(Graphics g);
}
