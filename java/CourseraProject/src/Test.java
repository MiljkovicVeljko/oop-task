import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Coursera c = Coursera.getInstance();
        Profesor p1 = new Profesor("Pera", "Peric", "123", Oblast.PROGRAMIRANJE);
        Profesor p2 = new Profesor("Sara", "Saric", "321", Oblast.SLIKARSTVO);

        Projekat projekat1 = new Projekat("Projekat1", Oblast.PROGRAMIRANJE, 0, 10);
        Projekat projekat2 = new Projekat("Projekat2", Oblast.PROGRAMIRANJE, 0, 6);

        Kurs kurs = new Kurs("Kurs1", Oblast.SLIKARSTVO, 0, true);

        Polaznik po1 = new Polaznik("Nikola", "Nikolic", "nnikolic@gmail.com");
        Polaznik po2 = new Polaznik("Milica", "Mikolic", "mmikolic@gmail.com");
        Polaznik po3 = new Polaznik("Pikola", "Pikolic", "ppikolic@gmail.com");
        Polaznik po4 = new Polaznik("Dikola", "Dikolic", "ddikolic@gmail.com");
        Polaznik po5 = new Polaznik("Likola", "Likolic", "llikolic@gmail.com");

        po1.registruj(kurs);
        po2.registruj(kurs);

        po3.registruj(projekat1);
        po4.registruj(projekat2);

        po5.registruj(projekat2);
        po1.registruj(projekat1);

        List<Polaznik> polaznici = new ArrayList<>();
        polaznici.add(po5);
        polaznici.add(po4);
        polaznici.add(po3);
        polaznici.add(po2);
        Tim tim = new Tim(polaznici, po1);

        tim.registruj(projekat2);

        c.dodajObuku(projekat1);
        c.dodajObuku(projekat2);
        c.dodajObuku(kurs);
        c.ispis("ispis.txt");
    }
}
