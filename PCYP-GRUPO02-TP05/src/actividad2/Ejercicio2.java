package actividad2;

import java.util.concurrent.Semaphore;

public class Ejercicio2 {
	public static int h = 0;

    // Semáforo para exclusión mutua (lock)
    public static final Semaphore mutex = new Semaphore(1);

    // Semáforo para controlar que h no sea negativa
    public static final Semaphore hayRecurso = new Semaphore(0);
    
    public static void main(String[] args) throws InterruptedException {
        Thread[] sumadores = new Thread[5];
        Thread[] restadores = new Thread[5];

        // Creación e inicio de los 5 hilos sumadores y 5 restadores
        for (int i = 0; i < 5; i++) {
            sumadores[i] = new HiloSumador("Sumador-" + (i + 1));
            restadores[i] = new HiloRestador("Restador-" + (i + 1));

            sumadores[i].start();
            restadores[i].start();
        }

        // Esperar a que todos terminen
        for (int i = 0; i < 5; i++) {
            sumadores[i].join();
            restadores[i].join();
        }

        System.out.println("\n✅ Todos los hilos terminaron. Valor final de h = " + h);
    }
}
