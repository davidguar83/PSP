/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo_contar_vocales;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Hilo_Contar_Vocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "maria david carolina y mi amiga es lisa y megan";
        String fra;
       // System.out.println("Introduce frase");
       // Scanner a = new Scanner(System.in);
       // fra=a.nextLine();
        Contador con=new Contador();
        

        Hilos h1 = new Hilos(frase, con, "hilo 1","a");
         Hilos h2 = new Hilos(frase,con, "hilo 2","e");
          Hilos h3 = new Hilos(frase, con, "hilo 3","i");
           Hilos h4 = new Hilos(frase, con, "hilo 4","o");
            Hilos h5 = new Hilos(frase, con, "hilo 5","u");
            Hilo_Contar_Palabras h6 = new Hilo_Contar_Palabras(frase, con,"hilo 6"," ");
            Hilo_Sacar_Palabras h7= new Hilo_Sacar_Palabras(frase, con, "hilo 7 ", 3,5);
            Sacar_Palabra h8= new Sacar_Palabra(frase, con, "hilo 7 ", 6);
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        h6.start();
       // h7.start();
        h8.start();
        
        try {
            h1.join();
            h2.join();
            h3.join();
            h4.join();
            h5.join();
            h8.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo_Contar_Vocales.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Vocales totales= "+con.get());
        System.out.println("Fin del programa principal");
    }
}
