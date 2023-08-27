import java.util.ArrayList;

public class UpisGodine extends AktivnostStudenta {
    private int godinaKojuUpisuje;
    private ArrayList<Predmet> prenetiPredmeti;

    public ArrayList<Predmet> getPrenetiPredmeti() {
        return prenetiPredmeti;
    }

    public void setPrenetiPredmeti(ArrayList<Predmet> prenetiPredmeti) {
        this.prenetiPredmeti = prenetiPredmeti;
    }

    public int getGodinaKojuUpisuje() {
        return godinaKojuUpisuje;
    }

    public void setGodinaKojuUpisuje(int godinaKojuUpisuje) {
        this.godinaKojuUpisuje = godinaKojuUpisuje;
    }

    public UpisGodine(int godina, int mesec, int dan) {
        super(godina, mesec, dan);
        prenetiPredmeti = new ArrayList<>();
    }

    @Override
    public int getGodinaStudija() {
        return godinaKojuUpisuje;
    }

    @Override
    public boolean proveriUslov(Student student) {
        int ukupnoEspb = 0;
        for (Predmet p : student.getPolozeniPredmeti()) {
            ukupnoEspb += p.getEspb();
        }

        if (godinaKojuUpisuje == 2 && ukupnoEspb < 30) {
            return false;
        }
        if (godinaKojuUpisuje == 3 && ukupnoEspb < 90) {
            return false;
        }
        if (godinaKojuUpisuje == 4 && ukupnoEspb < 150) {
            return false;
        }

        ArrayList<AktivnostStudenta> as = student.getAktivnosti();
        int najvecaGodina = 0;
        for (AktivnostStudenta a: as) {
            if (a.getGodinaStudija() > najvecaGodina) {
                najvecaGodina = a.getGodinaStudija();
            }
        }

        return godinaKojuUpisuje == najvecaGodina + 1;
    }
}
