/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos_problema_1;

import java.io.IOException;

/**
 *
 * @author david
 */
public class Hilos extends Thread {

    public Hilos(String name) {
        super(name);
    }

    public void run() {
         long randomT = 100 + (long) (Math.random() * 5000);

        for (int i = 0; i < 5; i++) {

            System.out.println(i + " " + getName());

            try {

                sleep(randomT);
            } catch (InterruptedException e) {

                e.printStackTrace();

            }
           
        }
 System.out.println("fin "+getName());
    }

}
