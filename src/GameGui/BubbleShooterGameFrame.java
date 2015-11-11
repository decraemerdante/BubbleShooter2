package GameGui;
import Code.BubbleShooter;


import javax.swing.*;
import java.awt.*;

/**
 * Created by DanteDC on 11/11/2015.
 */
public class BubbleShooterGameFrame extends JFrame {
    public BubbleShooterGameFrame(BubbleShooter bubbleShooter) {
        super();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(new BubbleShooterGamePanel(this, bubbleShooter));
        setPreferredSize(new Dimension(300, 250));
        setVisible(true);
        pack();


    }
}
