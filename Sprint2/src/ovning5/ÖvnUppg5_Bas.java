package ovning5;
import static javax.swing.JOptionPane.*;
import java.util.*;
public class ÖvnUppg5_Bas {
    public static void main (String[] arg) {
        String indata = showInputDialog
                ("Ange antal dagar, pris per dag samt bilmodell");
        double dagsPris = 0;
        int antalDagar  = 0;
        String bil      = "";
        boolean klar = false;

        while (!klar) { // fortsätt tills lyckad avkodning gjorts
            if (indata == null)
                System.exit(0);  // Användaren klickade på "Avbryt"
            Scanner sc = new Scanner(indata);

            String felText = "";
            try {
                antalDagar  = sc.nextInt();
                dagsPris = sc.nextDouble();
                bil = sc.next();
                klar = true;
            }
            catch (InputMismatchException e) {
                e.printStackTrace();
                felText = "Felaktigt tal!";
            }
            catch (NoSuchElementException e) {
                felText = "Indata saknas!";
            }
            catch (Exception e) {
                if (e instanceof InputMismatchException){ //om man vill fånga upp specifikt Exception
                    e.printStackTrace();
                }
                felText = "Ospecifierat fel inträffade, försök igen!";
            }
            if (! klar)
                indata = showInputDialog(felText
                        + "\nAnge antal dagar, pris per dag samt bilmodell");
        }
        double totPris = dagsPris * antalDagar;
        String s = String.format("Totalt pris för %s: %.2f", bil, totPris);
        showMessageDialog(null, s);
        System.exit(0);
    }
}