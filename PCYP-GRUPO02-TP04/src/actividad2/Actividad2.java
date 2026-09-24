package actividad2;
//Un proceso muestra números pares del 1 al 10, y otro proceso
//muestra números impares del 1 al 10. Implementar el algoritmo correspondiente,

public class Actividad2 {
	public static void main(String[] args) {

        // Hilo para la Tarea 1
        Thread pares = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1 ; i<=10 ; i++) {
                	if(i % 2 == 0) {
                		System.out.println(i);
                	}
                }
                	
            }
        });

        // Hilo para la Tarea 2
        Thread impares = new Thread(new Runnable() {
        	@Override
            public void run() {
                for(int i=1 ; i<=10 ; i++) {
                	if(i % 2 != 0) {
                		System.out.println(i);
                	}
                }
                	
            }
        });

        // Ejecución concurrente de ambos hilos
        impares.start();
        pares.start();
	}
}
