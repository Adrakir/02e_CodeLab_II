package com.cc.java

public class Mitarbeiter {
    protected String name;
    protected String vorname;
    protected String funktion;
    protected int eintrittsjahr;

    // Konstruktor
    public Mitarbeiter(String name, String vorname, String funktion, int eintrittsjahr) {
        this.name = name;
        this.vorname = vorname;
        this.funktion = funktion;
        this.eintrittsjahr = eintrittsjahr;
    }

    // getInfo-Methode mit Überladung
    public String getInfo() {
        return "Name: " + name + ", Vorname: " + vorname;
    }

    public String getInfo(boolean details) {
        if (details) {
            return getInfo() + ", Funktion: " + funktion + ", Eintrittsjahr: " + eintrittsjahr;
        } else {
            return getInfo();
        }
    }
}
