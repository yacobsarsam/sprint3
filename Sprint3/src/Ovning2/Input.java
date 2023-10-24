package Ovning2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Input extends JFrame implements ActionListener {
    Concumption c = new Concumption();
    Mil m = new Mil();
    JPanel jp = new JPanel();
    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();
    JTextField jtf1 = new JTextField(20);
    JTextField jtf2 = new JTextField(20);
    JTextField jtf3 = new JTextField(20);
    JLabel jl1 = new JLabel("Ange mäterställning nu");
    JLabel jl2 = new JLabel("Ange mäterställning för 1år sedan");
    JLabel jl3 = new JLabel("Ange antal förbrukad bensin");
    JLabel jl4 = new JLabel("Antal körda mil:");
    JLabel jl6 = new JLabel("Antal liter bensin:");
    JLabel jl8 = new JLabel("Förbrukning per mil:");
    JLabel jl5 = new JLabel();
    JLabel jl7 = new JLabel();
    JLabel jl9 = new JLabel();
    public int milToday;
    public int milYerAgo;
    public int consumedliterPerYear;

    public void Readinput() {
        jp1.setLayout(new GridLayout(3, 2));
        jp1.add(jl1);
        jp1.add(jtf1);
        jp1.add(jl2);
        jp1.add(jtf2);
        jp1.add(jl3);
        jp1.add(jtf3);
        jp.setLayout(new BorderLayout());
        jp.add(jp1, BorderLayout.NORTH);
        jp2.setLayout(new GridLayout(1, 6));
        jp2.add(jl4);
        jp2.add(jl5);
        jp2.add(jl6);
        jp2.add(jl7);
        jp2.add(jl8);
        jp2.add(jl9);
        jp.add(jp2, BorderLayout.SOUTH);
        add(jp);
        jtf1.addActionListener(this);
        jtf2.addActionListener(this);
        jtf3.addActionListener(this);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jtf1 || e.getSource() == jtf2 || e.getSource() == jtf3) {

            Scanner stjf1 = new Scanner(jtf1.getText());
            Scanner stjf2 = new Scanner(jtf2.getText());
            Scanner stjf3 = new Scanner(jtf3.getText());
            if (stjf1.hasNextInt() && stjf2.hasNextInt() && stjf3.hasNextInt()) {
                milToday = stjf1.nextInt();
                milYerAgo = stjf2.nextInt();
                consumedliterPerYear = stjf3.nextInt();

                jl5.setText(String.valueOf(m.GetNumberOfMilInYear(milToday,milYerAgo)));
                jl7.setText(String.valueOf(consumedliterPerYear));
                jl9.setText(String.valueOf(c.CalculateConcumptionPerMil(consumedliterPerYear,m.GetNumberOfMilInYear(milToday,milYerAgo))));
            }
        }
    }
}