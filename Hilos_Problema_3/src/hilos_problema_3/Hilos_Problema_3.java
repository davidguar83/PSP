/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos_problema_3;

/**
 *
 * @author david
 */
public class Hilos_Problema_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       
        Hilos a = new Hilos(" Hilo Padre");
        
        a.start();
        a.join();
        System.out.println("Acabo PROGRAMA PRINCIPAL(Main) ");
        
    }
    
}
