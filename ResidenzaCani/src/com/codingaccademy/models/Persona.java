package com.codingaccademy.models;


import com.codingaccademy.utils.Utils;

import java.util.Objects;

public class Persona {
    private String nome;
    private String cognome;
    private int eta;
    private String sesso;

    //costruttore con campi
    public Persona(String nome, String cognome, int eta, String sesso){
        if(Objects.isNull(nome)){
            nome = "selallero";
        }
        this.nome = nome;

        if(Objects.isNull(cognome)){
            cognome = "selallero";
        }
        this.cognome = cognome;

        if (Utils.checkNumberOutOfRange(eta,0,110)){
            eta = 0;
        }
        this.eta = eta;

        if(!Utils.checkSessoEqualsMaschioOrFemmina(sesso)){
            sesso = "ALTRO";
        }
        this.sesso = sesso.toUpperCase();
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

    public String getCognome(){
        return cognome;
    }

    public void setCognome(String cognome){
        if(Objects.nonNull(cognome)){
            this.cognome = cognome;
        }
    }

    public int getEta(){
        return eta;
    }

    public void setEta(int eta){
        if(!Utils.checkNumberOutOfRange(eta,0,110)){
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

    @Override
    public String toString(){
        return "Mi chiamo " + nome + " " + cognome + ". Sono un " + sesso + " ed ho " + eta + " anni";
    }

}
