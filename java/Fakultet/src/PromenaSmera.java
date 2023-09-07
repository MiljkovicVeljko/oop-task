public class PromenaSmera extends AktivnostStudenta{
    private String noviStudProgram;

    public String getNoviStudProgram() {
        return noviStudProgram;
    }

    public void setNoviStudProgram(String noviStudProgram) {
        this.noviStudProgram = noviStudProgram;
    }

    public PromenaSmera(int godina, int mesec, int dan, String noviStudProgram) {
        super(godina, mesec, dan);
        this.noviStudProgram = noviStudProgram;
    }

    @Override
    public int getGodinaStudija() {

        return 0;
    }

    @Override
    public boolean proveriUslov(Student student) {
        int ukupnoESPB = 0;
        for (Predmet p: student.getPolozeniPredmeti()) {
            ukupnoESPB += p.getEspb();
        }
        if (ukupnoESPB < 48) {
            return false;
        }
        return true;
    }
}
