package Unidad4.ProyectoSegundoPlazo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Conexión {
    Connection c;
    
    public Conexión() {
        String cadC = "jdbc:derby://localhost:1527/Librerías Gonvill";
        try {
            c = DriverManager.getConnection(cadC, "gonvill", "gonvill");
        } catch(SQLException e) {
            System.err.println("Falló la conexión " + e.getMessage());
        }
    }
    
    ArrayList<String> leer() {
        ArrayList<String> lista = new ArrayList();
        
        try {
            String sql = "Select * from Inventario";
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                lista.add(rs.getString("Título") + "\n" +
                        rs.getString("Autores") + "\n" + 
                        rs.getString("Editorial") + "\n" +
                        rs.getInt("Inventario") + "\n$" +
                        rs.getInt("PrecioVenta"));
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error en la Base de Datos.\n" + ex.getMessage());
        }
        return lista;
    }
}
