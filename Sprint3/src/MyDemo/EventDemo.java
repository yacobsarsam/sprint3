package MyDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo extends Jframe implements ActionListener {

    JPanel jp = new JPanel();
    JLabel jl = new JLabel("Ditt namn");
    JButton jb1 = new JButton("Ok");
    JButton jb2 = new JButton("annan knapp");
    public EventDemo() {

        this.add(jp);
        jp.add(jl);

        jp.add(jb2);
        jb1.addActionListener(this); jp.add(jb1);
jb2.addActionListener(this);
        //setSize(200,100);
        pack();
        setVisible(true);
        //setLocation(100,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb1)
            jl.setText("knapp 1");
        else if (e.getSource()==jb2)
            jl.setText("knapp 2");
    }
    public static void main(String[] args){EventDemo jf = new EventDemo();}

}
