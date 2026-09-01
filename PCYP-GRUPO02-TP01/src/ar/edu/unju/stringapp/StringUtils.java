package ar.edu.unju.stringapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

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
	
	public static int contarPalabras(String texto) {
        // 1. Validar si la cadena está vacía o es nula
        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }

        // 2. Limpiar espacios iniciales/finales y dividir por uno o más espacios
        String[] palabras = texto.trim().split("\\s+");

        // 3. Devolver la cantidad de elementos
        return palabras.length;
    }
	
	public static boolean esVocal(char caracter) {
		switch (caracter) {
		case 'a','e','i','o','u','A','E','I','O','U':
			return true;
		default:
			return false;
		}
	}
	
	public static boolean esVacio(char caracter) {
		if (caracter == ' ') {
			return true;
		}
		return false;
	}
	
	public static boolean esMayuscula(char caracter) {
		if (caracter >= 65 & caracter <=90) {
			return true;
		}
		return false;
	}

public static int contarLineas(String texto) {

    if (texto == null || texto.isEmpty()) {
        return 0;
    }
    
    // Corta el texto en cada salto de línea y cuenta los fragmentos
    String[] lineas = texto.split("\r\n|\r|\n");
    return lineas.length;
	}


public static boolean esSigno(char caracter) {
	if ((caracter >= 33 & caracter <=47) || (caracter >= 58 & caracter <=63)) {
		return true;
	}
	return false;
	}

public static String codificarVocales(String frase) {
    if (frase == null) {
        return "";
    }

    StringBuilder resultado = new StringBuilder();
    String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";

    for (int i = 0; i < frase.length(); i++) {
        char c = frase.charAt(i);

        // Verificamos si el carácter actual es una vocal
        if (vocales.indexOf(c) != -1) {
            // 1. Obtenemos su valor ASCII/Unicode y le adicionamos 20
            int nuevoCodigoAscii = (int) c + 20;
            
            // 2. Convertimos el nuevo valor de regreso a carácter
            char nuevoCaracter = (char) nuevoCodigoAscii;
            
            // 3. Lo agregamos a nuestro resultado
            resultado.append(nuevoCaracter);
        } else {
            // Si no es vocal, se mantiene tal cual está
            resultado.append(c);
        }
    }

    return resultado.toString();
}
}


