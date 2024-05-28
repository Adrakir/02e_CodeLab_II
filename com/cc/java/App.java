package com.cc.java
public class App {
       public static 
          Mitarbeiter mitarbeiter1 = new Mitarbeiter("Müller", "Max", "Entwickler", 2020);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Schmidt", "Anna", "Designer", 2022);
        Manager manager = new Manager("Weber", "Lisa", "CEO", 2018, "Management");
}void main(String[] args) {
       System.out.println(mitarbeiter2.getInfo(true,true));
        System.out.println(mitarbeiter2.getInfo(true,true));
        System.out.println(manager.getInfo(true, true));}}
