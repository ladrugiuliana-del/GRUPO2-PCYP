package actividad5;

class ImpresorMatriz {
    public synchronized void imprimirFila(String nombreMatriz, int numFila, int[] fila) {
        System.out.print(nombreMatriz + " [Fila " + numFila + "]: ");
        for (int val : fila) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
