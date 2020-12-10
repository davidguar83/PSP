/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos_problema_2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.DocFlavor;

/**
 *
 * @author david
 */
public class Hilos extends Thread {

    public Hilos(String str) {
        super(str);

    }

    public void run() {

        long randomT = 100 + (long) (Math.random() * 5000);

        System.out.println(randomT);
        for (int i = 0; i < 10; i++) {

            System.out.println(i + " " + getName());

            try {

                sleep(randomT);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        System.out.println("Termina el hilo "+getName());
        
    }

}
