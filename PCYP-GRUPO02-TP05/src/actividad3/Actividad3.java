package actividad3;

import java.util.concurrent.Semaphore;

public class Actividad3 {
    public static void main(String[] args) throws Exception {
        Semaphore semaforo = new Semaphore(1);
        Multiplicacion[] mult = new Multiplicacion[10];

        for (int i = 0; i < mult.length; i++) {
            mult[i] = new Multiplicacion(i + 1, semaforo);
            mult[i].start();
        }

        for (int i = 0; i < 10; i++) {
            mult[i].join();
        }

        System.out.println("✅ FIN DEL HILO PRINCIPAL.");
    }
}