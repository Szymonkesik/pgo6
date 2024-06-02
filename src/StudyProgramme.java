public class StudyProgramme{

    private String name;
    private String code;

    private int liczbaSemestrow;

    private int liczbaMozliwychITN;

    private int aktualnySemestr;


    public StudyProgramme(String name, String code, int liczbaSemestrow, int liczbaMozliwychITN) {
        this.name = name;
        this.code = code;
        this.liczbaSemestrow = liczbaSemestrow;
        this.liczbaMozliwychITN = liczbaMozliwychITN;
        this.aktualnySemestr=1;
    }

    public boolean mozeAwansowac(int niepowodzenia) {
        if (niepowodzenia > liczbaMozliwychITN) {
            return false;
        }
        return aktualnySemestr < liczbaSemestrow;
    }
    public void osiagniecieSemestru() {
        if (aktualnySemestr <  liczbaSemestrow) {
            aktualnySemestr++;
        }
    }

    public String getName() {
        return name;
    }
    public int getAktualnySemestr() {
        return aktualnySemestr;
    }
}