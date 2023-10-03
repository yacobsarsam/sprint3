import javax.swing.*;
public class Kaktusen extends Växter implements VätskaKalkyl{
final double kaktusFastVattenMängd = 0.02;
    VätskaSort vätskaSort = VätskaSort.MINERALVATTEN;
    public Kaktusen( String växtNamn,double längd) {
        super(växtNamn,längd);
    }
    @Override
    public double BeräknaVätska() {
        return kaktusFastVattenMängd;
    }
    @Override
    void PrintaUt (){
        JOptionPane.showMessageDialog(null, "Kaktusen behöver "
                + BeräknaVätska() + " liter " + vätskaSort.toString().toLowerCase());
    }
}