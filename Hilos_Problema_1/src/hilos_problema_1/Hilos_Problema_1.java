/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos_problema_1;

/**
 *
 * @author david
 */
public class Hilos_Problema_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Hilos A, B, C, D;
        A = new Hilos("Hilo 1");
        B = new Hilos("Hilo 2");
        C = new Hilos("Hilo 3");
        D = new Hilos("Hilo 4");
        A.start();
        B.start();
        C.start();
        D.start();
        try{
            
            A.join(); // cuando acaba el hilo a, acaba el programa da lo mismos los otros hilos
            //para que acaben los otros hilos anted de que acabe el programa principal habria que descomebntar el codigo siguiente
            /*B.join();
            C.join();
            D.join();*/
            
        }catch(Exception e){
            
            System.out.println("Error");
        }

        System.out.println("fin programa principal");
    }

}
