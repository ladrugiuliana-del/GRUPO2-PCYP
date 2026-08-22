package actividad4;

public class Operaciones {

	public static void sumarPromediarPositivos(int[] vector) {
        double suma = 0;
        int cantidadPositivos = 0;
        double promedio;
        
        for (int i = 0 ; i < vector.length ; i++) {
        	if(vector[i]>0) {
        		suma+= vector[i];
        		cantidadPositivos++;
        	}
        }
        
        System.out.println("  NÚMEROS POSITIVOS DEL VECTOR");
        
        if (cantidadPositivos > 0) {
            promedio = suma / cantidadPositivos;
            System.out.println("  SUMA: " + suma + "  |  PROMEDIO: " + promedio);
        } else {
            System.out.println("  No se encontraron números positivos en el vector.");
        }
        
    }
	
	//public static void sumarPromediarNegativos(int[] vector) {
        
    //}
	
	public static void sumarPromediarPosicionPar(int[] vector) {
		double suma = 0;
        double promedio;
        
        for (int i = 1 ; i < vector.length ; i++) {
        		suma+= vector[i];
        		i++;
        }

        promedio = suma / 5;
        
        System.out.println("\n  NÚMEROS EN POSICIÓN PAR DEL VECTOR");
        System.out.println("  SUMA: " + suma + "  |  PROMEDIO: " + promedio);
	}
	
	//public static void sumarPromediarNegativos(int[] vector) {
        
	//}
}
