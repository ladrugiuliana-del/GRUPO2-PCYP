package actividad2;

public class HiloSumador extends Thread{
	public HiloSumador(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Ejercicio2.mutex.acquire(); // Sección crítica
                Ejercicio2.h++;
                System.out.println(getName() + " incrementó h -> " + Ejercicio2.h);
                Ejercicio2.mutex.release();

                Ejercicio2.hayRecurso.release(); // Incrementa permisos disponibles
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
