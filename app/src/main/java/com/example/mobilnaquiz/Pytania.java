package com.example.mobilnaquiz;

public class Pytania {

    private String trescPytania;
    private String nazwaZdjecia;
    private boolean czyPoprawna;

    public Pytania(String trescPytania, String nazwaZdjecia) {
        this.trescPytania = trescPytania;
        this.nazwaZdjecia = nazwaZdjecia;
        czyPoprawna = false;
    }

    public String getTrescPytania() {
        return trescPytania;
    }

    public void setTrescPytania(String trescPytania) {
        this.trescPytania = trescPytania;
    }

    public String getNazwaZdjecia() {
        return nazwaZdjecia;
    }

    public void setNazwaZdjecia(String nazwaZdjecia) {
        this.nazwaZdjecia = nazwaZdjecia;
    }

    public boolean isCzyPoprawna() {
        return czyPoprawna;
    }

    public void setCzyPoprawna(boolean czyPoprawna) {
        this.czyPoprawna = czyPoprawna;
    }
}
