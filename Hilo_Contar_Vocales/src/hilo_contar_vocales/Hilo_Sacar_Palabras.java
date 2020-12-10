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
public class Hilo_Sacar_Palabras extends Thread{
    
    String frase;
    Contador con;
    int pala,pala2;

   
      public Hilo_Sacar_Palabras(String frase, Contador con, String name,int palabra1,int palabra2) {
        super(name);
        this.frase = frase;
        this.con = con;
        pala=palabra1;
        pala2=palabra2;
    }
  
    
    public void run(){
        
        
        String[] palabras=frase.split(" ");
        
        
        System.out.println(palabras[pala-1]);
        System.out.println(palabras[pala2-1]);
        
    }
    
    
    
    
}
