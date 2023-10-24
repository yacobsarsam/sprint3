package Ovning5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Ovning5 extends JFrame implements ActionListener {
   int compPoäng= 0;
    int duPoäng =0;

    JPanel jp = new JPanel();
    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();
    JLabel jl1 = new JLabel("Computer: " +compPoäng);
    JButton jl2 = new JButton("Sten");
    JButton jl3 = new JButton("Sax");
    JButton jl4 = new JButton("Påse");
    JLabel jl5 = new JLabel("Du: " + duPoäng);
    JButton jl6 = new JButton("Sten");
    JButton jl7 = new JButton("Sax");
    JButton jl8 = new JButton("Påse");
    //JLabel jl9 = new JLabel("Påäng");
    //JLabel jl10 = new JLabel("Påäng");

    public Ovning5(){
        jp1.setLayout(new GridLayout(4, 1));
        jp1.add(jl1);
        jp1.add(jl2);
        jp1.add(jl3);
        jp1.add(jl4);
      //  jp1.add(jl5);
        jp2.setLayout(new GridLayout(4, 1));
        jp2.add(jl5);
        jp2.add(jl6);
        jp2.add(jl7);
        jp2.add(jl8);
        //jp1.add(jl10);

        jp.setLayout(new BorderLayout());
        jp.add(jp1, BorderLayout.WEST);
        jp.add(jp2, BorderLayout.EAST);
        add(jp);
        setSize(200,300);
        jl2.addActionListener(this);
        jl3.addActionListener(this);
        jl4.addActionListener(this);
        jl6.addActionListener(this);
        jl7.addActionListener(this);
        jl8.addActionListener(this);
        //pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jl6)
        {   //Du: sten
            int myValue = 1;
            int comp = GetRandomChoiseForComputer(myValue);
            if(comp == 2){
                SetBackgroundCoulor();
                duPoäng++;
                jl5.setText("Du" + duPoäng);
                jl3.setBackground(Color.yellow);}
            else if (comp == 3) {
                SetBackgroundCoulor();
                compPoäng++;
                jl1.setText("Computer " + compPoäng);
                jl4.setBackground(Color.yellow);
            }
        }
        if(e.getSource()==jl7)
        {   //Du: sax
            int myValue = 2;
            int comp = GetRandomChoiseForComputer(myValue);
            if(comp == 3){
                SetBackgroundCoulor();
                duPoäng++;
                jl5.setText("Du" + duPoäng);
            jl4.setBackground(Color.yellow);}
            else if (comp == 1) {
                SetBackgroundCoulor();
                compPoäng++;
                jl1.setText("Computer " + compPoäng);
                jl2.setBackground(Color.yellow);
            }
        }

        if(e.getSource()==jl8) {
            int myValue = 3;//Du: påse
            int comp = GetRandomChoiseForComputer(myValue);
            if (comp == 1) {
                SetBackgroundCoulor();
                duPoäng++;
                jl5.setText("Du" + duPoäng);
                jl2.setBackground(Color.yellow);
            } else if (comp == 2){
                SetBackgroundCoulor();
                compPoäng++;
                jl1.setText("Computer " + compPoäng);
                jl3.setBackground(Color.yellow);
        }
        }
    }
    void SetBackgroundCoulor(){
        jl2.setBackground(null);
        jl3.setBackground(null);
        jl4.setBackground(null);
    }
    private int GetRandomChoiseForComputer(int notThis){
        while (true){
        Random r = new Random();
        int value = r.nextInt(1,4) ;
        System.out.println("value" + value);
        if(value!=notThis)
            return value;
        }
    }

    public static void main(String[] args) {
Ovning5 o = new Ovning5();
    }
}
