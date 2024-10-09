/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Callable;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        Long index1 = 1L;
        Long index2 = 100L;
        
        try{
            //ordenamos por si el primero es mayor que el segundo

            
            Runtime runtime = Runtime.getRuntime();
            int num_pro = runtime.availableProcessors();
            System.out.println("Dividiendo la tarea "+num_pro+" hilos");
            
            //obtener los rangos
            Long incremento = index2 / num_pro;
            
            ArrayList<FutureTask<Long>> sumaFuture = new ArrayList<FutureTask<Long>>();
            
            Thread vectorHilos[] = new Thread[num_pro];
            
            for (int i = 0; i < num_pro; i++) {
                Long ini= index1 + incremento * i;
                Long fin= index1 + incremento * (i+1)-1;
                if(fin > index2)
                    fin = index2;
                
                Suma sumaParcial = new Suma(ini,fin);
                
                sumaFuture.add(new FutureTask<Long>(sumaParcial));
                
                vectorHilos[i] = new Thread(sumaFuture.get(i));
                vectorHilos[i].setName("hilo "+i);
                vectorHilos[i].start();
            }
            
            long ac = 0;
            
            for (int i = 0; i < num_pro; i++) {
                vectorHilos[i].join();
                ac= ac + sumaFuture.get(i).get();
            }
            System.out.println("Suma total: "+ac);
            
            System.out.println(incremento);
        }catch(Exception e){
            
        }
    }
}
