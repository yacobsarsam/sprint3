package Ovning7;

import MyDemo.Jframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ovning7 extends Jframe {
    JButton jb1 = new JButton("Send");
    JButton jb2 = new JButton("Clear");
       JPanel jp = new JPanel();
public Ovning7 (){
    jp.add(jb1);
    jp.add(jb2);


    add(jp);

    jb1.addMouseListener(musLyss);
    pack();
    setVisible(true);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

}
MouseListener musLyss = new MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e) {
        jb1.setBackground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        jb1.setBackground(null);
    }
};
    /*@Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jb1.setBackground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        jb1.setBackground(null);
    }
*/
    public static void main(String[] args) {
        Ovning7 o = new Ovning7();
    }
}
