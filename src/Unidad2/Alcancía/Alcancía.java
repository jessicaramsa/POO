package Unidad2.Alcancía;

public class Alcancía {
    private float saldo;

    public Alcancía() {}

    public Alcancía(int dinero) {
        saldo = dinero;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void depósito(float cantidad) {
        saldo += (cantidad > 0 ? cantidad : 0);
    }

    public float retiro(float cantidad) {
        float retiro = (cantidad > 0 && cantidad <= saldo) ? cantidad : 0;
        if (retiro > 0) {
            saldo -= retiro;
        }
        return retiro;
    }
}
