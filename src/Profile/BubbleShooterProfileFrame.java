package Profile;



import javax.swing.*;
import java.awt.*;

/**
 * Created by DanteDC on 11/11/2015.
 */
public class BubbleShooterProfileFrame extends JFrame{
    public BubbleShooterProfileFrame() {
        super();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(new BubbleShooterProfilePanel(this));
        setPreferredSize(new Dimension(300, 250));
        setVisible(true);
        pack();
    }
}
