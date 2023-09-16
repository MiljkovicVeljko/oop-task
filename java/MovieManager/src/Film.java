import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Film {
    private String naziv;
    private int godina;
    private int trajanje;
    private final int defaultTrajanje = 90;
    private Zanr zanr;
    private List<ClanEkipe> clanoviEkipe;
    private List<Kritika> kritike;
    private double rejting;

    public double getRejting() {
        return rejting;
    }

    public void setRejting(double rejting) {
        this.rejting = rejting;
    }

    public List<ClanEkipe> getClanoviEkipe() {
        return clanoviEkipe;
    }

    public void setClanoviEkipe(ArrayList<ClanEkipe> clanoviEkipe) {
        this.clanoviEkipe = clanoviEkipe;
    }

    public Film(String naziv, int godina, int trajanje, Zanr zanr, List<Reziser> reziseri) {
        this.naziv = naziv;
        this.godina = godina;
        if (trajanje <= 0) {
            this.trajanje = defaultTrajanje;
        } else {
            this.trajanje = trajanje;
        }
        this.zanr = zanr;
        this.clanoviEkipe = new ArrayList<>();
        this.clanoviEkipe.addAll(reziseri);
        this.kritike = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    public Zanr getZanr() {
        return zanr;
    }

    public void setZanr(Zanr zanr) {
        this.zanr = zanr;
    }

    public void setClanoviEkipe(List<ClanEkipe> clanoviEkipe) {
        this.clanoviEkipe = clanoviEkipe;
    }

    public List<Kritika> getKritike() {
        return kritike;
    }

    public void setKritike(List<Kritika> kritike) {
        this.kritike = kritike;
    }

    public boolean dodajGlumca(Glumac glumac) {
        if (clanoviEkipe.contains(glumac)) {
            return false;
        }
        if (zanr == Zanr.MJUZIKL || zanr == Zanr.ANIMIRANI) {
            if (glumac.isLepGlas()) {
                clanoviEkipe.add(glumac);
                return true;
            }
        }else {
            clanoviEkipe.add(glumac);
            return true;
        }
        return false;
    }

    public Reziser getPredstavnika() {
        Reziser reziser = null;
        Date datum = new Date();

        for (ClanEkipe clan : clanoviEkipe) {
            if (clan instanceof Reziser && clan.getDatumRodjenja().compareTo(datum) < 0) {
                reziser = (Reziser) clan;
                datum = reziser.getDatumRodjenja();
            }
        }

        return reziser;
    }

    public double izracunajRejting() {
        int zbirTezKoef = 0;
        for (Kritika k: kritike) {
            rejting += k.getOcena() * k.getKriticar().getReputacija();
            zbirTezKoef += k.getKriticar().getReputacija();
        }
        return rejting / zbirTezKoef;
    }
}
