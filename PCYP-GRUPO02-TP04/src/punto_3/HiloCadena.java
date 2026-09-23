package punto_3;

class HiloCadena extends Thread {
    private String cadena;

    public HiloCadena(String cadena, String nombre) {
        super(nombre);
        this.cadena = cadena;
    }

    @Override
    public void run() {
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println("[" + getName() + "]: " + cadena.charAt(i));
            try {
            // Pequeña pausa para ilustrar el intercalado entre hilos
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
