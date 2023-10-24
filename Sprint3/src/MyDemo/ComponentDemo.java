package MyDemo;

import javax.swing.*;
import java.awt.*;

public class ComponentDemo extends Jframe {

    JPanel jp = new JPanel();
    JLabel jl = new JLabel("Ditt namn");
    JButton jb = new JButton("Ok");
    public ComponentDemo() {

        jl.setText("Nytt namn");
        this.add(jp);
        jp.add(jl);
        jp.add(jb);
        jb.setBackground(Color.blue);
        jp.setBackground(Color.yellow);
        setSize(200,100);
        //pack();
        setVisible(true);
        //setLocation(100,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
jb.setText("No");
    }
    public static void main(String[] args){ComponentDemo jf = new ComponentDemo();}

}
