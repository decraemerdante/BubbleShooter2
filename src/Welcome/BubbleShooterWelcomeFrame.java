package Welcome;

import javax.swing.*;
import java.awt.*;

/**
 * Created by DanteDC on 10/11/2015.
 */
public class BubbleShooterWelcomeFrame extends JFrame{

    public BubbleShooterWelcomeFrame()
    {
     super();
     setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     setVisible(true);
     setContentPane(new BubbleShooterWelcomePanel(this));
     Dimension dimension = new Dimension(300,300);
     setPreferredSize(dimension);
     pack();
    }




}
