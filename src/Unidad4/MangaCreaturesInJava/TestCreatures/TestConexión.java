package Unidad4.MangaCreaturesInJava.TestCreatures;

import java.util.ArrayList;

public class TestConexión {
    public static void main(String[] args) {
        DatabaseReader input = new DatabaseReader();
        ArrayList<String> out = input.leer();
        System.out.println(out.get(1));
    }
}
