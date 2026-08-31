package actividad7;

import java.util.Random;

public class SopaDeLetras {

    public static void main(String[] args) {
        int tamanio = 12;
        char[][] matriz = new char[tamanio][tamanio];
        Random random = new Random();

        String[] palabras = {
            "CAMELLO", "ELEFANTE", "AGUILA", "CAMALEON", "AVESTRUZ",
            "COCODRILO", "ANTILOPE", "SERPIENTE", "BUFALO", "COMADREJA"
        };

        // Colocar cada palabra
        for (String palabra : palabras) {
            boolean colocada = false;

            while (!colocada) {
                int fila = random.nextInt(tamanio);
                int col = random.nextInt(tamanio);
                int dir = random.nextInt(3); // 0: Horizontal, 1: Vertical, 2: Diagonal

                int dFila = (dir == 1 || dir == 2) ? 1 : 0;
                int dCol = (dir == 0 || dir == 2) ? 1 : 0;

                //Comprobar si cabe en la matriz
                if (fila + dFila * (palabra.length() - 1) < tamanio &&
                    col + dCol * (palabra.length() - 1) < tamanio) {

                    // Comprobar si las casillas están libres o tienen la misma letra
                    boolean sePuede = true;
                    for (int i = 0; i < palabra.length(); i++) {
                        char c = matriz[fila + i * dFila][col + i * dCol];
                        if (c != '\0' && c != palabra.charAt(i)) {
                            sePuede = false;
                            break;
                        }
                    }

                    // escribir si la posición es válida
                    if (sePuede) {
                        for (int i = 0; i < palabra.length(); i++) {
                            matriz[fila + i * dFila][col + i * dCol] = palabra.charAt(i);
                        }
                        colocada = true;
                    }
                }
            }
        }

        // Mostrar matriz
        System.out.println("---- SOPA DE LETRAS ----\n");
        for (int f = 0; f < tamanio; f++) {
            for (int c = 0; c < tamanio; c++) {
                if (matriz[f][c] == '\0') {
                    matriz[f][c] = (char) ('A' + random.nextInt(26));
                }
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }
}