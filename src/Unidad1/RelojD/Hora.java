package Unidad1.RelojD;

import java.util.Calendar;

public class Hora {
    public String darHora() {
        Calendar calendario = Calendar.getInstance();

        return "Son las " + calendario.get(Calendar.HOUR) + ":"
                + calendario.get(Calendar.MINUTE) + " horas";
    }
    
    public static void main(String[] args) {
        Hora casio = new Hora();
        Hora patito = new Hora();
        System.out.println(casio.darHora());
    }
}
