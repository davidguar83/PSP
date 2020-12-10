/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo_contar_vocales;

/**
 *
 * @author david
 */
public class Sacar_Palabra extends Thread{
      String frase;
    Contador con;
    int pala,pala2;

    public Sacar_Palabra(String frase, Contador con, String name,int palabra1) {
        super(name);
        this.frase = frase;
        this.con = con;
        pala=palabra1;
        
    }
     
  
    
    public void run(){
        
        
        String[] palabras=frase.split(" ");
        
        
        System.out.println(palabras[pala-1]);

        
    }
    
    
    
    
}
