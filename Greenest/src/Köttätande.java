import javax.swing.*;
public class Köttätande extends Växter implements VätskaKalkyl {
    VätskaSort vätskaSort = VätskaSort.PROTEINDRYCK;

    public Köttätande(String växtNamn, double längd) {
        super(växtNamn, längd);
    }
    @Override
    public double BeräknaVätska() {
        return (0.2 * getLängd()) + 0.1;
    }
    @Override
    void PrintaUt() {
        JOptionPane.showMessageDialog(null, "Köttätande behöver "
                + BeräknaVätska() + " liter " + vätskaSort.toString().toLowerCase());
    }
}