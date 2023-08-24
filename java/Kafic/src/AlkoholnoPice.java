public class AlkoholnoPice extends Pice {
    protected double brojPromila;

    public double getBrojPromila() {
        return brojPromila;
    }

    public AlkoholnoPice(String naziv, String brend, Ukus ukus) {
        super(naziv, brend, ukus);
    }

    public void setBrojPromila(double brojPromila) {
        this.brojPromila = brojPromila;
    }

    public boolean isJakoPice() {
        return brojPromila > 10;
    }

    @Override
    public void opisiPice() {
        super.opisiPice();
        System.out.println("Broj promila: " + brojPromila + "%");
    }
}
