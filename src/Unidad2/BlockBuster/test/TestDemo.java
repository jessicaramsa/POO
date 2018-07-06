package Unidad2.BlockBuster.test;

import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        String entrada = new Scanner(System.in).nextLine();
        Scanner t = new Scanner(System.in);

        if(entrada.matches("[a-zA-Z]{4}\\d{6}[H|h|M|m](GT|VZ|NE)[a-zA-Z]{3}\\d{2}")){
            System.out.println("Vas bien");
        } else{
            System.err.println("Frío");
        }
    }
}
