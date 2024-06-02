import java.util.ArrayList;
import java.util.Date;

public class Student {

    private static ArrayList<Student> listaStudentow = new ArrayList<>();

    private static int idStudent = 0;

    private String firstName;

    private String lastName;

    private String email;

    private String adres;

    private String numerTelefonu;

    private Date dataUrodzenia;

    private StudyProgramme programme;

    private ArrayList<Grade> grades;

    private String numerIndexu;

    private StudentStatus status;

    public Student(String firstName, String lastName, String email, String adres, String numerTelefonu, Date dataUrodzenia) {
        this.numerIndexu = generowanieNumeruIndeksu();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.adres = adres;
        this.numerTelefonu = numerTelefonu;
        this.dataUrodzenia = dataUrodzenia;
        this.grades = new ArrayList<>();
        this.status = new StudentStatus("Kandydat");
        listaStudentow.add(this);

    }

    public static void promoteAllStudents() {
        for (Student student : listaStudentow) {
            student.osiagniecieSemestru();
        }
    }

    private static String generowanieNumeruIndeksu() {
        idStudent++;
        return "s" + idStudent;
    }
    public void enrollStudent(StudyProgramme programme){

        this.programme = programme;
        this.status = new StudentStatus("Student");

    }
    public void addGrade(int wynik, String nazwaKursu) {
        this.grades.add(new Grade(nazwaKursu, wynik));
    }

    public void osiagniecieSemestru() {
        int niepowodzenia = (int) grades.stream().filter(g -> g.getWynik() <= 2).count();
        if (programme.mozeAwansowac(niepowodzenia)) {
            programme.osiagniecieSemestru();
        }
    }

    public String toString() {
        return "Student{" +
                "indexNumber='" + numerIndexu + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + adres + '\'' +
                ", phoneNumber='" + numerTelefonu + '\'' +
                ", birthDate=" + dataUrodzenia +
                ", programme=" + (programme != null ? programme.getName() : "None") +
                ", grades=" + grades +
                ", status=" + status +
                '}';
    }
    public static void displayInfoAboutAllStudents() {
        for (Student s : listaStudentow) {
            System.out.println(s);
        }
    }

    //GETERY I SETERY
    public static ArrayList<Student> getListaStudentow() {
        return listaStudentow;
    }

    public static void setListaStudentow(ArrayList<Student> listaStudentow) {
        Student.listaStudentow = listaStudentow;
    }

    public static int getIdStudent() {
        return idStudent;
    }

    public static void setIdStudent(int idStudent) {
        Student.idStudent = idStudent;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }

    public StudyProgramme getProgramme() {
        return programme;
    }

    public void setProgramme(StudyProgramme programme) {
        this.programme = programme;
    }

    public String getNumerIndexu() {
        return numerIndexu;
    }

    public void setNumerIndexu(String numerIndexu) {
        this.numerIndexu = numerIndexu;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }
}