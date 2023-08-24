public class Pice {
    protected String naziv;
    protected String brend;
    protected Ukus ukus;

    public void setUkus(Ukus ukus) {
        this.ukus = ukus;
    }

    public Pice(String naziv, String brend, Ukus ukus) {
        this.naziv = naziv;
        this.brend = brend;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public Ukus getUkus() {
        return ukus;
    }

    public void opisiPice() {
        System.out.println("Pice " + naziv + " | " + brend + ",ukus: " + ukus);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pice == false) {
            return false;
        }
        Pice p = (Pice) obj;
        if (this.naziv.equals(p.naziv) && this.brend.equals(p.brend) && this.ukus.equals(p.ukus)) {
            return true;
        }
        return false;
    }
}
