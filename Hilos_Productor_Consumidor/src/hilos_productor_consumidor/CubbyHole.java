/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos_productor_consumidor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class CubbyHole {

    private int contenido;

    private boolean x = false;

    public synchronized int get() {

        while (x == false) {

            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(CubbyHole.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        x = false;
        notify();
        return contenido;

    }
    
    public synchronized void put(int value){
        while(x){
            
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(CubbyHole.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        contenido= value;
        x=true;
        notify();
        
        
    }
    

}
