package actividad4;

//OperacionesVeectores.java

public class Actividad4_Principal {

	public static void main(String[] args) {

		// Creamos las dos instancias con diferente tamaño
		Hilo hilo1 = new Hilo(5);
		Hilo hilo2 = new Hilo(10);

		// Arrancamos los hilos
		hilo1.start();
		hilo2.start();
	}
}
