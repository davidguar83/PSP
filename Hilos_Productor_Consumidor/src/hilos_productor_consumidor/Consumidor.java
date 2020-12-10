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
public class Consumidor extends Thread {

    private CubbyHole cubbyhole;
    private int numero;

    public Consumidor(CubbyHole c, int numero) {
        this.cubbyhole = c;
        this.numero = numero;
    }

    public void run() {

        int valor = 0;
        for (int i = 0; i < 10; i++) {

            valor = cubbyhole.get();
            System.out.println("consumidor : " + this.numero + " obtiene : " + valor);

        }
        try {
            sleep((int) (Math.random() * 100));
        } catch (InterruptedException ex) {
            Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
