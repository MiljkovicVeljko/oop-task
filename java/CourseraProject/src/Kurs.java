import java.util.ArrayList;
import java.util.List;

public class Kurs extends Obuka {
    private boolean onlajn;
    private List<Kurs> preduslovi;
    public Kurs(String naziv, int minimalanBrojPolaznika, Oblast oblast, boolean onlajn) {
        super(naziv, minimalanBrojPolaznika, oblast);
        this.onlajn = onlajn;
        this.preduslovi = new ArrayList<>();
    }
}
