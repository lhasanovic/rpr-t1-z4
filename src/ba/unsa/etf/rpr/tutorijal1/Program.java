package ba.unsa.etf.rpr.tutorijal1;

public class Program {

    public static void main(String[] args) {

        Student s = new Student("Lamija", "Hasanovic", 3244);

        System.out.println(s);

        Predmet p = new Predmet("predmet", 12121, 21);
        p.upisi(s);

        System.out.println(p);

        Student ss = new Student("dd", "ddd", 2121);

        p.upisi(ss);

        System.out.println(p);

        p.ispisi(ss);

        System.out.println(p);

    }
}
