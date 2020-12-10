package hilo_contar_vocales;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Contador {
    
    public int contenido=0;
    public boolean ax=false;
    
    
    public synchronized void put(int c){
        
        while(ax==true){
            
            
            
        }
        
        
        contenido=c;
        //notify();
        
    }
    
    
    public synchronized int get(){
        
       //notify();
        return contenido;
        
    }
    
    
    
    
}
