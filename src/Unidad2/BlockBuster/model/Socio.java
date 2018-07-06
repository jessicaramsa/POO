package Unidad2.BlockBuster.model;

import java.util.Date;

public class Socio {
    private int    número;
    private String curp, 
                   nombre, 
                   apellido, 
                   dirección,
                   tel1, 
                   tel2;
    private char   sexo;
    private Date   fechaNacimiento;

    public Socio(int número, String curp, String nombre, 
                 String apellido, String dirección, 
                 String tel1, String tel2, 
                 char sexo, Date fechaNacimiento) {
        this.número = número;
        this.curp = curp;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirección = dirección;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNúmero() {
        return número;
    }

    public void setNúmero(int número) {
        this.número = número;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Socio{" + "número = " + número + 
                      ", curp = " + curp + ", nombre = " + 
                      nombre + ", apellido = " + apellido + 
                      ", dirección = " + dirección + 
                      ", teléfono1 = " + tel1 + ", teléfono 2 = " + tel2 + 
                      ", sexo = " + sexo + ", fechaNacimiento = " + 
                      fechaNacimiento + '}';
    }
}
