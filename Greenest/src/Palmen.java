import javax.swing.*;
public class Palmen extends Växter implements VätskaKalkyl {
    VätskaSort vätskaSort = VätskaSort.KRANVATTEN;

    public Palmen(String växtNamn, double längd) {
        super(växtNamn, längd);
    }
    @Override
    public double BeräknaVätska() {
        return 0.5 * getLängd();
    }
    @Override
    void PrintaUt() {
        JOptionPane.showMessageDialog(null, "Palmen behöver "
                + BeräknaVätska() + " liter " + vätskaSort.toString().toLowerCase());
    }
}