/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Callable;

import java.util.concurrent.Callable;

/**
 *
 * @author FP
 */
public class Suma implements Callable<Long> {

    private long n1;
    long n2;

    public Suma() {
        this.n1 = 0;
        this.n2 = 0;
    }

    public Suma(long n1, long n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public Long call() {
        long result = 0;
        try {
            Thread hiloActual = Thread.currentThread();
            System.out.println("Iniciando el hilo "+hiloActual.getName()+ ": Suma ("+this.n1+this.n2+")");
            
            for (Long i = this.n1; i <= this.n2; i++) {
                result = result+i;
            }
            
            //añadimos una pausa para simular mayor carga en los calculos
            Thread.sleep(500);
            System.out.println("Finalizando el hilo "+hiloActual.getName());
            System.out.println("Resultado del hilo "+result);
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
