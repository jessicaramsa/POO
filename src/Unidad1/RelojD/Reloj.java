package Unidad1.RelojD;

import java.util.Calendar;
import javax.swing.ImageIcon;

public class Reloj {
    public String darHora() {
        Calendar calendario = Calendar.getInstance();

        if (calendario != null) {
            if (((calendario.get(Calendar.HOUR)) >= 1) &&
                ((calendario.get(Calendar.HOUR)) < 2)) {
                return "Son las " + calendario.get(Calendar.HOUR) + ":"
                        + calendario.get(Calendar.MINUTE) + " horas."
                        + "\n¿Qué necesitas?" +
                        new ImageIcon("src/Unidad1/Reloj/Abierto.jpg");
            } else {
                return "Horario no laborable.\nVuelve dentro de un horario: "
                        + "13-14 hrs" +
                        new ImageIcon("src/Unidad1/Reloj/Cerrado.jpg");
            }
        }
        return "Son las " + calendario.get(Calendar.HOUR) + ":"
                + calendario.get(Calendar.MINUTE) + " horas";
    }
}
