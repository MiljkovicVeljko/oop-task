public class BezalkoholnoPice extends Pice {
    protected boolean energetsko;

    public BezalkoholnoPice(String naziv, String brend, Ukus ukus) {
        super(naziv, brend, ukus);
    }

    public void opisiPice() {
        super.opisiPice();
        System.out.println("Energetysko: " + energetsko);
    }

    public  boolean isEnergetsko() {
        return energetsko;
    }

    public void setEnergetsko(boolean energetsko) {
        this.energetsko = energetsko;
    }
}
