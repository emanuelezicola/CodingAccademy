package com.codingaccademy.utils;

import com.codingaccademy.models.Cane;

import java.util.Objects;

public class Utils {

    private Utils() {
        //sonar
    }

    /**
     * Controlla che il numero sia sotto del valore minimo o sopra del massimo
     * @param numberToCheck il numero da checkare
     * @param min il valore minimo
     * @param max il valore massimo
     * @return true se il numero non è compreso tra min e max, false altrimenti
     */
    public static boolean checkNumberOutOfRange(int numberToCheck, int min, int max) {
        return numberToCheck < min || numberToCheck > max;
    }


    /**
     * Metodo che controlla che la variabile sesso sia uguale a MASCHIO oppure a FEMMINA
     * @param sesso la variabile da controllare
     * @return true se uguale a MASCHIO o FEMMINA, false altrimenti
     */
    public static boolean checkSessoEqualsMaschioOrFemmina(String sesso) {
        return "MASCHIO".equalsIgnoreCase(sesso) || "FEMMINA".equalsIgnoreCase(sesso);
    }

    /**
     * Metodo che ritorna la descrizione di un cane utile per essere descritto all'interno della ResidenzaCani
     * @param cane il cane da cui tirare fuori la descrizione
     * @return la descrizione del cane
     */
    public static String getDescrizioneCaneResidenza(Cane cane) {
        if (Objects.isNull(cane)) {
            return null;
        }
        String nomePadrone = Objects.nonNull(cane.getPadrone()) ? " il cui proprietario è " + cane.getPadrone().getNome() + " " + cane.getPadrone().getCognome() : " che non ha proprietario";
        return cane.getNome() + nomePadrone;
    }

    /**
     * Metodo che, prese in input le tre descrizioni, le appende tra loro solo se non solo null.
     * @param desc1 la prima descrizione
     * @param desc2 la seconda descrizione
     * @param desc3 la terza descrizione
     * @return una stringa contenente le descrizioni non null.
     */
    public static String getCaniOspitatiFromDesc(String desc1, String desc2, String desc3) {
        StringBuilder sb = new StringBuilder();

        if (Objects.nonNull(desc1)) {
            sb.append(desc1).append("\n\t");
        }

        if (Objects.nonNull(desc2)) {
            sb.append(desc2).append("\n\t");
        }

        if (Objects.nonNull(desc3)) {
            sb.append(desc3).append("\n\t");
        }
        return sb.toString();
    }

}
