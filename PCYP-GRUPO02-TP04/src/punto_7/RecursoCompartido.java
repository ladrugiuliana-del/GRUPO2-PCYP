package punto_7;

class RecursoCompartido {
    private int h = 0;

    public synchronized void sumar() {
        h++;
        System.out.println(Thread.currentThread().getName() + " sumó 1. Valor actual de h: " + h);
        notifyAll();
    }

    public synchronized void restar() {
        while (h == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        h--;
        System.out.println(Thread.currentThread().getName() + " restó 1. Valor actual de h: " + h);
    }

    public int getH() {
        return h;
    }
}
