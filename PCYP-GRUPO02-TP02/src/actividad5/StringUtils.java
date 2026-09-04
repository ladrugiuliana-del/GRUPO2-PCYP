package actividad5;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;

public class StringUtils {
	
	public static String convertirArchivo(String rutaArchivo) {
		String contenido = null;
		
		try {
            // En esta linea tenemos que especificar la ruta del archivo .txt que queremos convertir
            Path ruta = Path.of(rutaArchivo); 
            contenido = Files.readString(ruta); 
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
		return contenido;
	}
	
	public static String limpiarCadena(String texto, String cadenaPermitida){
		String caracteresPermitidos = cadenaPermitida;
		String cadenaNueva = "";
		String cadenaAux = "";
		
		for (int i = 0; i < texto.toCharArray().length; ++i){
			
			Character caracter = texto.toCharArray()[i];
			for(int j = 0; j < caracteresPermitidos.toCharArray().length; j++) {
			
				if (caracter.equals(caracteresPermitidos.toCharArray()[j])){
					cadenaAux = cadenaAux + caracter;
				}
			}
		}
		//Acá limpiamos las comas de la cadena
		for (String numero :  cadenaAux.split(",")) {
			cadenaNueva += " " + numero.trim();
		}
		
		return cadenaNueva.trim();
	}
	
	public static int sumaNumeros(String texto) {
		int suma = 0;

		String[] numerosAsumar = texto.split(" ");
		
		for (String numero : numerosAsumar) {
			suma += Integer.parseInt(numero);
		}
		
		return suma;
	}
	
	
}
