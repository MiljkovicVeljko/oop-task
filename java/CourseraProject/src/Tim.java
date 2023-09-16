import java.util.ArrayList;
import java.util.List;

public class Tim implements Registracija {

    private List<Polaznik> clanovi;
    private Polaznik vodja;

    public Tim(List<Polaznik> clanovi, Polaznik vodja) {
        this.clanovi = new ArrayList<>(clanovi);
        this.vodja = vodja;
    }

    @Override
    public boolean registruj(Obuka o) {
        if (!(o instanceof Projekat)) {
            return false;
        }
        if (o.getOblast() != Oblast.PROGRAMIRANJE) {
            return false;
        }

        int ukupanBrojClanova = 1+this.clanovi.size();
        Projekat p = (Projekat)o;
        if (p.getObukePolaznika().size() + ukupanBrojClanova > p.getMaximalanBrojPolaznika())
            return false;

        ObukaPolaznika obukaVodje = new ObukaPolaznika(vodja);
        obukaVodje.setObuka(o);
        this.vodja.getObuke().add(obukaVodje);
        for (Polaznik clan: clanovi) {
            ObukaPolaznika obukaClana = new ObukaPolaznika(clan);
            obukaClana.setRegistracioniBroj(obukaVodje.getRegistracioniBroj());
            obukaClana.setObuka(o);
            clan.getObuke().add(obukaClana);
        }

        o.getObukePolaznika().add(obukaVodje);
        return true;
    }

    @Override
    public boolean registrovan(Obuka o) {
        return false;
    }
}
