package student;

public class Student {

    //polja
    String ime;
    String prezime;
    static int godine;
    String email;


    //konstruktori - mehanizam za kreiranje objekata

    public Student() {
        //System.out.println("Prazan konstruktor!");
    }

    public Student(String i, String p, int g) {
        //System.out.println("Params konstruktor!");
        ime = i;
        prezime = p;
        godine = g;
    }

    public Student(String ime, String prezime) {
        //System.out.println("Params konstruktor 2!");
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



    //metode - ono sto objekat radi
    public static void ispis(){
        System.out.println("Ispis");
    }

    public Student student(){
        return new Student();
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
