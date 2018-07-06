package Unidad2.Alcancía;

public class Cajita {
    public static void main(String[] args) {
        Alcancía ceciPonce = new Alcancía(500);

        ceciPonce.depósito(1000);
        float d = ceciPonce.retiro(12000);
        System.out.println("Retirando");
        System.out.println(ceciPonce.retiro(12000));
        System.out.println("Saldo Actual");
        System.out.println(ceciPonce.getSaldo());
    }
}
