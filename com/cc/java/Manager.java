class Manager extends Mitarbeiter {
    private String abteilung;

    // Konstruktor mit Vererbung
    public Manager(String name, String vorname, String funktion, int eintrittsjahr, String abteilung) {
        super(name, vorname, funktion, eintrittsjahr); // Aufruf des Basisklassenkonstruktors
        this.abteilung = abteilung;
    }
    public String getInfo(boolean details) {
        return super.getInfo(details) + ", Abteilung: " + abteilung; }

}

