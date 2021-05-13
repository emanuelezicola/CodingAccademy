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
        //Se null esco e stampo messaggio errore
        if (Objects.isNull(inputString)) {
            return -1;
        }

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @author Daniel Minghini
     * @param stringaInput stringa in input
     * @param carattere carattere in input
     * @return ritorna -1 se la stringa è null, altrimenti il numero di occorrenze di un carattere
     * all'interno della stringa
     */
    //metodo che prende una stringa e un carattere e stampa quante occorrenze ci sono di quel carattere
    //all'interno della stringa
    public static int stampaNumeroOccorrenzeCarattereInUnaStringa(String stringaInput, char carattere){
        //controllo se la stringa è null
        if(Objects.isNull(stringaInput)){
            System.out.println("Stringa non valida");
            return -1;
        }

        int count=0;
        for(int i=0; i < stringaInput.length(); i++ ){
            if(stringaInput.charAt(i) == carattere){
                count++;
            }
        }
        return count;
    }

    /**
     * @author Daniel Minghini
     * @param stringaInput stringa in input
     * stampa una stringa al contrario
     */
    //metodo che stampa una stringa al contrario
    public static void stampaUnaStringaAlContrario(String stringaInput){
        //controllo se la stringa è null
        if(Objects.isNull(stringaInput)){
            System.out.println("Stringa non valida");
            return;
        }

        for(int i = stringaInput.length() - 1; i >= 0; i--){
            System.out.print(stringaInput.charAt(i));
        }
    }

    /**
     * @author Daniel Minghini
     * metodo che torna true se trova una sottostringa all'interno di una stringa, altrimenti false
     * @param stringaInput
     * @param substring
     * @return true se la sottostringa esiste nella stringa input, altrimenti false
     */
    //metodo che torna true se trova una sottostringa all'interno di una stringa, altrimenti false
    public static boolean stringContainsSubstring(String stringaInput, String substring){
        //controllo se la stringa è null
        if(Objects.isNull(stringaInput)){
            System.out.println("Stringa non valida");
            return false;
        }
        //controllo se la substring è null
        if(Objects.isNull(substring)){
            System.out.println("Sottostringa non valida");
            return false;
        }

        return stringaInput.contains(substring);
    }


}
