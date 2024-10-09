/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sinc3;

/**
 *
 * @author Asier N. G
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        Sumatorio t1 = new Sumatorio(23);
        Sumatorio t2 = new Sumatorio(13);
        Sumatorio t3 = new Sumatorio(15);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        double formula = ((t1.getResult() + t2.getResult() + t3.getResult()) / 8);
        System.out.println("Formula = " + formula);
    }
}


