import java.util.ArrayList;
import java.util.List;

public class Polaznik implements Registracija {
    private String ime;
    private String prezime;
    private String email;
    private List<Obuka> obuke;

    public Polaznik(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.obuke = new ArrayList<>();
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Obuka> getObuke() {
        return obuke;
    }

    public void setObuke(List<Obuka> obuke) {
        this.obuke = obuke;
    }

    @Override
    public boolean registruj(Obuka o) {
        return false;
    }

    @Override
    public boolean registrovan(Obuka o) {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIme().substring(0, 1));
        sb.append(getPrezime());
        sb.append("@raf.rs");
        return sb.toString().toLowerCase();
    }
}
