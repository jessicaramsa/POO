package Unidad4.demoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Conexión {
    Connection c;
    
    public Conexión(){
        String cadConexión = "jdbc:derby://localhost:1527/biblioteca";
        try{
            c = DriverManager.getConnection(cadConexión, "usuario", "usuario");
        } catch(SQLException e){
            System.err.println("Falló la conexión " + e.getMessage());
        }
    }
    
    ArrayList<String> leer(){
        ArrayList<String> lista = new ArrayList();
        try {
            String sql = "Select * from LIBROS";
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                lista.add(rs.getString("Título") + ", " +
                        rs.getString("Autor") + ", " +
                        rs.getString("Editorial") + ", " +
                        rs.getFloat("Precio"));
            }
            st.close();
            rs.close();
            return lista;
        } catch (SQLException ex) {
            System.err.println("Error en la B.D. " + ex.getMessage());
            return null;
        }
    }
    
    void close(){
        if(c != null){
            try {
                c.close();
            } catch (SQLException ex) {
                System.err.println("Problema al cerrar " + ex.getMessage());
            }
        }
    }
    
    public static void main(String[] args) {
        Conexión ejm = new Conexión();
        ArrayList<String> l = new ArrayList();
        if(ejm.c != null){
            l = ejm.leer();
            for(int i = 0; i < l.size(); i++){
                System.out.println(l.get(i));
            }
            ejm.close();
        }
        
    }
}
