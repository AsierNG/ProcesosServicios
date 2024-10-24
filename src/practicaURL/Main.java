/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author FP
 */
public class Main {

    public static void main(String[] args) throws MalformedURLException, IOException {
        String cadena;
        URL url = new URL("https://www.marca.com/robots.txt");
        URLConnection conexion = url.openConnection();
        System.out.println("\n=====================[Propiedades Web]========================\n");
        System.out.println("respuesta servidor --> " + conexion.getHeaderField("Server"));
        System.out.println("software --> " + conexion.getHeaderField(null));
        System.out.println("\n==============================================================\n");

        System.out.println("Contenido de [url.getFile()]: " + url.getFile());
        BufferedReader pagina = new BufferedReader(new InputStreamReader(url.openStream()));
        while ((cadena = pagina.readLine()) != null) {
            System.out.println(cadena);
        }

    }
}
