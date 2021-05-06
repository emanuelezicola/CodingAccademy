package com.codingaccademy.cicli;

import javax.swing.*;

public class Cicli {

    private static final String ERROR_NUMBER_GREATER_THAN_ZERO = "Il metodo accetta solo numeri maggiori di zero";

    private Cicli() {
        //sonar
    }

    /**
     * @author Emanuele Zicola
     * Metodo che stampa i numeri da zero fino a maxRange
     * @param maxRange il tetto massimo escluso a cui stampare
     */
    public static void stampaNumeriDaZero(int maxRange) {
        if (maxRange <= 0) {
            System.out.println(ERROR_NUMBER_GREATER_THAN_ZERO);
            return;
        }
        for (int i = 0; i < maxRange; i++) {
            System.out.println(i);
        }
    }

    /**
     * @author Emanuele Zicola
     * Metodo che stampa i numeri da zero fino a maxRange
     * @param maxRange il tetto massimo incluso a cui stampare
     */
    public static void stampaNumeriDaZeroIncluso(int maxRange) {
        if (maxRange <= 0) {
            System.out.println(ERROR_NUMBER_GREATER_THAN_ZERO);
            return;
        }
        for (int i = 0; i <= maxRange; i++) {
            System.out.println(i);
        }
    }


    /**
     * @author Emanuele Zicola
     * Metodo che stampa i numeri da x fino a 0
     * @param startNumber il tetto massimo escluso a cui stampare
     */
    public static void stampaNumeriFinoAZero(int startNumber) {
        if (startNumber <= 0) {
            System.out.println(ERROR_NUMBER_GREATER_THAN_ZERO);
            return;
        }
        for (int i = startNumber; i > 0; i--) {
            System.out.println(i);
        }
    }


    /**
     * @author Gabriele Maferri
     * Metodo che stampa i numeri da StartNumber fino a 0 incluso
     * @param startNumber numero di partenza
     */
    public static void stampaNumeriFinoAZeroIncluso(int startNumber) {
        if (startNumber <= 0) {
            System.out.println("Numero minore di zero, riprovare.");
            return;
        }
        for (int i = startNumber; i >= 0; i--) {
            System.out.println(i);
        }
    }

    /**
     * @author Gabriele Maferri
     * Metodo che stampa i numeri da X a Y a crescere
     * @param xNumber Numero di partenza
     * @param yNumber Numero di fine
     */
    public static void stampaNumeridaXaYaCrescere(int xNumber, int yNumber){
        if (xNumber >= yNumber) {
            System.out.println("Il primo numero non può essere più grande del secondo, riprovare.");
            return;
        }
        for (int i = xNumber; i <= yNumber; i++){
            System.out.println(i);
        }
    }

    /**
     * @author Gabriele Maferri
     * Metodo che stampa i numeri da X a Y a decrescere
     * @param xNumber numero di partenza
     * @param yNumber numero di fine
     */
    public static void stampaNumeridaXaYaDecrescere(int xNumber, int yNumber){
        if (xNumber <= yNumber){
            System.out.println("Il primo numero deve essere più grande del secondo, riprovare.");
            return;
        }
        for (int i = xNumber; i >= yNumber; i--){
            System.out.println(i);
        }
    }

}
