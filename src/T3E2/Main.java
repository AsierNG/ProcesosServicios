/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T3E2;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author FP
 */
public class Main {

    public static void main(String[] args) {
        URL url;
        try{
        System.out.println("Constructor simple para una URL");
        url = new URL("https://www.marca.com/");
        visualizar(url);
        }catch(MalformedURLException e){
            e.printStackTrace();
        }
    }

    private static void visualizar(URL url) {
        System.out.println("\t URL completa: " + url.toString());
        System.out.println("\t getProtocol(): " + url.getProtocol());
        System.out.println("\t getHost(): " + url.getHost());
        System.out.println("\t getPort(): " + url.getPort());
        System.out.println("\t getFile(): " + url.getFile());
        System.out.println("\t getUserInfo(): " + url.getUserInfo());
        System.out.println("\t getPath(): " + url.getPath());
        System.out.println("\t getAuthority(): " + url.getAuthority());
        System.out.println("\t getQuery(): " + url.getQuery());
        System.out.println("============================================ =");
    }
}
