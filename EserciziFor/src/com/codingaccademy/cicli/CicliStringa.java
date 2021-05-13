package com.codingaccademy.cicli;

import java.util.*;
import java.util.stream.Collectors;

public class CicliStringa {

    private CicliStringa() {
        //sonar
    }

    /**
     * @param inputString la stringa da cui prendere i caratteri
     * @author Emanuele Zicola
     * <p>
     * Metodo che prende in input una stringa e ne stampa i caratteri uno ad uno
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
     * @param inputString la stringa da scorrere
     * @param c           il carattere da trovare
     * @return la posizione del carattere, -1 se non lo trova.
     * @author Emanuele Zicola
     * Metodo che stampa la posizione del carattere nella stringa. Se il carattere non viene trovato, stampa -1
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
     * @param stringaInput stringa in input
     * @param carattere    carattere in input
     * @return ritorna -1 se la stringa è null, altrimenti il numero di occorrenze di un carattere
     * all'interno della stringa
     * @author Daniel Minghini
     */
    //metodo che prende una stringa e un carattere e stampa quante occorrenze ci sono di quel carattere
    //all'interno della stringa
    public static int stampaNumeroOccorrenzeCarattereInUnaStringa(String stringaInput, char carattere) {
        //controllo se la stringa è null
        if (Objects.isNull(stringaInput)) {
            System.out.println("Stringa non valida");
            return -1;
        }

        int count = 0;
        for (int i = 0; i < stringaInput.length(); i++) {
            if (stringaInput.charAt(i) == carattere) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param stringaInput stringa in input
     *                     stampa una stringa al contrario
     * @author Daniel Minghini
     */
    //metodo che stampa una stringa al contrario
    public static void stampaUnaStringaAlContrario(String stringaInput) {
        //controllo se la stringa è null
        if (Objects.isNull(stringaInput)) {
            System.out.println("Stringa non valida");
            return;
        }

        for (int i = stringaInput.length() - 1; i >= 0; i--) {
            System.out.print(stringaInput.charAt(i));
        }
    }

    /**
     * @param stringaInput la stringa in input
     * @param substring la sottostringa da trovare nella stringa in input
     * @return true se la sottostringa esiste nella stringa input, altrimenti false
     * @author Daniel Minghini
     * metodo che torna true se trova una sottostringa all'interno di una stringa, altrimenti false
     */
    //metodo che torna true se trova una sottostringa all'interno di una stringa, altrimenti false
    public static boolean stringContainsSubstring(String stringaInput, String substring) {
        //controllo se la stringa è null
        if (Objects.isNull(stringaInput)) {
            System.out.println("Stringa non valida");
            return false;
        }
        //controllo se la substring è null
        if (Objects.isNull(substring)) {
            System.out.println("Sottostringa non valida");
            return false;
        }

        return stringaInput.contains(substring);
    }

    /**
     * @author Daniel Minghini
     * metodo che controlla se la stringa è palindroma(paraculata)
     * @param stringaInput la stringa in input
     * @return true se la stringa è palindroma, altrimenti false
     */
    public static boolean isPalindromaNonOttimizzata(String stringaInput) {
        //controllo se la stringa è null
        if (Objects.isNull(stringaInput)) {
            System.out.println("Stringa non valida");
            return false;
        }

        StringBuilder stringaInversa = new StringBuilder();
        for (int i = stringaInput.length() - 1; i >= 0; i--) {
            stringaInversa.append(stringaInput.charAt(i));
        }

        return stringaInput.equals(stringaInversa.toString());
    }

    /**
     * @author Daniel Minghini
     * metodo che controlla se una stringa è palindroma (non paraculata)
     * @param stringaInput la stringa in input
     * @return true se la stringa è palindroma, false viceversa
     */
    public static boolean isPalindromaOttimizzata(String stringaInput) {
        //controllo se la stringa è null
        if (Objects.isNull(stringaInput)) {
            System.out.println("Stringa non valida");
            return false;
        }

        stringaInput = stringaInput.toLowerCase().replace(" ", "");

        int indiceSale = 0;
        int indiceScende = stringaInput.length() - 1;

        while (indiceSale < indiceScende) {
            if (stringaInput.charAt(indiceSale) != stringaInput.charAt(indiceScende)) {
                return false;
            }
            indiceSale++;
            indiceScende--;
        }
        return true;
    }


    /**
     * @author Emanuele Zicola
     * Metodo che stampa le occorrenze di tutti i caratteri di una stringa in ordine alfabetico
     * @param inputString la stringa da analizzare.
     */
    public static void stampaOccorrenzePerOgniCarattere(String inputString) {
        Map<Character, Integer> mappaDiRitorno = new HashMap<>();

        //popolo la mappa
        for (int i = 0; i < inputString.length(); i++) {
            Character charItem = inputString.charAt(i);
            //se trovo il carattere nella mappa ne aggiorno il contatore
            if (mappaDiRitorno.containsKey(charItem)) {
                mappaDiRitorno.put(charItem, mappaDiRitorno.get(charItem) + 1);
            } else {
                //se non trovo il carattere lo inserisco nella mappa con il contatore a 1
                mappaDiRitorno.put(charItem, 1);
            }
        }


        System.out.println(inputString);
        //recupero l'insieme delle chiavi della mappa e lo ordino alfabeticamente
        Set<Character> keySet = mappaDiRitorno.keySet().stream().sorted(Character::compareTo).collect(Collectors.toCollection(LinkedHashSet::new));

        //per ogni carattere nell'insieme delle chiavi ordinato lo stampo e recupero dalla mappa dei caratteri il contatore di quante volte il carattere è stato trovato
        for (Character charItem : keySet) {
            System.out.println(charItem + ") " + mappaDiRitorno.get(charItem));
        }
    }
}
