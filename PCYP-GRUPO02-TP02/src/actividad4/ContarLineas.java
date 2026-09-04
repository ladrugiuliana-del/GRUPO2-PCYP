package actividad4;

public class ContarLineas {
	private static final int UMBRAL_CORTO = 40;

    public static void main(String[] args) {
        
        String texto = 
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

        int contCortas = 0;
        int contLargas = 0;

        String lineaMasLarga = "";
        int longitudMaxima = 0;

        String lineaMasCorta = null;
        int longitudMinima = Integer.MAX_VALUE;

        String[] lineas = texto.split("\r\n|\n");

        for (String linea : lineas) {
            if (linea.trim().isEmpty()) {
                continue;
            }

            int longitudActual = linea.length();

            //Clasificación por longitud
            if (longitudActual < 40) {
                contCortas++;
            } else {
                contLargas++;
            }

            //Evaluación de la línea más larga
            if (longitudActual > longitudMaxima) {
                longitudMaxima = longitudActual;
                lineaMasLarga = linea;
            }

            // Evaluación de la línea más corta
            if (longitudActual < longitudMinima) {
                longitudMinima = longitudActual;
                lineaMasCorta = linea;
            }
        }

            System.out.println("Líneas cortas (< " + UMBRAL_CORTO + " caracteres): " + contCortas);
            System.out.println("Líneas largas (>= " + UMBRAL_CORTO + " caracteres): " + contLargas);
            System.out.println("\n--- LÍNEA MÁS LARGA ---");
            System.out.println("Texto: " + lineaMasLarga);
            System.out.println("Longitud: " + longitudMaxima + " caracteres");

            System.out.println("\n--- LÍNEA MÁS CORTA ---");
            System.out.println("Texto: " + lineaMasCorta);
            System.out.println("Longitud: " + longitudMinima + " caracteres");

    }
}
    

