package Login;

import javax.swing.*;
import java.awt.*;

/**
 * Created by DanteDC on 10/11/2015.
 */
public class BubbleShooterLoginFrame extends JFrame{
    public BubbleShooterLoginFrame()
    {
        super();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(new BubbleShooterLoginPanel(this));
        Dimension dimension = new Dimension(300,200);
        setPreferredSize(dimension);
        setVisible(true);
        pack();
    }

}
