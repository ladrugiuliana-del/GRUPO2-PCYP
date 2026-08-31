package actividad2;

	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;

	public class EscritorArchivo {

	    public static void main(String[] args) {
	        
	        String rutaDeseada = "C:\\PCYP-GRUPO02-TP02"; //ruta del directorio en el que queramos guardar el archivo .txt
	        File directorio = new File(rutaDeseada);
	        File archivoFinal;

	        // Intentamos crear la carpeta principal
	        boolean carpetaCreada = false;
	        try {
	            if (!directorio.exists()) {
	                carpetaCreada = directorio.mkdirs(); //Intenta crear la carpeta
	            } else {
	                carpetaCreada = true;
	            }
	        } catch (SecurityException e) {
	            carpetaCreada = false;
	        }

	        // Si no tenemos permisos o falló, usamos el directorio del proyecto
	        if (carpetaCreada && directorio.canWrite()) {
	            archivoFinal = new File(directorio, "Punto02.txt");
	        } else {
	            System.out.println("[!] No se tienen permisos en C:\\. Guardando en la carpeta raíz del proyecto...");
	            archivoFinal = new File("Punto02.txt");
	        }

	        // Formato para la fecha-hora
	        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	        // Texto a utilizar
	        String resultadoTexto = 
	                "Thy Prjyct Gtynbyrg yBk f Dn Q}jty, by M}gyl dy Cyrvuntys Suuvydru\n" +
	                "\n" +
	                "Th}s yBk }s fr thy sy f unyny unywhyry }n thy in}tyd Stutys und\n" +
	                "mst thyr purts f thy wrld ut n cst und w}th ulmst n rystr}ct}ns\n" +
	                "whutsyvyr. Y muy cpy }t, g}vy }t uwuy r ry-sy }t ndyr thy tyrms\n" +
	                "f thy Prjyct Gtynbyrg L}cynsy }ncldyd w}th th}s yBk r nl}ny ut\n" +
	                "www.gtynbyrg.rg. ]f y ury nt lcutyd }n thy in}tyd Stutys, y\n" +
	                "w}ll huvy t chyck thy luws f thy cntry whyry y ury lcutyd byfry\n" +
	                "s}ng th}s yBk.\n" +
	                "\n" +
	                "T}tly: Dn Q}jty\n" +
	                "\n" +
	                "Uthr: M}gyl dy Cyrvuntys Suuvydru\n" +
	                "\n" +
	                "Rylyusy Duty: Dycymbyr, 1999 [yBk #2000]\n" +
	                "[Mst rycyntly pdutyd: Junury 2, 2020]\n" +
	                "\n" +
	                "Lungugy: Spun}sh\n" +
	                "\n" +
	                "Chuructyr syt yncd}ng: iTF-8....\n" +
	                "\n" +
	                "Prdcyd by: un unnyms Prjyct Gtynbyrg vlntyyr und Juq}n Cyncu Ubylu\n" +
	                "\n" +
	                "*** STURT cF THY PRcJYCT GiTYNBYRG YBccK DcN Qi]JcTY ***";

	            // Separa el texto en un arreglo línea por línea
	            String[] lineas = resultadoTexto.split("\n");

	        // Escritura del archivo
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoFinal))) {
	            
	            for (String linea : lineas) {
	                String fechaHoraActual = LocalDateTime.now().format(formatoFecha);

	                String lineaConFecha = "[" + fechaHoraActual + "] " + linea;
	                
	                bw.write(lineaConFecha);
	                bw.newLine(); // Salto de línea
	            }

	            System.out.println("ARCHIVO CREADO EXITOSAMENTE EN: " + archivoFinal.getAbsolutePath());

	        } catch (IOException e) {
	            System.err.println("[!] Error al escribir el archivo: " + e.getMessage());
	        }
	    }
	}
