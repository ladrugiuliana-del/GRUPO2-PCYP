package actividad7;

class HiloSumador extends Thread {
    private RecursoCompartido recurso;

    public HiloSumador(RecursoCompartido recurso, String nombre) {
        super(nombre);
        this.recurso = recurso;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            recurso.sumar();
        }
    }
}
