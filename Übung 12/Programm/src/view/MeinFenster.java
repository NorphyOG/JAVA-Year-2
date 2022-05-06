package view;

import javax.swing.*;
import java.awt.*;

public class MeinFenster extends JFrame {

    private JButton ok;
    private JButton ok1;
    private JButton ende;
    private JButton eins;
    private JButton zwei;
    private JButton drei;
    private JButton vier;


    public MeinFenster (String titel) {
        super(titel);
        Container cp = getContentPane();
        cp.setBackground(Color.lightGray);
        JPanel pok = new JPanel();
        pok.setBackground(Color.ORANGE);
        // cp.setLayout(null);
        // cp.setLayout(new FlowLayout(FlowLayout.CENTER));
        // cp.setLayout(new GridLayout(3,0,2,2));
        cp.setLayout(new BorderLayout());
        ok = new JButton("OK");
        ok.setForeground(Color.blue);
        ok.setBackground(Color.white);
        ok1 = new JButton("OK");
        ende = new JButton("ENDE");
        eins = new JButton("EINS");
        zwei = new JButton("ZWEI");
        JPanel pdrei = new JPanel();
        pdrei.setBackground(Color.red);
        pdrei.setLayout(new GridLayout(8, 8, 2, 2));
        drei = new JButton("DREI");
        vier = new JButton("VIER");
        ok.setBounds(20,20,80,40);
        pok.add(ok);
        pok.add(ok1);
        cp.add(pok, BorderLayout.NORTH);
        cp.add(ende, BorderLayout.SOUTH);
        cp.add(eins, BorderLayout.WEST);
        cp.add(zwei, BorderLayout.EAST);
        pdrei.add(drei);
        pdrei.add(vier);

        cp.add(pdrei, BorderLayout.CENTER);
        // cp.add(vier);
        setMinimumSize(new Dimension(200,300));
        setSize(400,600);
        setLocation(200,200);
        setVisible(true);
    }

}
