package actividad1;

public class HiloFactorial extends Thread {
    private int numero;
    private long resultado;

    public HiloFactorial(int numero, String nombreHilo) {
        super(nombreHilo);
        this.numero = numero;
    }

    @Override
    public void run() {
        resultado = calcularFactorial(numero);
        System.out.println("[" + getName() + "] El factorial de " + numero + " es: " + resultado);
    }

    private long calcularFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
