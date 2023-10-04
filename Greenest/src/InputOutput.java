import javax.swing.*;
import java.util.InputMismatchException;
public class InputOutput {
    public static void InputHanterare(VäxtRekord vr) {
        do {
            String inputData;
            try {
                inputData = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?");
                System.out.println(inputData);
                if (inputData == null) {
                    System.exit(0);
                }
                if (inputData.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Obs! Ingen Input");
                    continue;
                }
                if (!vr.VäxtFinns(inputData)) {
                    JOptionPane.showMessageDialog(null, "Växten finns inte registerad i hotellet");
                } else {
                    vr.GetVäxt(inputData).PrintaUt();
                }
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Miss match");
            }
        }
        while (JOptionPane.showConfirmDialog(null, "Nytt försök?")
                == JOptionPane.YES_OPTION); //kollar om användare vill lägga til en ny medlem
    }
}