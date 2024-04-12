package student;

public class Student {

    //polja
    private String ime;
    private String prezime;
    static int godine;
    private String email;
    private Adresa adresa;

    Object obj;

    //empty brackets

    {
        System.out.println("prazan blok");
    }

    static {
        //ime = ""; mora static
        godine = 18;
        System.out.println("staticki prazan blok");
    }

    //konstruktori - mehanizam za kreiranje objekata

    private Student() {
        System.out.println("Prazan konstruktor!");
    }

    public Student(String i, String p, int g) {
        System.out.println("Params konstruktor!");
        ime = i;
        prezime = p;
        godine = g;
    }

    public Student(String ime, String prezime) {
        System.out.println("Params konstruktor 2!");
        this.ime = ime;
        this.prezime = prezime;
    }

    public Student(String i, int godine) {
        this.ime = i;
        this.godine = godine;
    }

    public Student(String ime) {
        this.ime = ime;
    }

    public Student(String ime, String prezime, String email, Adresa adresa) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.adresa = adresa;
    }

    //metode - ono sto objekat radi
    public static void ispis(){
        System.out.println("Ispis");
    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "student.Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godine=" + godine +
                '}';
    }
}
