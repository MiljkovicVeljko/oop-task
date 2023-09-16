import java.util.ArrayList;
import java.util.List;

public abstract class Obuka implements Comparable {
    private String naziv;
    private int minimalanBrojPolaznika;
    private Oblast oblast;
    private List<Profesor> predavaci;

    public int compareTo(Obuka o) {
        if (this.getObukePolaznika().size() > o.getObukePolaznika().size())
            return 1;
        else if (this.getObukePolaznika().size() < o.getObukePolaznika().size())
            return -1;
        else
            return this.getNaziv().compareTo(o.getNaziv());
    }

    private List<ObukaPolaznika> obukePolaznika;

    public Obuka(String naziv, int minimalanBrojPolaznika, Oblast oblast) {
        this.naziv = naziv;
        this.minimalanBrojPolaznika = minimalanBrojPolaznika;
        this.oblast = oblast;
        predavaci = new ArrayList<>();
        obukePolaznika = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getMinimalanBrojPolaznika() {
        return minimalanBrojPolaznika;
    }

    public void setMinimalanBrojPolaznika(int minimalanBrojPolaznika) {
        this.minimalanBrojPolaznika = minimalanBrojPolaznika;
    }

    public Oblast getOblast() {
        return oblast;
    }

    public void setOblast(Oblast oblast) {
        this.oblast = oblast;
    }

    public List<Profesor> getPredavaci() {
        return predavaci;
    }

    public void setPredavaci(List<Profesor> predavaci) {
        this.predavaci = predavaci;
    }

    public List<ObukaPolaznika> getObukePolaznika() {
        return obukePolaznika;
    }

    public void setObukePolaznika(List<ObukaPolaznika> obukePolaznika) {
        this.obukePolaznika = obukePolaznika;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getNaziv() + " : ");
        sb.append(this.getObukePolaznika().size() + ", ");
        if (this instanceof Projekat) {
            sb.append("PROJEKAT ");
        } else {
            sb.append("KURS ");
            Kurs k = (Kurs)this;
            sb.append(k.isOnlajn() == true ? "[online]" : "[offline]");
        }
        for (ObukaPolaznika op:this.getObukePolaznika()) {
            sb.append(op.getPolaznik());
            sb.append("\n");
        }

        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        Obuka o = (Obuka)obj;

        return this.getNaziv().equals(o.getNaziv());
    }
}
