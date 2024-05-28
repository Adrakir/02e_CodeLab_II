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
    int counter = 1; // Start bei Mitarbeiter 1

do {
    System.out.println("mitarbeiter" + counter + ".getInfo(true)");
    counter++; // Nächster Mitarbeiter
} while (counter <= 10);}
