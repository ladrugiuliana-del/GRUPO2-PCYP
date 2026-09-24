package actividad1;

public class Ejercicio1 {
    public static void ejecutarPrueba(int ejecucion, int num1, int num2) {
        System.out.println("--- EJECUCIÓN N° " + ejecucion + " ---");
        
        HiloFactorial h1 = new HiloFactorial(num1, "Hilo-Factorial-" + num1);
        HiloFactorial h2 = new HiloFactorial(num2, "Hilo-Factorial-" + num2);

        h1.start();
        h2.start();

        try {
            h1.join();
            h2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ejecutarPrueba(1, 5, 7);
        ejecutarPrueba(2, 6, 4);
        ejecutarPrueba(3, 8, 5);
    }
}
