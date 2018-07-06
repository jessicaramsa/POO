package Unidad1.Trabajador;

import java.util.Date;

public class Trabajador {
    public final String ORGANIZACION = "ITL";
    private String nombre;
    private Date fechaNacimiento,
            fechaIngreso;
    private float salario;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
