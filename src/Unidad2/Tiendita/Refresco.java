package Unidad2.Tiendita;

public class Refresco {
    public final String marca = "cc";
    private float precio;
    private int tamaño;

    public Refresco() {}

    public Refresco(int tamaño, float precio) {
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getTamaño() {
        return tamaño;
    }

    @Override
    public String toString() {
        return this.tamaño + ", " + this.precio;
    }

}