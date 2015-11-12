package Tutorial;



import Code.Profile;

import javax.swing.*;
import java.awt.*;

/**
 * Created by DanteDC on 11/11/2015.
 */
public class BubbleShooterTutorialFrame extends JFrame{
    public BubbleShooterTutorialFrame() {
        super();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(new BubbleShooterTutorialPanel(this));
        setPreferredSize(new Dimension(300,300));
        setVisible(true);
        pack();
    }
}
