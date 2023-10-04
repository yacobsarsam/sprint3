import javax.swing.*;
public class Växter {
    private double längd; // i meter
    private String växtNamn;
    public Växter(String växtNamn, double längd) {
        this.längd = längd;
        this.växtNamn = växtNamn;
    }
    public double BeräknaVätska() {  return 0;  }
    void PrintaUt() {
        JOptionPane.showMessageDialog(null,
                "Alla växter behöver vätska!");
    }
    public double getLängd() {
        return längd;
    }

    public void setLängd(double längd) {
        this.längd = längd;
    }
    public String getVäxtNamn() {
        return växtNamn;
    }
    public void setVäxtNamn(String växtNamn) {
        this.växtNamn = växtNamn;
    }
}