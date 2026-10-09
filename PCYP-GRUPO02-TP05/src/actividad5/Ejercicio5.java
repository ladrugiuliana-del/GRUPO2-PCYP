package actividad5;

import java.util.concurrent.Semaphore;

public class Ejercicio5 {

    public static final int N_SILLAS = 5; // Cantidad de sillas de espera
    public static int sillasLibres = N_SILLAS;

    public static final Semaphore barbero = new Semaphore(0);
    public static final Semaphore cliente = new Semaphore(0);
    public static final Semaphore mutex = new Semaphore(1);

    public static void main(String[] args) throws InterruptedException {
        
        HiloBarbero barberoHilo = new HiloBarbero("Barbero");
        barberoHilo.setDaemon(true); //(hilo daemon, interrumplible al final)
        barberoHilo.start();
        
        System.out.println("--- Barbería ABIERTA ---\n");
        
        // Llegada de clientes
        for (int i = 1; i <= 10; i++) {
            HiloCliente c = new HiloCliente("Cliente " + i);
            c.start();
            Thread.sleep((long) (Math.random() * 1000)); // Llegan secuencialmente con esperas variables entre sí
        }

        Thread.sleep(15000); // Tiempo para dejar correr la simulación
        System.out.println("\n--- Barbería CERRADA ---");
    }
}
