/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T3E1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author FP
 */
public class Main {

    public static void main(String[] args) {
        InetAddress dir = null;

        try {
            System.out.println("======================================");
            System.out.println("Salido para localhost");
            dir = InetAddress.getByName("google.es");
            pruebaMetodos(dir);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }

    public static void pruebaMetodos(InetAddress dir) {
        System.out.println("\tMetodo getLocalHost(): " + dir);
        InetAddress dir2;
        try{
            dir2 = InetAddress.getLocalHost();
            System.out.println("\tMetodo getLocalHost(): " + dir2);
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
        System.out.println("\tMetodo getHostName(): "+dir.getHostName());
        System.out.println("\tMetodo getHostAddress(): "+dir.getHostAddress());
        System.out.println("\tMetodo toString(): "+dir.toString());
        System.out.println("\tMetodo getCanonicalHostName(): "+dir.getCanonicalHostName());
    }
}
