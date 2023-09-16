import java.util.Random;

public class Kritika {
    private Kriticar kriticar;
    private Film film;
    private int ocena;

    public Kriticar getKriticar() {
        return kriticar;
    }

    public Kritika(Kriticar kriticar, Film film) {
        this.kriticar = kriticar;
        this.film = film;
        this.ocena = new Random().nextInt(10) + 1;
    }

    public void setKriticar(Kriticar kriticar) {
        this.kriticar = kriticar;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
}
