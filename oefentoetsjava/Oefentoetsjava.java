package oefentoetsjava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oefentoetsjava extends JFrame {


    public static void main(String[] args) {
        JFrame frame = new Oefentoetsjava ();
        frame.setSize( 400,200 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        frame.setTitle("som");
        frame.setContentPane(new Panel());
        frame.setVisible(true);
    }
}
    
class Panel extends JPanel {
    private JTextField tekst1, tekst2, tekst3;
    private JButton knop1;

    
    public Panel() {
        setBackground(Color.WHITE);
        tekst1 = new JTextField(10);
        tekst2 = new JTextField(10);
        tekst3 = new JTextField(10);
        
        knop1 = new JButton("klik");
        knop1.addActionListener(new PlusHandler());
        
        
        add(tekst1);
        add(tekst2);
        add(knop1);
        add(tekst3);
    }
  class PlusHandler implements ActionListener {
    public void actionPerformed( ActionEvent e ){
        String invoerstring1 = tekst1.getText();
        int getal1 = Integer.parseInt( invoerstring1 );
        
        String invoerstring2 = tekst2.getText();
        int getal2 = Integer.parseInt( invoerstring2 );
        
        int resultaat = getal1 + getal2;
        
        tekst3.setText(""+resultaat);
    }
  }
}