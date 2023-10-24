package MyDemo;

import javax.swing.*;
import java.awt.*;

public class BoarderLayoutDemo extends Jframe {
    JPanel jp = new JPanel();
    JPanel jpSouth = new JPanel();
    JPanel jpWest = new JPanel();
    JPanel jpNorth = new JPanel();
    JLabel jl1 = new JLabel("Hello!");
    JButton jb1 = new JButton("Ok");
    JLabel jl2 = new JLabel("Ditt sdfsd sdf namn");
    JButton jb2 = new JButton("No");
    JLabel jl3 = new JLabel("Ditt sdfsd sdf namn");
    JButton jb3 = new JButton("No");

    public BoarderLayoutDemo() {
        jp.setLayout(new BorderLayout());
        this.add(jp);
        jp.add(jpSouth,BorderLayout.SOUTH);
        jp.add(jpWest,BorderLayout.WEST);
        jp.add(jpNorth,BorderLayout.NORTH);
        jpSouth.setLayout(new FlowLayout());
        jpWest.setLayout(new GridLayout(2,1));
        jpNorth.setLayout(new FlowLayout());
        jpSouth.add(jl1);
        jpSouth.add(jb1);
        jpWest.add(jl2);
        jpWest.add(jb2);
        jpNorth.add(jl3);
        jpNorth.add(jb3);

        //setSize(10,600);
        pack();
        setVisible(true);
        //setLocation(100,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args){BoarderLayoutDemo jf = new BoarderLayoutDemo();}

}
