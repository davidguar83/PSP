/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos_problema_3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Hilos extends Thread {

   
    static int nHiloHIjo = 1;



    public Hilos(String name) {
        super(name);
    }

   

    public void run() {

        Hilos hijo = new Hilos("Hilo_Hijo" + nHiloHIjo);

        if (nHiloHIjo <= 4) {

            hijo.start();
            
            
            nHiloHIjo++;
            
            try {
                hijo.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
       

        int aleatorio = 100 + (int) (Math.random() * 500);
        
        

        for (int i = 1; i < 11; i++) {

            System.out.println("Repeticion " + i + " " + getName());

        }
        
         System.out.println("Acabo " + getName());

        try {
            sleep(aleatorio);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
