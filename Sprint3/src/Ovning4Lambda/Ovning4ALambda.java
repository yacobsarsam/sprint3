package Ovning4Lambda;

import MyDemo.Jframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ovning4ALambda extends Jframe {
    JPanel jp = new JPanel();
    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();
    JLabel jl1= new JLabel("Filnman");
    JTextField jtf1 = new JTextField(10);
    JButton jb1= new JButton("Öppna");
    JButton jb2= new JButton("Spara");
    JButton jb3= new JButton("Skriv ut");
    JButton jb4= new JButton("Avsluta");
    JTextArea jta1=new JTextArea(20,50);

    JScrollPane scroll = new JScrollPane(jta1);

    public Ovning4ALambda(){

        jp1.setLayout(new FlowLayout());
        jp1.add(jl1);
        jp1.add(jtf1);
        jp1.add(jb1);
        jp1.add(jb2);
        jp1.add(jb3);
        jp1.add(jb4);
        jp2.add(scroll);
        jp.setLayout(new BorderLayout());
        jp.add(jp1,BorderLayout.NORTH);
        jp.add(jp2, BorderLayout.CENTER);
        add(jp);
        jtf1.addActionListener(r -> läsInFil(jtf1.getText()));
        jb1.addActionListener( e ->läsInFil(jtf1.getText()));
        jb2.addActionListener( e ->sparaFil(jtf1.getText()));
        jb3.addActionListener( e ->{ try {
        jta1.print();  // skriver ut texten, kan ge exception
    } catch (Exception ex) {
        ex.printStackTrace();
    }});
        jb4.addActionListener( r ->  System.exit(0));
       pack();
     //   setSize(600,600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Ovning4ALambda o = new Ovning4ALambda();
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