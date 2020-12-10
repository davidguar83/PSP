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
public class Productor extends Thread {

    private int numero;
    private CubbyHole cubbyhole;

    public Productor(int numero, CubbyHole c) {
        this.numero = numero;
        this.cubbyhole = c;
    }

    public void run() {

        for (int i = 0; i < 10; i++) {
            cubbyhole.put(i);
            System.out.println("productor : "+this.numero + " pone " + i);

            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
