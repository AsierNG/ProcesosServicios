/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T3E3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author FP
 */
public class Main {

    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("https://www.marca.com/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        BufferedReader in;

        try {
            InputStream inputStream = url.openStream();
            in = new BufferedReader(new InputStreamReader(inputStream));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
