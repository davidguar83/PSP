/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos_sincronizacion;

/**
 *
 * @author david
 */
public class Hilos_Sincronizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Contenedor con = new Contenedor();

        Hilos h1 = new Hilos(con, "hilo 1");
        h1.start();
        Hilos h2 = new Hilos(con, "hilo 2");

        Hilos h3 = new Hilos(con, "hilo 3");

        Hilos h4 = new Hilos(con, "hilo 45");

        h3.start();
        h2.start();
        h4.start();

    }

}
