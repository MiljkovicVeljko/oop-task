import java.util.ArrayList;
import java.util.List;

public class Kurs extends Obuka {
    private boolean onlajn;
    private List<Kurs> preduslovi;

    public boolean isOnlajn() {
        return onlajn;
    }

    public void setOnlajn(boolean onlajn) {
        this.onlajn = onlajn;
    }

    public List<Kurs> getPreduslovi() {
        return preduslovi;
    }

    public void setPreduslovi(List<Kurs> preduslovi) {
        this.preduslovi = preduslovi;
    }

    public Kurs(String naziv, Oblast oblast, int minimalanBrojPolaznika, boolean onlajn) {
        super(naziv, minimalanBrojPolaznika, oblast);
        this.onlajn = onlajn;
        this.preduslovi = new ArrayList<>();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
