package actividad6;

//Comensal.java y Mesa.java

public class Actividad6_Principal {
	// Agregamos throws Exception al main
    public static void main(String[] args) throws Exception {
        Mesa mesa = new Mesa();
        Comensal[] comensales = new Comensal[5];

        // BUCLE 1: Se crean e inician los 5 hilos
        for (int i = 0; i < 5; i++) {
            comensales[i] = new Comensal(i, mesa);
            comensales[i].start();
        }

        // BUCLE 2: Se espera a que todos terminen para dar paso al último mensaje
        for (int i = 0; i < 5; i++) {
            comensales[i].join();
        }

        System.out.println("🎉 Todos los comensales han terminado de cenar.");
    }
}
