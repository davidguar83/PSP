/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo_contar_vocales;

import java.util.StringTokenizer;

/**
 *
 * @author david
 */
public class Hilo_Contar_Palabras extends Thread{

    Contador con;
    String frase;

    String letra;

    public Hilo_Contar_Palabras(String frase, Contador c, String name, String le) {
        super(name);
        this.frase = frase;
        this.con = c;
        this.letra = le;
    }
    
    
    public void run(){
        
        StringTokenizer st= new StringTokenizer(frase);
        
        System.out.println("La frase tiene: "+st.countTokens()+" palabras");
        
        
        
    }
    
    

}
