/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo_problema_6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class CubbyHole {

    private int dinero = 1000;
    private boolean x = true;

    public synchronized int get() {
        if (dinero <= 0) {

            x = false;
            while (x == false) {

                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(CubbyHole.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
        notify();
        return dinero;

    }

    public synchronized void put(int value) {

        while (x == false) {

            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(CubbyHole.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        dinero = value;
        x = true;
        notify();

    }

}
