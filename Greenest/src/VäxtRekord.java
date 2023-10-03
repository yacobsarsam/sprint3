import java.util.ArrayList;
public class VäxtRekord {
    public ArrayList<Växter> allaVäxter = new ArrayList<>();

    //skapar växter och lägger till de i ArrayList
    void SkapaVäxter() {
        Växter kaktus1 = new Kaktusen("Igge", 20);
        allaVäxter.add(kaktus1);
        Växter palm1 = new Palmen("Laura", 5);
        allaVäxter.add(palm1);
        Växter köttätende1 = new Köttätande("Meatloaf", 0.7);
        allaVäxter.add(köttätende1);
        Växter palm2 = new Palmen("Olof", 1);
        allaVäxter.add(palm2);
    }
    //hämtar ut växxt-objekt mha växtnman som bör vara unik
    Växter GetVäxt(String namn) {
        for (int i = 0; i < allaVäxter.size(); i++) {
            if (namn.equalsIgnoreCase(getAllaVäxter().get(i).getVäxtNamn().toLowerCase())) {
                return getAllaVäxter().get(i);
            }
        }
        return null;
    }
    //kollar om växt finns i arayylistan
    public boolean VäxtFinns(String inputData) {
        for (int i = 0; i < getAllaVäxter().size(); i++) {
            if (allaVäxter.get(i).getVäxtNamn().toLowerCase().equalsIgnoreCase(inputData))
                return true;
        }
        return false;
    }
    public ArrayList<Växter> getAllaVäxter() {
        return allaVäxter;
    }
    public void setAllaVäxter(ArrayList<Växter> allaVäxter) {
        this.allaVäxter = allaVäxter;
    }
}