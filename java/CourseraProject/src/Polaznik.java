import java.util.ArrayList;
import java.util.List;

public class Polaznik implements Registracija {
    private String ime;
    private String prezime;
    private String email;
    private List<ObukaPolaznika> obuke;

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

    public List<ObukaPolaznika> getObuke() {
        return obuke;
    }

    public void setObuke(List<ObukaPolaznika> obuke) {
        this.obuke = obuke;
    }

    @Override
    public boolean registruj(Obuka o) {
        if (this.getEmail() == null)
            return false;
        if (!this.getEmail().contains("@"))
            return false;
        for (ObukaPolaznika op: obuke) {
            if (op.getObuka().equals(o)) {
                return false;
            }
        }
        if (o instanceof Kurs) {
            Kurs k = (Kurs)o;
            for (Kurs preduslov : k.getPreduslovi()) {
                boolean vecSlusao = false;
                for (ObukaPolaznika op : this.getObuke()) {
                    if (op.getObuka().equals(preduslov)) {
                        vecSlusao = true;
                    }
                }
                if (vecSlusao == false) {
                    return false;
                }
            }
        } else if (o instanceof Projekat) {
            Projekat p = (Projekat)o;
            int maksBroj = p.getMaximalanBrojPolaznika();
            int brPolaznika = p.getObukePolaznika().size();

            if (brPolaznika >= maksBroj) {
                return false;
            }
        }
        ObukaPolaznika novaObuka = new ObukaPolaznika(this);
        novaObuka.setObuka(o);
        this.getObuke().add(novaObuka);
        o.getObukePolaznika().add(novaObuka);

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
