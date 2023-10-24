package MyDemo;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends Jframe {

    JPanel jp = new JPanel();
    JLabel jl1 = new JLabel("Hello!");
    JButton jb1 = new JButton("Ok");
    JLabel jl2 = new JLabel("Ditt sdfsd sdf namn");
    JButton jb2 = new JButton("No");
    JLabel jl3 = new JLabel("Ditt sdfsd sdf namn");
    JButton jb3 = new JButton("No");

    public FlowLayoutDemo() {
//jp.setLayout(new FlowLayout());
//jp.setLayout(new GridLayout(3,3));
        jp.setLayout(new BorderLayout());
        this.add(jp);
        jp.add(jl1);
        jp.add(jb1);
        jp.add(jl2);
        jp.add(jb2);
        jp.add(jl3);
        jp.add(jb3);

        //setSize(10,600);
        pack();
        setVisible(true);
        //setLocation(100,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args){FlowLayoutDemo jf = new FlowLayoutDemo();}
}
