package Unidad1.Alcancía;

class Alcancía {
    float dinero;
    String forma;

    void depósito(int cantidad) {
        dinero = dinero + cantidad;
    }

    float retiro(float cantidad) {
        if (cantidad <= dinero) {
            dinero = dinero - cantidad;
        } else {
            System.out.println("Lo siento, no tienes fondos suficientes");
            cantidad = 0;
        }
        return cantidad;
    }
}
