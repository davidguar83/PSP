/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos_problema_4;

/**
 *
 * @author david
 */
public class Hilos_Problema_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Hilos a,b,c;
        
        a= new Hilos("hilo impares");
        b= new Hilos("hilo pares");
        c= new Hilos("hilo suma 2y3");
        a.start();
        b.start();
        c.start();
    }
    
}





