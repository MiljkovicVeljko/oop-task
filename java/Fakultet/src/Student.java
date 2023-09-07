import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

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
        polozeniPredmeti = new ArrayList<>();
    }

    public Student(String studProgramOznaka, int broj, int godinaUpisa) {
        this.studProgramOznaka = studProgramOznaka;
        this.broj = broj;
        this.godinaUpisa = godinaUpisa;
        polozeniPredmeti = new ArrayList<>();
    }

    public boolean dodajAktivnost(AktivnostStudenta as) {
        if (as.proveriUslov(this)) {
            aktivnosti.add(as);

            if (as instanceof PromenaSmera) {
                PromenaSmera ps = (PromenaSmera) as;
                this.setStudProgramOznaka(ps.getNoviStudProgram());
                Date date = new Date();
                this.setGodinaUpisa(date.getYear());
                UpisGodine ug = new UpisGodine(date.getYear(), date.getMonth(), date.getDay());
                aktivnosti.add(ug);
            }
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

    public void ispisKonzola() {
        for (AktivnostStudenta as :aktivnosti) {
            System.out.println(as);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        return ":";
    }

    public void upisFajl(String putanja) {
        File file = new File(putanja);
        try {
            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);

            for (AktivnostStudenta as : aktivnosti) {
                fw.write(as.toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Greska!");
            e.printStackTrace();
        }
    }

    public void addPolozeniPredmet(Predmet p) {
        this.polozeniPredmeti.add(p);
    }
}
