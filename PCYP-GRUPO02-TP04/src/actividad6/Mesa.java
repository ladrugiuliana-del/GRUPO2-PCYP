package actividad6;

public class Mesa {
	private int turnoActual = 0;
    private final int totalComensales = 5;

     
    public synchronized void servirseArroz(int idComensal) throws InterruptedException {
        // Mientras no sea su turno, el hilo espera
        while (idComensal != turnoActual) {
            wait();
        }

        // Sección crítica
        System.out.println("🥣 Comensal " + (idComensal+1) + " se está sirviendo arroz...");

        // Pasa el turno al siguiente comensal (0 -> 1 -> 2 -> 3 -> 4 -> 0)
        turnoActual = (turnoActual + 1) % totalComensales;

        notifyAll();
    }
}
