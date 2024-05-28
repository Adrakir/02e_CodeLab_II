class Manager extends Mitarbeiter {
    private String abteilung;

    // Konstruktor mit Vererbung
    public Manager(String name, String vorname, String funktion, int eintrittsjahr, String abteilung) {
        super(name, vorname, funktion, eintrittsjahr); // Aufruf des Basisklassenkonstruktors
        this.abteilung = abteilung;
    }
    public String getInfo(boolean details) {
        return super.getInfo(details) + ", Abteilung: " + abteilung; }

          Mitarbeiter mitarbeiter1 = new Mitarbeiter("Müller", "Max", "Entwickler", 2020);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Schmidt", "Anna", "Designer", 2022);
        Manager manager = new Manager("Weber", "Lisa", "CEO", 2018, "Management");
}

