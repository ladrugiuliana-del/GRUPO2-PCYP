package actividad5;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[][] m1 = { {1, 2, 3}, {4, 5, 6} };
        int[][] m2 = { {7, 8, 9}, {10, 11, 12} };
        int[][] m3 = { {13, 14, 15}, {16, 17, 18} };

        ImpresorMatriz impresor = new ImpresorMatriz();

        HiloMatriz h1 = new HiloMatriz(m1, "Matriz A", impresor);
        HiloMatriz h2 = new HiloMatriz(m2, "Matriz B", impresor);
        HiloMatriz h3 = new HiloMatriz(m3, "Matriz C", impresor);

        h1.start();
        h2.start();
        h3.start();
    }
}
