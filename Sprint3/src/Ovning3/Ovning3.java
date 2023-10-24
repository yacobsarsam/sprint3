package Ovning3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarEntry;

public class Ovning3 extends JFrame implements ActionListener {
    JCheckBox cb = new JCheckBox("asdasd");
    JCheckBox cb1 = new JCheckBox("ddsd");
    JPanel jp= new JPanel();

    public Ovning3 (){
        jp.add(cb);
        jp.add(cb1);
        add(jp);
        cb1.setSelected(true);

        cb.addActionListener(this);
        cb1.addActionListener(this);
        setSize(200,200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        //
        if(e.getSource()==cb1)
            cb1.setBackground(Color.RED);
        if(cb.isSelected())
            System.out.println("is selected");
    }

    public static void main(String[] args) {
        Ovning3 o = new Ovning3();
    }
}
