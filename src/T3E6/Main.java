/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T3E6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author FP
 */
public class Main {

    public static void main(String[] args) throws MalformedURLException, IOException {

        
        String imageUrl = "https://e00-marca.uecdn.es/assets/sports/logos/football/png/36x36/175.png";
        URL url = new URL(imageUrl);
        URLConnection connection = url.openConnection();
        connection.connect();
        InputStream inputStream = connection.getInputStream();

        File outputFile = new File("imagen.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0, bytesRead);
        }

        inputStream.close();
        fileOutputStream.close();
    }
}
