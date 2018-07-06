package Repaso.DBCanciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDatos {
    Connection c;

    public void conectar() {
        try {
            c = DriverManager.getConnection("jdbc:derby://localhost:1527/Música",
                    "usuario", "usuario");
        } catch (SQLException ex) {
            System.out.println("Problemas con la conexión " + ex.getMessage());
        }
    }

    public void consultar() {
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from canciones");
            while (rs.next()) {
                System.out.println(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void desconectar() {
        try {
            c.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
