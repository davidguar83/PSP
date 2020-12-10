/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos_productor_consumidor;

/**
 *
 * @author david
 */
public class Hilos_Productor_Consumidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        CubbyHole c = new CubbyHole();
        
        Productor p1 = new Productor(1,c);
        
        Consumidor c1 = new Consumidor(c,1);
        
        p1.start();
        c1.start();
        
        
    }
    
}
