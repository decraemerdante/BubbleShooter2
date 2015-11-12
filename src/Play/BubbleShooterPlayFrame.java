package Play;

import javax.swing.*;
import java.awt.*;

/**
 * Created by DanteDC on 10/11/2015.
 */
public class BubbleShooterPlayFrame extends JFrame{

    public BubbleShooterPlayFrame()
    {
     super();
     setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     setVisible(true);
     setContentPane(new BubbleShooterPlayPanel(this));
     Dimension dimension = new Dimension(400,300);
     setPreferredSize(dimension);
     pack();
    }




}
