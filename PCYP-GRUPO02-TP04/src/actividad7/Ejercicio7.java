package actividad7;

public class Ejercicio7 {
    public static void main(String[] args) {
        RecursoCompartido recurso = new RecursoCompartido();

        Thread[] sumadores = new Thread[5];
        Thread[] restadores = new Thread[5];

        for (int i = 0; i < 5; i++) {
            sumadores[i] = new HiloSumador(recurso, "Sumador-" + (i + 1));
            restadores[i] = new HiloRestador(recurso, "Restador-" + (i + 1));
            
            sumadores[i].start();
            restadores[i].start();
        }

        for (int i = 0; i < 5; i++) {
            try {
                sumadores[i].join();
                restadores[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nProceso terminado. Valor final de h: " + recurso.getH());
    }
}
