public class App {
    public static void main(String[] args) {
        // Mitarbeiter-Objekte erstellen
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Onko", "Olaf", "Praktikant", 2024);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Gabriel", "Bernd", "Designer", 2017);
        Manager mitarbeiter3 = new Manager("Martinelli", "Silvia", "CEO", 2020, "Management");
        Mitarbeiter mitarbeiter4 = new Mitarbeiter("Müller", "Max", "Entwickler", 2022);
        Mitarbeiter mitarbeiter5 = new Mitarbeiter("Rolfes", "Susanne", "Designer", 2023);
        Mitarbeiter mitarbeiter6 = new Mitarbeiter("Hoffmann", "Marlies", "Entwickler", 2011);
        Mitarbeiter mitarbeiter7 = new Mitarbeiter("Schmidt", "Anna", "Controller", 2023);
        Manager mitarbeiter8 = new Manager("Bernstein", "Tom", "CEO", 2012, "Management");
        Mitarbeiter mitarbeiter9 = new Mitarbeiter("Holterhus", "Thorsten", "Entwickler", 2022);
        Mitarbeiter mitarbeiter10 = new Mitarbeiter("Pirelli", "Franjo", "Bürokaufmann", 2023);
        // Ausgabe der Informationen
      System.out.println(mitarbeiter2.getInfo(true)); 
        System.out.println(mitarbeiter3.getInfo(true));      
        System.out.println(mitarbeiter4.getInfo(true)); 
        System.out.println(mitarbeiter5.getInfo(true)); 
        System.out.println(mitarbeiter6.getInfo(true));    
        System.out.println(mitarbeiter7.getInfo(true));      
        System.out.println(mitarbeiter8.getInfo(true)); 
        System.out.println(mitarbeiter9.getInfo(true)); 
        System.out.println(mitarbeiter10.getInfo(true)); }
