public class Grade {

    private String nazwaKursu;
    private int wynik;

    public Grade(String nazwaKursu, int wynik) {
        this.nazwaKursu = nazwaKursu;
        this.wynik = wynik;

    }

    public int getWynik() {
        return wynik;
    }

    public String toString() {
        return nazwaKursu + ": " + wynik;
    }
}