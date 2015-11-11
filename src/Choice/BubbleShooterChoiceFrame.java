package Choice;



import javax.swing.*;
import java.awt.*;

/**
 * Created by DanteDC on 11/11/2015.
 */
public class BubbleShooterChoiceFrame extends JFrame{
   public BubbleShooterChoiceFrame() {
       super();
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setContentPane(new BubbleShooterChoicePanel(this));
       setPreferredSize(new Dimension(300, 250));
       setVisible(true);
       pack();
   }
}
