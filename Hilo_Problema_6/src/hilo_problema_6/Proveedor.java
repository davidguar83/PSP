/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo_problema_6;

/**
 *
 * @author david
 */
public class Proveedor extends Thread {

    private CubbyHole c;
    private int a;

    public Proveedor(int a, CubbyHole c) {
        this.a = a;
        this.c = c;

    }

    public void run() {

        int valorc = 0, retirada = 0;
        for (int i = 1; i < 6; i++) {

            valorc = c.get();
            // System.out.println("hola= " + valorc);
            retirada = ((int) (Math.random() * 50) + 1);
            // System.out.println(retirada);
            valorc = valorc - retirada;
            // System.out.println("hola 2= " + valorc);
            c.put(valorc);
            valorc = c.get();
            //System.out.println("hola" + valorc);
            System.out.println("Extracion= " + i + "cantidad = " + retirada + "total caja = " + c.get());
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }

    }

}
