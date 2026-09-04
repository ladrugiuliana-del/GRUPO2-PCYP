package actividad5;

public class AplicacionNumeros {

	public static void main(String[] args) {
		
		String texto = StringUtils.convertirArchivo("src/actividad5/TP02Numeros.txt");

		System.out.println("\nCadena original del enunciado: " + texto);
		
		texto = StringUtils.limpiarCadena(texto, "0123456789, ");
		
		System.out.println("\nLista de numeros limpia: " + texto);
		
		System.out.println("\nCantidad de numeros existentes en la cadena: " + texto.split(" ").length);
		
		System.out.println("\n Suma de todos los numeros del arreglo:" + StringUtils.sumaNumeros(texto));
	}

}
