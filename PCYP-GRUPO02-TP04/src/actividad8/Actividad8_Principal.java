package actividad8;

//Multiplicacion.java

public class Actividad8_Principal {
	 public static void main(String[] args) throws Exception {
		 Multiplicacion[] mult = new Multiplicacion[10];
		 
		 for (int i = 0; i < mult.length; i++) {
			 mult[i] = new Multiplicacion(i+1);
	         mult[i].start();
		 }
		 
		 for (int i = 0; i < 10; i++) {
	            mult[i].join();
	     }

	     System.out.println("✅ FIN DEL HILO PRINCIPAL.");
	 }
}
