package actividad5;

public class HiloCliente extends Thread {

    public HiloCliente(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        try {
        	Ejercicio5.mutex.acquire();

            if (Ejercicio5.sillasLibres > 0) {
                // Hay silla disponible: se sienta a esperar
            	Ejercicio5.sillasLibres--;
                System.out.println(getName() + " en ESPERA. Sillas libres: " + Ejercicio5.sillasLibres);

                Ejercicio5.barbero.release(); // Despierta/Avisa al barbero
                Ejercicio5.mutex.release();

                Ejercicio5.cliente.acquire(); // Espera su turno en el sillón
                System.out.println(getName() + " se está cortando el pelo.");

            } else {
                // No hay sillas: se retira
                System.out.println("❌ " + getName() + " encontró la barbería llena y SE FUE.");
                Ejercicio5.mutex.release();
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
