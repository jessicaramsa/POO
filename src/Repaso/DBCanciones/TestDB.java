package Repaso.DBCanciones;

public class TestDB {
    public static void main(String[] args) {
        BaseDatos bd = new BaseDatos();
        bd.conectar();
        bd.consultar();
        bd.desconectar();
    }
}
