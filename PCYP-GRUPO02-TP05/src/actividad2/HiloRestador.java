package actividad2;

public class HiloRestador extends Thread{
	public HiloRestador(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Ejercicio2.hayRecurso.acquire(); // Espera si h = 0

                Ejercicio2.mutex.acquire(); // Sección crítica
                Ejercicio2.h--;
                System.out.println(getName() + " decrementó h -> " + Ejercicio2.h);
                Ejercicio2.mutex.release();
            }
        } catch (InterruptedException e) {
        }
    }
}
