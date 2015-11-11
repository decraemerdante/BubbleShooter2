package Tutorial;



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
        setPreferredSize(new Dimension(1000,500));
        setVisible(true);
        pack();
    }
}
