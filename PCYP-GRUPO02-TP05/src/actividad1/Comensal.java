package actividad1;

class Comensal extends Thread {
    private int id;
    private Mesa mesa;

    public Comensal(int id, Mesa mesa) {
        this.id = id;
        this.mesa = mesa;
    }

    @Override
    public void run() {
        try {
            mesa.servirseArroz(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}