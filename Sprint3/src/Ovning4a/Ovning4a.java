package Ovning4a;

import MyDemo.Jframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ovning4a extends Jframe {
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

    public Ovning4a(){
        EventHantering ee=new EventHantering(jtf1,jb1,jb2,jb3,jb4,jta1);

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
        jtf1.addActionListener(new EventHantering(jtf1,null,null,null,null,jta1));
        jb1.addActionListener(new EventHantering(jtf1,jb1,null,null,null,jta1));
        jb2.addActionListener(new EventHantering(jtf1,null,jb2,null,null,jta1));
        jb3.addActionListener(new EventHantering(null,null,null,jb3,null,jta1));
        jb4.addActionListener(new EventHantering(null,null,null,null,jb4,null));

       pack();
     //   setSize(600,600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Ovning4a o = new Ovning4a();
    }




}