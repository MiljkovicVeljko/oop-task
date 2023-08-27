import java.util.ArrayList;

public class Student {

    private String studProgramOznaka;
    private int broj;
    private int godinaUpisa;
    private ArrayList<Predmet> polozeniPredmeti;
    private ArrayList<AktivnostStudenta> aktivnosti;

    public ArrayList<Predmet> getPolozeniPredmeti() {
        return polozeniPredmeti;
    }

    public void setPolozeniPredmeti(ArrayList<Predmet> polozeniPredmeti) {
        this.polozeniPredmeti = polozeniPredmeti;
    }

    public ArrayList<AktivnostStudenta> getAktivnosti() {
        return aktivnosti;
    }

    public void setAktivnosti(ArrayList<AktivnostStudenta> aktivnosti) {
        this.aktivnosti = aktivnosti;
    }

    public String getStudProgramOznaka() {
        return studProgramOznaka;
    }

    public void setStudProgramOznaka(String studProgramOznaka) {
        this.studProgramOznaka = studProgramOznaka;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(int godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public Student() {
        aktivnosti = new ArrayList<>();
    }

    public boolean dodajAktivnost(AktivnostStudenta as) {
        if (as.proveriUslov(this)) {
            aktivnosti.add(as);
            return true;
        }
        return false;
    }

    public int vratiGodinuStudija() {
        int najvecaGodina = 0;
        for (AktivnostStudenta as: aktivnosti) {
            if (as.getGodinaStudija() > najvecaGodina) {
                najvecaGodina = as.getGodinaStudija();
            }
        }
        return najvecaGodina;
    }

    public boolean jePonavljac() {
        int index = aktivnosti.size()-1;
        if (aktivnosti.get(index) instanceof ObnovaGodine) {
            return true;
        }
        return false;
    }

    public boolean slusaPredmet(Predmet p) {
        int trenutnaGodina = vratiGodinuStudija();
        int predmetSemestar = p.getSemestar();
        int predmetGodina = (predmetSemestar-1)/2;
        
        return trenutnaGodina == predmetGodina;
    }

}
