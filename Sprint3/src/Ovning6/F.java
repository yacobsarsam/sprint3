package Ovning6;

import MyDemo.Jframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class F extends Jframe {
    JButton jb1 = new JButton("Send");
    JButton jb2 = new JButton("Clear");
    JTextField jtf = new JTextField("Skriv här");
    JPanel jp = new JPanel();
    public F(){
        jp.add(jb1);
        jp.add(jb2);
        jp.add(jtf);

        add(jp);
        addWindowListener(fönsterLyss);
        jtf.addFocusListener(focusLyss);
        //jtf.addMouseListener(this);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    WindowAdapter fönsterLyss = new WindowAdapter() {
        @Override
        public void windowActivated(WindowEvent e) {
            jtf.requestFocus();
        }
    };

    FocusListener focusLyss = new FocusListener() {
        @Override
        public void focusGained(FocusEvent e) {
           System.out.println("sdfsfs");
            jtf.setBackground(Color.blue);}

        @Override
        public void focusLost(FocusEvent e) {
            jtf.setBackground(Color.white);

        }
    };
    public static void main(String[] args) {
        F f = new F();
    }

}
