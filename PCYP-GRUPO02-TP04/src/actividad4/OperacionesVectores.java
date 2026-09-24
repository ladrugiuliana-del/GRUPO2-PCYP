package actividad4;

import java.util.Random;

//Clase que representa la tarea de cada hilo
class Hilo extends Thread {
 int tamano;

 public Hilo(int tamano) {
     this.tamano = tamano;
 }

 @Override
 public void run() {
     int[] vector = new int[tamano];
     Random random = new Random();

     // 1. Llenado aleatorio del vector
     for (int i = 0; i < tamano; i++) {
         vector[i] = random.nextInt(10) + 1; // Números entre 1 y 10
     }

     // 2. Cálculos
     long suma = 0;
     long sumaCuadrados = 0;

     for (int num : vector) {
         suma += num;
         sumaCuadrados += (long) num * num;
     }

     double media = (double) suma / tamano;

     // 3. Mostrar resultados
     String resultado = ("--- Vector de tamaño " + tamano + " ---" +"\n"+
					     "Suma: " + suma + "\n" +
					     "Suma de cuadrados: " + sumaCuadrados + "\n" +
					     "Media: " + media + "\n");
     System.out.println(resultado);
	}
}