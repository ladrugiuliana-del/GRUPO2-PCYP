package actividad5;

class HiloMatriz extends Thread {
    private int[][] matriz;
    private String nombreMatriz;
    private ImpresorMatriz impresor;

    public HiloMatriz(int[][] matriz, String nombreMatriz, ImpresorMatriz impresor) {
        this.matriz = matriz;
        this.nombreMatriz = nombreMatriz;
        this.impresor = impresor;
    }

    @Override
    public void run() {
        for (int i = 0; i < matriz.length; i++) {
            impresor.imprimirFila(nombreMatriz, i, matriz[i]);
        }
    }
}
