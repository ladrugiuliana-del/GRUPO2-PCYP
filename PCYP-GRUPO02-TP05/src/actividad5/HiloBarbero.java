package actividad5;

public class HiloBarbero extends Thread{
	public HiloBarbero(String nombre) {
        super(nombre);
    }
	
	@Override
    public void run() {
        while (true) {
            try {
            	// Espera a que llegue un cliente (si no hay, se duerme)
            	Ejercicio5.barbero.acquire();

                Ejercicio5.mutex.acquire();
                Ejercicio5.sillasLibres++;
                Ejercicio5.cliente.release(); // Avisa al cliente que puede cortarse el pelo
                Ejercicio5.mutex.release();

                // Corta el pelo 
                System.out.println("💈 El barbero está cortando el pelo...");
                Thread.sleep(2000);
                System.out.println("✅ El barbero terminó de cortar el pelo.");

            } catch (InterruptedException e) {
                System.out.println("La barbería cerró.");
                break;
            }
        }
    
	}
}
