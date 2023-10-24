package MyDemo.EventDemo2;

import MyDemo.Jframe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo extends Jframe {

    JPanel jp = new JPanel();
    JLabel jl = new JLabel("Ditt namn");
    JButton jb1 = new JButton("Ok");
    JButton jb2 = new JButton("annan knapp");
    public EventDemo() {

        this.add(jp);
        jp.add(jl);
        jp.add(jb1);
        jp.add(jb2);
        jb1.addActionListener(new OurActionListener(jl,jb1,jb2));
        jb2.addActionListener(new OurActionListener(jl,jb1,jb2));
        //setSize(200,100);
        pack();
        setVisible(true);
        //setLocation(100,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        }


    public static void main(String[] args){EventDemo jf = new EventDemo();}

}
