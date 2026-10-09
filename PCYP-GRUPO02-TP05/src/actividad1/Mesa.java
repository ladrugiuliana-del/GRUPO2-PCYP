package actividad1;

import java.util.concurrent.Semaphore;

public class Mesa {
    private final int totalComensales = 5;
    private Semaphore[] turnos = new Semaphore[totalComensales];

    public Mesa() {
        turnos[0] = new Semaphore(1);
        
        for (int i = 1; i < totalComensales; i++) {
            turnos[i] = new Semaphore(0);
        }
    }

    public void servirseArroz(int idComensal) throws InterruptedException {
        turnos[idComensal].acquire();

        // Sección crítica
        System.out.println("🥣 Comensal " + (idComensal + 1) + " se está sirviendo arroz...");

        int siguiente = (idComensal + 1) % totalComensales;

        turnos[siguiente].release();
    }
}