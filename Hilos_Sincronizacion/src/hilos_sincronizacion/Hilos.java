/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos_sincronizacion;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Hilos extends Thread{
    Random ra = new Random();
    
   Contenedor con;

    public Hilos(Contenedor con, String name) {
        super(name);
        this.con = con;
    }
    
    
    public void run(){
        
        
        for(int i=0;i<4;i++){
            
            int a=con.get();
            
            a++;
            
            con.put(a);
            con.get();
            
            System.out.println(getName()+"contador= "+con.get());
            
            try {
                sleep((300+(ra.nextInt(100)+1)));
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
    }
    
    
    
}
