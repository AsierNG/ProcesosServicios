/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sinc1;

/**
 *
 * @author FP
 */
public class RecursoJardin {

    private int cuenta;

    public RecursoJardin() {
        cuenta = 100;
    }

    public synchronized void incrementaCuenta() {
        System.out.println("hilo " + Thread.currentThread().getName() + "----- Entra en jardin");
        cuenta++;
        System.out.println(cuenta + " en jardin");
    }

    public synchronized void decrementaCuenta() {
        System.out.println("hilo " + Thread.currentThread().getName() + "----- Sale en jardin");
        cuenta--;
        System.out.println(cuenta + " en jardin");
    }

}
