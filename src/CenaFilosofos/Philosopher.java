/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CenaFilosofos;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FP
 */
public class Philosopher extends Thread {

    private Semaphore leftFork, rightFork;
    private int id;

    public Philosopher(Semaphore leftFork, Semaphore rightFork, int id) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.id = id;
    }

    public void run() {
    try {
            while (true) {

    // Filósofo piensa
    System.out.println("Filósofo " + id + " está pensando.");
    // Filósofo intenta adquirir el tenedor izquierdo
    leftFork.acquire();
    System.out.println("Filósofo" + id + " ha tomado " + "el tenedor izquierdo.");
    // Filósofo intenta adquirir el tenedor derecho 
    rightFork.acquire(); System.out.println("Filósofo" +id + " ha tomado " + "el tenedor derecho.");
// Filósofo come
    System.out.println("Filósofo " + id + " está comiendo."); // Filósofo suelta el tenedor izquierdo 
    leftFork.release();
    System.out.println("Filósofo " + id + " ha soltado " + "el tenedor izquierdo.");
// Filósofo suelta el tenedor derecho
    rightFork.release();
    System.out.println("Filósofo " + id + " ha soltado "
                        + "el tenedor derecho.");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
