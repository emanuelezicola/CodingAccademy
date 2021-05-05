package com.codingaccademy.models;

import com.codingaccademy.utils.Utils;

import java.util.Objects;

public class ResidenzaCani {
   private Cane cane1;
   private Cane cane2;
   private Cane cane3;
   private String nome;
   private Persona proprietario;

   public ResidenzaCani(Cane cane1, Cane cane2, Cane cane3, String nome, Persona proprietario){
       if(Objects.isNull(nome)){
           nome = "ResidenzaDiOcane";
       }
       this.nome = nome;

       if(Objects.isNull(proprietario)){
           proprietario = new Persona("seee","lalleroooo", 26, "Maschio");
       }
       this.proprietario = proprietario;

       this.cane1 = cane1;
       this.cane2 = cane2;
       this.cane3 = cane3;
   }

    public Cane getCane1() {
        return cane1;
    }

    public void setCane1(Cane cane1) {
        this.cane1 = cane1;
    }

    public Cane getCane2() {
        return cane2;
    }

    public void setCane2(Cane cane2) {
        this.cane2 = cane2;
    }

    public Cane getCane3() {
        return cane3;
    }

    public void setCane3(Cane cane3) {
        this.cane3 = cane3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(Objects.nonNull(nome)){
            this.nome = nome;
        }
    }

    public Persona getProprietario() {
        return proprietario;
    }

    public void setProprietario(Persona proprietario) {
        if(Objects.nonNull(proprietario)){
            this.proprietario = proprietario;
        }
    }

    @Override
    public String toString() {

        String descC1 = Utils.getDescrizioneCaneResidenza(cane1);
        String descC2 = Utils.getDescrizioneCaneResidenza(cane2);
        String descC3 = Utils.getDescrizioneCaneResidenza(cane3);

        return "La residenza \"" + nome + "\" è di " + proprietario.getNome() + ". Attualmente " +
                (Objects.isNull(descC1) && Objects.isNull(descC2) && Objects.isNull(descC3) ? "non ospita nessun cane." : "ospita: \n\t" + Utils.getCaniOspitatiFromDesc(descC1, descC2, descC3));
    }
}
