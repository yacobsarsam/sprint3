package Ovning1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ovning1 extends JFrame implements ActionListener {
    JPanel jp = new JPanel();
    JButton jb = new JButton("Byt bild");
    JLabel jl = new JLabel();
public Ovning1(){
    jl.setIcon(new ImageIcon("Sprint3/Bild1.jpg"));
    jp.add(jl);
    jp.add(jb);
    add(jp);
    //validate();
    jb.addActionListener(this);
    pack();
    setVisible(true);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

}
    @Override
    public void actionPerformed(ActionEvent e) {
        jl.setIcon(new ImageIcon("Sprint3/Bild2.jpg"));
    }
    public static void main(String[] args) {
        Ovning1 o = new Ovning1();
    }


}
