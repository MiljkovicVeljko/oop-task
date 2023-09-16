import java.util.Date;

public class Glumac extends ClanEkipe {

    private boolean lepGlas;

    public boolean isLepGlas() {
        return lepGlas;
    }

    public void setLepGlas(boolean lepGlas) {
        this.lepGlas = lepGlas;
    }

    public Glumac(String ime, String prezime, Date datumRodjenja, Pol pol) {
        super(ime, prezime, datumRodjenja, pol);
    }

    @Override
    public void odrziGovor() {
        pripremiGovor();
        System.out.println("Ovaj uspeh ne bi bio moguc da nije mojih tojasa");
    }
}
