package Unidad3.VideoJuego;

public class VideoJuego {
    private String nombre;
    private String clasificación;
    private int precio;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClasificación(String clasificación) {
        this.clasificación = clasificación;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public VideoJuego(String nombre, String clasificación, int precio) {
        this.nombre = nombre;
        this.clasificación = clasificación;
        this.precio = precio;
    }
}

class VideoJuegosPC extends VideoJuego {
    private String sistemaOperativo;
    
    public VideoJuegosPC(String n, String c, int p, String so) {
        super (n, c, p);
        sistemaOperativo = so;
    }
}

class VideoJuegosENube extends VideoJuego{
    private String browser;
    
    public VideoJuegosENube(String n, String c, int p, String b){
        super(n, c, p);
        browser = b;
    }
}
