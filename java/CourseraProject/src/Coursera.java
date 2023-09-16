import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Coursera {
    private List<Registracija> registracije;
    private List<Obuka> obuke;

    private static Coursera instance;

    private Coursera() {
        this.registracije = new ArrayList<>();
        this.obuke = new ArrayList<>();
    }

    public static Coursera getInstance() {
        if (instance == null) {
            instance = new Coursera();
        }
        return instance;
    }

    public void sveObukePolaznika(Polaznik p) {
        for (ObukaPolaznika op : p.getObuke()) {
            System.out.println(op.getObuka());
        }
    }

    public boolean dodajRegistraciju(Registracija r) {
        return this.registracije.add(r);
    }

    public void ispis() {
        for (Obuka o : obuke) {
            if (o.getObukePolaznika().size() >= o.getMinimalanBrojPolaznika()) {
                System.out.println(o.toString());
            }
        }
    }

    public void ispis(String putanja) {
        File file = new File(putanja);
        try {
            FileWriter fw = new FileWriter(file);
            for (Obuka o : obuke) {
                if (o.getObukePolaznika().size() >= o.getMinimalanBrojPolaznika()) {
                    fw.write(o.toString());
                }
            }
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void dodajObuku(Obuka o) {
        this.obuke.add(o);
    }
}
