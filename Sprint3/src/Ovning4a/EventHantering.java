package Ovning4a;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EventHantering implements ActionListener {
    JTextField jtf1;
    JButton jb1,jb2,jb3,jb4;
    JTextArea jta1;
    public EventHantering(JTextField jtf1,JButton jb1,JButton jb2
            , JButton jb3,JButton jb4,JTextArea jta1){
        this.jtf1 =jtf1;
        this.jb1=jb1;
        this.jb2=jb2;
        this.jb3=jb3;
        this.jb4=jb4;
        this.jta1=jta1;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jtf1 || e.getSource() == jb1)
            läsInFil(jtf1.getText());
        else if (e.getSource() == jb2)
            sparaFil(jtf1.getText());
        else if (e.getSource() == jb3)
            try {
                jta1.print();  // skriver ut texten, kan ge exception
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        else if (e.getSource() == jb4)
            System.exit(0);

    }

    private void läsInFil(String filnamn) {
        try (FileReader r = new FileReader(filnamn)) {
            jta1.read(r, null);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void sparaFil(String filnamn) {
        try (FileWriter w = new FileWriter(filnamn)) {
            jta1.write(w);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
