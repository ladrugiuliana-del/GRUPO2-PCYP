package ar.edu.unju.stringapp;


public class StringApp {

	public static void main(String[] args) {
		String texto = "Hola esto es una prueba";
		int cantidadVocales = 0,
			cantidadVacios = 0,
			cantidadPalabras = 0,
			cantidadMayusculas = 0;
		
		for(char caracter : texto.toCharArray()) {
			System.out.println(caracter);
			if(StringUtils.esVocal(caracter)) {
				cantidadVocales++;
			}
			if(StringUtils.esVacio(caracter)) {
				cantidadVacios++;
			}
			if(StringUtils.esMayuscula(caracter)) {
				cantidadMayusculas++;
			}
		}
		System.out.println("Cantidad de Vocales: " + cantidadVocales);
		System.out.println("Cantidad de Vacios: " + cantidadVacios);
		System.out.println("Cantidad de Palabras: " + cantidadPalabras);
		System.out.println("Cantidad de Mayusculas: " + cantidadMayusculas);
	}
}
