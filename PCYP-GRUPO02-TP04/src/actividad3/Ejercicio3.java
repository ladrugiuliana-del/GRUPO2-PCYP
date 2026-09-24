package actividad3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la primera cadena: ");
        String c1 = sc.nextLine();

        System.out.print("Ingrese la segunda cadena: ");
        String c2 = sc.nextLine();

        HiloCadena h1 = new HiloCadena(c1, "Hilo 1");
        HiloCadena h2 = new HiloCadena(c2, "Hilo 2");

        System.out.println("\n--- Inicio de Impresión Concurrente ---");
        h1.start();
        h2.start();

        try {
            h1.join();
            h2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n--- Fin de la impresión ---");
        sc.close();
    }
}
