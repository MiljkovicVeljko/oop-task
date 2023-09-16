import java.util.ArrayList;
import java.util.List;

public class Profesor implements Registracija{
    private String ime;
    private String prezime;
    private String id;
    private Oblast oblast;
    private List<Obuka> obuke;

    public Profesor(String ime, String prezime, String id, Oblast oblast) {
        this.ime = ime;
        this.prezime = prezime;
        this.id = id;
        this.oblast = oblast;
        obuke = new ArrayList<>();
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Oblast getOblast() {
        return oblast;
    }

    public void setOblast(Oblast oblast) {
        this.oblast = oblast;
    }

    public List<Obuka> getObuke() {
        return obuke;
    }

    public void setObuke(List<Obuka> obuke) {
        this.obuke = obuke;
    }

    @Override
    public boolean registruj(Obuka o) {
        if (this.oblast != o.getOblast()) {
            return false;
        }
        for (Obuka obuka : obuke) {
            if (obuka.equals(o)) {
                return false;
            }
        }

        if (obuke.size() > 3) {
            return false;
        }

        if (o instanceof Projekat) {
            Projekat p = (Projekat)o;
            int brojP = p.getMaximalanBrojPolaznika();
            int predavaci = o.getPredavaci().size();
            if (predavaci > brojP) {
                return false;
            }
        }
        this.getObuke().add(o);
        o.getPredavaci().add(this);

        return false;
    }

    @Override
    public boolean registrovan(Obuka o) {
        return false;
    }


}
