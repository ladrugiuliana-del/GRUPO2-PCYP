package ar.edu.unju.stringapp;

public class StringApp {

	public static void main(String[] args) {
		String texto = StringUtils.convertirArchivo("src/resources/TP01Frase.txt");
		int cantidadVocales = 0,
			cantidadVacios = 0,
			cantidadPalabras = 0,
			cantidadMayusculas = 0,
			cantidadLineas = 0,
			cantidadSignos = 0;
			
		
		for(char caracter : texto.toCharArray()) {
			if(StringUtils.esVocal(caracter)) {
				cantidadVocales++;
			}
			if(StringUtils.esVacio(caracter)) {
				cantidadVacios++;
			}
			if(StringUtils.esMayuscula(caracter)) {
				cantidadMayusculas++;
			}
			if(StringUtils.esSigno(caracter)) {
				cantidadSignos++;
			}
		}
		
		cantidadPalabras = StringUtils.contarPalabras(texto);
		cantidadLineas = StringUtils.contarLineas(texto);
		
		System.out.println("Cantidad de Vocales: " + cantidadVocales);
		System.out.println("Cantidad de Vacios: " + cantidadVacios);
		System.out.println("Cantidad de Palabras: " + cantidadPalabras);
		System.out.println("Cantidad de Mayusculas: " + cantidadMayusculas);
		System.out.println("Cantidad de Saltos de Línea: " + cantidadLineas);
		System.out.println("Cantidad de Signos de Puntuación: " + cantidadSignos);
		
		//Comando que usé para testear como se vé el archivo en consola
		//System.out.println(StringUtils.convertirArchivo("src/resources/TP01Frase.txt"));
	}
}
