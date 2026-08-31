package actividad3;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class ProximosAños {

	public static void main(String[] args) {
		LocalDate fechaActual = LocalDate.now();
		
		for (int i=0; i <= 100 ;++i) {
			LocalDate fechaModificada = fechaActual.withYear(fechaActual.getYear() + i);
			String nombreDia = fechaModificada.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("es"));
			System.out.println( "Fecha: " + fechaModificada + " - Dia de la fecha: " + nombreDia);
		}

	}

}
