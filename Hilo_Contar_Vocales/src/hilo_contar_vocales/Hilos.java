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
public class Hilos extends Thread {

    Contador con;
    String frase;

    String letra;

    public Hilos(String frase, Contador c, String name, String le) {
        super(name);
        this.frase = frase;
        this.con = c;
        this.letra = le;
    }

    public void run() {

        int contadorVocales, contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        if (letra == "a") {

            for (int i = 0; i < frase.length(); i++) {

                char letra = frase.charAt(i);

                if (frase.charAt(i) == 'a') {

                    contadorVocales = con.get();
                    contadorVocales++;
                    contadorA++;
                    con.put(contadorVocales);

                }

            }
            System.out.println("Letra a= " + contadorA);
        }
        if (letra == "e") {

            for (int i = 0; i < frase.length(); i++) {

                char letra = frase.charAt(i);

                if (frase.charAt(i) == 'e') {
                    contadorVocales = con.get();
                    contadorVocales++;
                    contadorE++;
                    con.put(contadorVocales);
                }

            }
            System.out.println("Letra e= " + contadorE);
        }
        if (letra == "i") {

            for (int i = 0; i < frase.length(); i++) {

                char letra = frase.charAt(i);

                if (frase.charAt(i) == 'i') {
                    contadorVocales = con.get();
                    contadorVocales++;
                    contadorI++;
                    con.put(contadorVocales);
                }
            }
            System.out.println("Letra i= " + contadorI);
        }
        if (letra == "o") {

            for (int i = 0; i < frase.length(); i++) {

                char letra = frase.charAt(i);

                if (frase.charAt(i) == 'o') {
                    contadorVocales = con.get();
                    contadorVocales++;
                    contadorO++;
                    con.put(contadorVocales);
                }
            }
            System.out.println("Letra o= " + contadorO);
        }
        if (letra == "u") {

            for (int i = 0; i < frase.length(); i++) {

                char letra = frase.charAt(i);

                if (frase.charAt(i) == 'u') {
                    contadorVocales = con.get();
                    contadorVocales++;
                    contadorU++;
                    con.put(contadorVocales);
                }

            }

            System.out.println("Letra u= " + contadorU);

        }

        // contadorLetras = (frase.length() - contadorEspacios);
        //contadorVocales = (contadorA + contadorE + contadorI + contadorO + contadorU);

        //System.out.println("Espacios= " + contadorEspacios);
        // System.out.println("caracteres totales = " + contadorLetras);
        // System.out.println("Vocales totales = " + con.get());
        //  System.out.println("Consonantes = " + consonantes);
        // System.out.println("letras totales= " + (contadorVocales + consonantes));
    }

    public static boolean isConsonante(char letra) {

        return "bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(letra).toLowerCase());

    }
}
