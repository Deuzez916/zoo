package Own_Project;

import java.awt.*;
import javax.swing.*;

public class PanelExemple
{
    PanelExemple()
    {
        JFrame f = new JFrame("PanelExemple");
        JPanel panel = new JPanel();
        panel.setBounds(100,100,300,300);
        panel.setBackground(Color.gray);
        //Knapp 1
        JButton b1 = new JButton("Köp");
        b1.setBounds(50,100,80,30);
        b1.setBackground(Color.YELLOW);
        //Knapp 2
        JButton b2 = new JButton("Sälj");
        b2.setBounds(50,160,80,30);
        b2.setBackground(Color.green);
        //Knapp 3
        JButton b3 = new JButton("Köp 10");
        b3.setBounds(50,220,80,30);
        b3.setBackground(Color.BLUE);
        // Knapp 4
        JButton b4 = new JButton("Sälj 10");
        b4.setBounds(50,280,80,30);
        b4.setBackground(Color.RED);
        
        panel.add(b1); panel.add(b2); panel.add(b3); panel.add(b4);
        f.add(panel);
            f.setSize(400,400);
            f.setLayout(null);
            f.setVisible(true);
            
    }
    
    public static void main(String args[])
    {
        new PanelExemple();
    }  
}
