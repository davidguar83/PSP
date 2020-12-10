/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos_problema_2;

/**
 *
 * @author david
 */
public class Hilos_problema_2 {
    
    
    
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new Hilos("Hilo 1").start();
        new Hilos("Hilo 2").start();
        System.out.println("Fin de programa principal");
        
    }


    
}
