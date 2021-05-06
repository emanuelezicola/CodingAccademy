package com.codingaccademy.cicli;

import java.util.Objects;

public class CicliStringa {

    private CicliStringa() {
        //sonar
    }

    /**
     * @author Emanuele Zicola
     *
     * Metodo che prende in input una stringa e ne stampa i caratteri uno ad uno
     * @param inputString la stringa da cui prendere i caratteri
     */
    public static void stampaCaratteriStringa(String inputString) {
        //Se null esco e stampo messaggio errore
        if (Objects.isNull(inputString)) {
            System.out.println("Inserire una stringa valida");
            return;
        }

        //il metodo length() della stringa ti dice quanto è lunga.. "Ciao".lenght(); ritorna 4
        //Le posizioni dei caratteri iniziano sempre dal numero 0 e finiscono sempre alla pozione stringa.length - 1
        for (int i = 0; i < inputString.length(); i++) {
            //il metodo charAt(int i) delle stringhe ritorna un char alla i-esima posizione della stringa
            System.out.println(inputString.charAt(i));
        }
    }

    /**
     * @author Emanuele Zicola
     * Metodo che stampa la posizione del carattere nella stringa. Se il carattere non viene trovato, stampa -1
     * @param inputString la stringa da scorrere
     * @param c il carattere da trovare
     * @return la posizione del carattere, -1 se non lo trova.
     */
    public static int getPosizionePrimaOccorrenzaCarattereInStringa(String inputString, char c) {
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }



}
