public class StudentStatus {
    private String nazwaStatusu;

    public StudentStatus(String nazwaStatusu) {
        this.nazwaStatusu = nazwaStatusu;
    }

    @Override
    public String toString() {
        return this.nazwaStatusu;
    }
}