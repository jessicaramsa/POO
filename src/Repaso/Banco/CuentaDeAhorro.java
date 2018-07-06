package Repaso.Banco;

public class CuentaDeAhorro extends Cuenta{
    private String tipo;
    
    public CuentaDeAhorro(String n, int s, String tipo){
        super (n, s);
        this.tipo = tipo;
    }
}
