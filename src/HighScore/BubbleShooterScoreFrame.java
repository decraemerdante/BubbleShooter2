package HighScore;



import javax.swing.*;
import java.awt.*;

/**
 * Created by DanteDC on 11/11/2015.
 */
public class BubbleShooterScoreFrame extends JFrame {
    public BubbleShooterScoreFrame() {
        super();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(new BubbleShooterScorePanel(this));
        setPreferredSize(new Dimension(300, 250));
        setVisible(true);
        pack();
    }
}
