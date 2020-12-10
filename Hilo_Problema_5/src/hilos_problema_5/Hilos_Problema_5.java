/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos_problema_5;

/**
 *
 * @author david
 */
public class Hilos_Problema_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Hilos hilo2 = new Hilos("Hilo 2");
        Hilos hilo1 = new Hilos("Hilo 1");


        /* hilo2.start();
        hilo2.join();
        hilo1.start();*/
        hilo2.setPriority(10);
        hilo1.setPriority(1);
        hilo2.start();
        hilo1.start();
    }

}
