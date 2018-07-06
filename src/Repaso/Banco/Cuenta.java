package Repaso.Banco;

public class Cuenta {
    private String empresa;
    private String nombre;
    private int saldo;

    public Cuenta() {
        empresa = "Banregio";
    }

    public Cuenta(String n, int s) {
        nombre = n;
        saldo = s;
    }

    public void setEmpresa(String e) {
        this.empresa = e;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSaldo(int s) {
        saldo = s;
    }

    public int getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return empresa + ", " + nombre + ", " + saldo;
    }
}
