package Unidad4.MangaCreaturesInJava.TestCreatures;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseReader implements Lector {
    @Override
    public ArrayList<String> leer() {
        ArrayList<String> lista = new ArrayList();

        try {
            Connection c;
            c = DriverManager.getConnection("jdbc:derby://localhost:1527/MangaCreaturesProject",
                    "usuario", "usuario");
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("Select * from creatures");
            while (rs.next()) {
                lista.add(rs.getInt("numero") + "; "
                        + rs.getString("categoría") + "; "
                        + rs.getString("descripción"));
            }
            rs.close();
            c.close();
        } catch (Exception e) {
            System.err.println("Error\n" + e.getMessage());
            System.exit(1);
        }
        return lista;
    }
}
