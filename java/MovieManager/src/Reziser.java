import java.util.Date;

public class Reziser extends ClanEkipe {

    private int brojFilmova;

    public int getBrojFilmova() {
        return brojFilmova;
    }

    public void setBrojFilmova(int brojFilmova) {
        this.brojFilmova = brojFilmova;
    }

    public Reziser(String ime, String prezime, Date datumRodjenja, Pol pol) {
        super(ime, prezime, datumRodjenja, pol);
    }

    @Override
    public void odrziGovor() {

    }

    @Override
    public String getIme() {
        return super.getIme();
    }

    @Override
    public void predstavi() {
        super.predstavi();
    }

    @Override
    public void primiOskara() {
        super.primiOskara();
    }

    @Override
    public void pripremiGovor() {
        super.pripremiGovor();
    }
}
