/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T1E1;


/**
 *
 * @author FP
 */
import java.io.IOException;
import java.util.Scanner;

public class main {

    public void ejecutar(String ruta) {
        ProcessBuilder pb;
        try {
            pb = new ProcessBuilder(ruta);
            pb.start();
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        
        
        
        String rutaChrome = scanner.next();
        String rutaPowerPoint = scanner.next();

        main ejecutor = new main();
        ejecutor.ejecutar(rutaChrome);
        Thread.sleep(3000);
        ejecutor.ejecutar(rutaPowerPoint);

        System.out.println("OK");
    }
}

