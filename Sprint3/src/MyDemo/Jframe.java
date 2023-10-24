package MyDemo;

import javax.swing.*;

public class Jframe extends JFrame {
    public Jframe() {
        setSize(200,100);
        //pack();
        setVisible(true);
        //setLocation(100,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args){Jframe jf = new Jframe();}


}
