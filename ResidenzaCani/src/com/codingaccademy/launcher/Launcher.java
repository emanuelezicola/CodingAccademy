package com.codingaccademy.launcher;

import com.codingaccademy.models.Cane;
import com.codingaccademy.models.Persona;
import com.codingaccademy.models.ResidenzaCani;

public class Launcher {

    private static final String MASCHIO = "MASCHIO";
    private static final String FEMMINA = "FEMMINA";

    public static void main(String[] args) {
        Persona proprietarioCane = new Persona("Emanuele", "Zicola", 26, MASCHIO);
        Persona proprietarioCane2 = new Persona("Ylenia", "Zicola", 28, MASCHIO);

        Cane c = new Cane("Ally", 2, FEMMINA, null);
        Cane c2 = new Cane("Morgana", 1, FEMMINA, proprietarioCane);
        Cane c3 = new Cane("Janis", 1, FEMMINA, proprietarioCane2);

        Persona proprietarioResidenza = new Persona("Ciccio", "Pasticcio", 22, MASCHIO);

        ResidenzaCani residenzaCani = new ResidenzaCani(c, c2, c3, "Casa per cani", proprietarioResidenza );


        System.out.println(residenzaCani);

    }

}
