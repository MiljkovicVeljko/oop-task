import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("RI", 44, 2019);
        UpisGodine ug =  new UpisGodine(2019, 11, 5, 1);
        UpisGodine ug2 =  new UpisGodine(2020, 11, 5, 2);
        ObnovaGodine og =  new ObnovaGodine(2021, 11, 5);
        PromenaSmera ps =  new PromenaSmera(2022, 11, 5, "RN");

        Predmet algebra = new Predmet("Algebra", 26, 1);
        Predmet uup = new Predmet("Uvod u programiranje", 26, 1);
        Predmet oop = new Predmet("Objectno Orjenisano programiranje", 26, 2);
        Predmet analiza = new Predmet("Matematika u programiranje", 12, 2);

        student.addPolozeniPredmet(algebra);
        student.addPolozeniPredmet(oop);
        ArrayList<Predmet> prenetiPredmeti = new ArrayList<>();
        prenetiPredmeti.add(uup);
        ug.setPrenetiPredmeti(prenetiPredmeti);
        ArrayList<Predmet> prenetiPredmeti2 = new ArrayList<>();
        prenetiPredmeti2.add(analiza);
        ug2.setPrenetiPredmeti(prenetiPredmeti2);

        student.dodajAktivnost(ug);
        student.dodajAktivnost(ug2);
        student.dodajAktivnost(og);
        student.dodajAktivnost(ps);

        student.ispisKonzola();
        student.upisFajl("aktivnosti.txt");
    }
}