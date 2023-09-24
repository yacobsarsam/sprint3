package PackageBil;

public class Bil {
    private String registreringsnummer, märke;
    private int modell;
    private Bilägare ägare;

    public Bilägare getÄgare() {
        return ägare;
    }

    protected void setÄgare(Bilägare ägare) {
        this.ägare = ägare;
    }

    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

    public void setRegistreringsnummer(String registreringsnummer) {
        this.registreringsnummer = registreringsnummer;
    }

    public String getMärke() {
        return märke;
    }

    public void setMärke(String märke) {
        this.märke = märke;
    }

    public int getModell() {
        return modell;
    }

    public void setModell(int modell) {
        this.modell = modell;
    }

    public Bil(String registreringsnummer, String märke, int modell) {
        this.registreringsnummer = registreringsnummer;
        this.märke = märke;
        this.modell = modell;
    }
}