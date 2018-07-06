package Repaso.Banco;

public class PruebaCuentas {
    public static void main(String[] args) {
        Cuenta demo = new Cuenta();
        CuentaDeAhorro gcf = new CuentaDeAhorro("GCF", 100, "Académica");
        
        demo.setNombre("Jessica Ramírez");
        demo.setSaldo(100);
        
        gcf.setEmpresa("Banregiototote");
        gcf.setSaldo(50);
        
        System.out.println(demo.toString());
        System.out.println(gcf.toString());
    }
}
