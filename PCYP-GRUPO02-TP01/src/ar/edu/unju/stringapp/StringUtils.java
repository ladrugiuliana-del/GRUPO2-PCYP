package ar.edu.unju.stringapp;

public class StringUtils {
	
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
}
