package com.codingaccademy.cicli;

public class Cicli {

    private static final String ERROR_NUMBER_GREATER_THAN_ZERO = "Il metodo accetta solo numeri maggiori di zero";

    private Cicli() {
        //sonar
    }

    /**
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



}
