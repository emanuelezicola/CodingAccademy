package com.codingaccademy.models;


import com.codingaccademy.utils.Utils;

import java.util.Objects;

public class Cane {
    private String nome;
    private int eta;
    private String sesso;
    private Persona padrone;

    //costruttore con campi
    public Cane(String nome,  int eta, String sesso,Persona padrone){
        if(Objects.isNull(nome)){
            nome = "selallero";
        }
        this.nome = nome;

        if(Utils.checkNumberOutOfRange(eta,0,20)){
            eta = 0;
        }
        this.eta = eta;

        if(!"MASCHIO".equalsIgnoreCase(sesso) && !"FEMMINA".equalsIgnoreCase(sesso)){
            sesso = "ALTRO";
        }
        this.sesso = sesso.toUpperCase();

        this.padrone=padrone;
    }
    //getter e setter
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if(Objects.nonNull(nome)){
            this.nome = nome;
        }
    }

    public int getEta(){
        return eta;
    }

    public void setEta(int eta){
        if(!Utils.checkNumberOutOfRange(eta,0,20)){
            this.eta = eta;
        }
    }

    public String getSesso(){
        return sesso;
    }

    public void setSesso(String sesso){
        if("MASCHIO".equalsIgnoreCase(sesso) || "FEMMINA".equalsIgnoreCase(sesso)){
            this.sesso = sesso.toUpperCase();
        }

    }

    public Persona getPadrone(){
        return padrone;
    }

    public void setPdrone(Persona padrone){
        this.padrone = padrone;
    }

    //se il cane ha un padrone allora ritorna una stringa, altrimenti ne ritorna un'altra
    @Override
    public String toString(){
       return "Mi chiamo " + nome + ".Sono un " + sesso + " ed ho " + eta + " anni." +
                (Objects.isNull(padrone) ? "Sono un randagio" : "Il mio padrone è " + padrone.getNome() + " " + padrone.getCognome());
    }

}

