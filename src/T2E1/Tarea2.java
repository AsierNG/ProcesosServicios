package T2E1;
public class Tarea2 extends Thread{
    
    @Override
    public void run() {
        for (int i = 20; i <= 30; i++) {
            System.out.println("Soy el hilo " + i + " y me pienso correr");
        }
    }
}
