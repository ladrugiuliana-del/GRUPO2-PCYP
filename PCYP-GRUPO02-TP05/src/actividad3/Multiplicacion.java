package actividad3;

import java.util.concurrent.Semaphore;

class Multiplicacion extends Thread {
    private int n;
    private Semaphore semaforo;

    public Multiplicacion(int n, Semaphore semaforo) {
        super();
        this.n = n;
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        try {
            semaforo.acquire();

            System.out.println("=== TABLA DEL " + n + " ===");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
            }
            System.out.println();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaforo.release();
        }
    }
}
