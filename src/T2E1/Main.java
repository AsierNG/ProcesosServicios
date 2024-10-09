package T2E1;

public class Main {

    public static void main(String[] args) {
        Tarea tarea = new Tarea();
        Tarea2 tarea2 = new Tarea2();

        try {
            tarea.start();
            tarea.join();
        } catch (InterruptedException ie) {
            ie.getLocalizedMessage();
        }
        try {
            tarea2.start();
            tarea2.join();
        } catch (InterruptedException ie) {
            ie.getLocalizedMessage();
        }
        System.out.println("Yo soy el hilo principal");
        System.out.println("Me he corrido");
    }

}
