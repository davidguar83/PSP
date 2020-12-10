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
public class Hilos extends Thread {

    private int sumatorioImpares = 0;
    private int sumatorioPares = 0;
    private int sumatorio2y3 = 0;

    public Hilos(String name) {
        super(name);
    }

    public void run() {

        String nome = getName();

        switch (nome) {

            case "hilo impares":

                contarImpares();
                break;
            case "hilo pares":
                contarPares();
                break;
            case "hilo suma 2y3":
                suma2y3();
                break;

        }

    }

    public void contarPares() {

        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                sumatorioPares = sumatorioPares + i;

            }

        }

        System.out.println("El sumatorio de los numeros pares es: " + sumatorioPares);
    }

    public void contarImpares() {

        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 1) {
                sumatorioImpares = sumatorioImpares + i;

            }

        }
        System.out.println("El sumatorio de los numeros impares es: " + sumatorioImpares);
    }

    public void suma2y3() {

        String dos="2",tres="3",a="";
        
        for (int i = 0; i < 1000; i++) {
            
            a=String.valueOf(i);
            if(a.endsWith(dos)){
                
                sumatorio2y3=sumatorio2y3+i;
                
            }
            if(a.endsWith(tres)){
                
                sumatorio2y3=sumatorio2y3+i;
                
            }

        }
        
        
        System.out.println("La suma de los numeros que contienen 2 y 3 es : "+sumatorio2y3);

    }

}
