package Unidad2.Soft;

import java.util.ArrayList;

public class TestAL {
    public static void main(String[] args) {
        ArrayList cosas = new ArrayList();
        cosas.add("Pintarrón");
        cosas.add(150);
        cosas.add(1.60f);

        System.out.println(cosas.size());
        for(Object x : cosas) {
            System.out.println(x);
        }
    }
}
