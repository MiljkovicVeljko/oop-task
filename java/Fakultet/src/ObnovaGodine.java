import java.util.ArrayList;

public class ObnovaGodine extends AktivnostStudenta {

    private int godinaObnove;

    public ObnovaGodine(int godina, int mesec, int dan) {
        super(godina, mesec, dan);
        predmetiKojeUpisuje = new ArrayList<>();
    }

    private ArrayList<Predmet> predmetiKojeUpisuje;

    public ArrayList<Predmet> getPredmetiKojeUpisuje() {
        return predmetiKojeUpisuje;
    }

    public void setPredmetiKojeUpisuje(ArrayList<Predmet> predmetiKojeUpisuje) {
        this.predmetiKojeUpisuje = predmetiKojeUpisuje;
    }

    public int getGodinaObnove() {
        return godinaObnove;
    }

    public void setGodinaObnove(int godinaObnove) {
        this.godinaObnove = godinaObnove;
    }

    @Override
    public int getGodinaStudija() {
        return godinaObnove;
    }

    @Override
    public boolean proveriUslov(Student student) {
        for (AktivnostStudenta as : student.getAktivnosti()) {
            if (as.getGodinaStudija() == godinaObnove) {
                return true;
            }
        }
        return false;
    }
}
