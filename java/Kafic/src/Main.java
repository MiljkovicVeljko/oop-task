public class Main {
    public static void main(String[] args) {
        Pice pice = new Pice("Voda", "Rosa", Ukus.NEUTRALNO);
        pice.opisiPice();

        AlkoholnoPice alkoholnoPice1 = new AlkoholnoPice("Vino", "Kovacevic", Ukus.KISELO);
        alkoholnoPice1.setBrojPromila(13);
        alkoholnoPice1.opisiPice();

        AlkoholnoPice alkoholnoPice2 = new AlkoholnoPice("Rakija", "Dedina", Ukus.GORKO);
        alkoholnoPice2.setBrojPromila(40);
        alkoholnoPice2.opisiPice();



        BezalkoholnoPice bezalkoholnoPice1 = new BezalkoholnoPice("Jagoda", "Next", Ukus.VOCNO);
        bezalkoholnoPice1.setEnergetsko(false);
        bezalkoholnoPice1.opisiPice();

        BezalkoholnoPice bezalkoholnoPice2 = new BezalkoholnoPice("Redbull", "Redbnul;l", Ukus.VOCNO);
        bezalkoholnoPice2.setEnergetsko(true);
        bezalkoholnoPice2.opisiPice();
    }
}