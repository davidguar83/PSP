/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos_problema_5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Hilos extends Thread {

    String name;
    public Hilos(String name) {
        super();
        this.name=name;
    }

    public void run() {

        //System.out.println("Hola son o " + getName());

        int count = 0;
        while (true) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                count = 0;
                
            }
            System.out.println(name + " : " +count++);
      
    }
    
    
    
}
}