public class Projekat extends Obuka {
    private int maximalanBrojPolaznika;

    public int getMaximalanBrojPolaznika() {
        return maximalanBrojPolaznika;
    }

    public void setMaximalanBrojPolaznika(int maximalanBrojPolaznika) {
        this.maximalanBrojPolaznika = maximalanBrojPolaznika;
    }

    public Projekat(String naziv, int minimalanBrojPolaznika, Oblast oblast, int maximalanBrojPolaznika) {
        super(naziv, minimalanBrojPolaznika, oblast);
        this.maximalanBrojPolaznika = maximalanBrojPolaznika;
    }
}
