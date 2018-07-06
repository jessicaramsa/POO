package Unidad2.Tiendita;

public class Tiendita {
    public static void main(String[] args) {
        Refresco cocaL = new Refresco(600, 11.50f);
        Refresco sprite = new Refresco(1, 14.70f);

        System.out.print("Coca $" + cocaL.getPrecio() + "\n"
                + "Sprite $" + sprite.getPrecio());
        System.out.println(cocaL.toString());
    }
}
