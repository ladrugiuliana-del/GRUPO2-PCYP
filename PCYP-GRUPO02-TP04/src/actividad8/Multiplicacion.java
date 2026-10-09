package actividad8;

class Multiplicacion extends Thread{
	private int n;

	public Multiplicacion(int n) {
		super();
		this.n = n;
	}
	
	@Override
    public void run() {
		synchronized (System.out) {
            System.out.println("=== TABLA DEL " + n + " ===");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
            }
            System.out.println();
		}
	}
}
