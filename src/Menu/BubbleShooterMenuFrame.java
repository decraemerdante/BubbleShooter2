package Menu;

import javax.swing.*;
import java.awt.*;

/**
 * Created by DanteDC on 10/11/2015.
 */
public class BubbleShooterMenuFrame extends JFrame{
    public BubbleShooterMenuFrame(){
        super();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(new BubbleShooterMenuPanel(this));
        setPreferredSize(new Dimension(400,350));
        setVisible(true);
        pack();

    }
}
