package MyDemo.EventDemo2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class OurActionListener implements ActionListener {
    JButton jb1 = new JButton();
    JButton jb2 = new JButton();
    JLabel jl = new JLabel();
    public OurActionListener(JLabel jl,JButton jb1,JButton jb2){
        this.jl = jl;
        this.jb1=jb1;
        this.jb2=jb2;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb1)
            jl.setText("knapp 1");
        else if (e.getSource()==jb2)
            jl.setText("knapp 2");
    }
}