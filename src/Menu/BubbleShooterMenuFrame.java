package Menu;

import Code.Profile;

import javax.swing.*;
import java.awt.*;

/**
 * Created by DanteDC on 10/11/2015.
 */
public class BubbleShooterMenuFrame extends JFrame{
    public BubbleShooterMenuFrame(JFrame frame, Profile profile){
        super();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(new BubbleShooterMenuPanel(this, profile));
        setPreferredSize(new Dimension(400,350));
        setVisible(true);
        pack();

    }
}
