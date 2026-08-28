package ar.edu.unju.aplicacion;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero;
		boolean valido = false;
	
		System.out.print("Ingrese un solo dígito (0-9): ");
		do {
			numero = scanner.nextInt();
			
	        if(numero >= 0 && numero <= 9) {
	        	
	    		System.out.print("Usted ingreso el número ");
	            valido = true;
	            
	        }else {
	        	System.out.print("Valor incorrecto. Ingrese un solo dígito (0-9): ");
	        }
	            
		} while(!valido);
		
		
		switch (numero) {
        case 0 -> System.out.println("CERO");
        case 1 -> System.out.println("UNO");
        case 2 -> System.out.println("DOS");
        case 3 -> System.out.println("TRES");
        case 4 -> System.out.println("CUATRO");
        case 5 -> System.out.println("CINCO");
        case 6 -> System.out.println("SEIS");
        case 7 -> System.out.println("SIETE");
        case 8 -> System.out.println("OCHO");
        case 9 -> System.out.println("NUEVE");
        default -> System.out.println("Opción no válida"); // Se ejecuta si no coincide con ningún caso
		}
		
		System.out.println("--- FIN DEL PROGRAMA ---");
		scanner.close();
	}
}