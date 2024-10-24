/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T3E5;

import T3E4.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author FP
 */
public class Main {

    public static void main(String[] args) throws MalformedURLException, IOException {
        String cadena;
        URL url = new URL("http://damiansu.com");
        URLConnection conexion = url.openConnection();
        
        System.out.println("\n==============================================================\n");
        System.out.println("Direccion [getURL()]: " + conexion.getURL());
        Date fecha = new Date(conexion.getLastModified());
        System.out.println("Direccion [getLastModified()]: " + conexion.getLastModified());
        System.out.println("Direccion [getContentType()]: " + conexion.getContentType());
        System.out.println("\n==============================================================\n");
        
        System.out.println("Campos 1 y 4 de cabecera");
        System.out.println("getHeaderField(1) --> " + conexion.getHeaderField(1));
        System.out.println("getHeaderField(1) --> " + conexion.getHeaderField(4));
        System.out.println("\n==============================================================\n");

        System.out.println("Todos los campos de la cabecera con getHeaderFields(): ");

        Map camposcabecera = conexion.getHeaderFields();
        Iterator it = camposcabecera.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry map = (Map.Entry) it.next();
            System.out.println(map.getKey() + " : " + map.getValue());
        }
        System.out.println("\n==============================================================\n");
    }
}
