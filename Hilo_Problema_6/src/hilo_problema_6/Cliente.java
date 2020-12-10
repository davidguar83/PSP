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
public class Cliente extends Thread {

    private CubbyHole c;
    private int a;

    public Cliente(CubbyHole c, int a) {
        this.c = c;
        this.a = a;
    }

    public void run() {
        int valorc = 0;
        int ingreso = 0;

        for (int i = 1; i < 11; i++) {

            valorc = c.get();
            ingreso = ((int) (Math.random() * 50) + 1);

            valorc = valorc + ingreso;
            c.put(valorc);
            valorc = c.get();
            System.out.println("ingreso = " + i + "  ingreso = " + ingreso + " total caja= " + c.get());
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }

        }

    }

}
