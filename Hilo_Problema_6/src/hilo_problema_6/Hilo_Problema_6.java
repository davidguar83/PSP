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
public class Hilo_Problema_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CubbyHole c1 = new CubbyHole();
        Cliente p1 = new Cliente(c1, 1);

        p1.start();

        Proveedor e1 = new Proveedor(1, c1);
        e1.start();

    }

}
