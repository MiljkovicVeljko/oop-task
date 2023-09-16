import java.util.Random;

public class Kriticar {
    private String ime;
    private String prezime;
    private int reputacija;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getReputacija() {
        return reputacija;
    }

    public void setReputacija(int reputacija) {
        this.reputacija = reputacija;
    }

    public Kriticar(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.reputacija = new Random().nextInt(101);
    }

    public void pohvaliRad(Kriticar k) {
        k.setReputacija((int) (k.reputacija + k.reputacija * 0.1));
        if (k.reputacija > 100) {
            k.setReputacija(100);
        }
    }

    public void oceniFilm(Film film) {
    Kritika kritika = new Kritika(this, film);
    film.getKritike().add(kritika);
}}
