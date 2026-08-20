package actividad4;

import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[10];
		int candidato;
		boolean valido = false;
	
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print("Ingrese el valor N°" + (i+1) + ": ");
			
			do {
			
				candidato = scanner.nextInt();
				
				if (candidato != 0 && candidato >= -100 && candidato <= 100) {
					numeros[i]= candidato;
					valido = true;
				}else {
					System.out.println("El valor deber ser distinto de 0 y estar comprendido entre -100 y 100. Reintente.");
					System.out.print("Ingrese el valor N°" + (i+1) + ": ");
				}
				
			}while(!valido);
			valido= false;
			
		}
		
			//Muestra del vector
			System.out.print("VECTOR: ");
			for (int i = 0; i < numeros.length; i++) {
			    System.out.print(numeros[i] + " ");
			}
			scanner.close();
	

}}
