package Tutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import Menu.BubbleShooterMenuFrame;


/**
 * Created by DanteDC on 11/11/2015.
 */
public class BubbleShooterTutorialPanel extends Container {
    private JButton button;
    private JLabel tutorialtext;
    private JLabel title;
    public BubbleShooterTutorialPanel(BubbleShooterTutorialFrame bubbleShooterTutorialFrame)
    {
        createComponents(bubbleShooterTutorialFrame);
        addComponents();
    }
    private void addComponents()
    {
        this.add(button);
        this.add(tutorialtext);
        this.add(title);
    }
    private void createComponents(JFrame frame)
    {
       title = new JLabel();
         String titleText = "<html><b>How to play</b></html>";
        title.setText(titleText);
        title.setBounds(10,10,100,10);
        this.setLayout(null);
        tutorialtext = new JLabel();
        tutorialtext.setBounds(10,10,1000,300);
        tutorialtext.setText("Use the arrow keys on your keyboard to shoot the bubbles. \t Shoot the bubble with the same color. The more bubbles fall, the more points you get");

        button = new JButton();
        button.setText("I get it");
        button.setBounds(10,320,80,25);
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                BubbleShooterMenuFrame bubbleShooterMenuFrame = new BubbleShooterMenuFrame();
                frame.dispose();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}


