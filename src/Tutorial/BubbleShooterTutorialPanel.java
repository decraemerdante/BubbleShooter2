package Tutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import Code.Profile;
import Menu.BubbleShooterMenuFrame;


/**
 * Created by DanteDC on 11/11/2015.
 */
public class BubbleShooterTutorialPanel extends JPanel {
    private JButton button;
    private JLabel tutorialtext;
    private JLabel title;
    private Profile profile;
    public BubbleShooterTutorialPanel(BubbleShooterTutorialFrame bubbleShooterTutorialFrame, Profile currentProfile)
    {
        createComponents(bubbleShooterTutorialFrame);
        addComponents();
        profile = currentProfile;
    }
    private void addComponents()
    {
        this.add(button);
        this.add(tutorialtext);
        this.add(title);
    }
    private void createComponents(JFrame frame)
    {
        this.setLayout(null);
        title = new JLabel();
        title.setText("How To Play?");
        title.setFont(new Font("Serif", Font.BOLD, 40));
        title.setBounds(10, 30, 250,40);

        tutorialtext = new JLabel();
        tutorialtext.setBounds(10,70,150,150);
        tutorialtext.setText("<html>Use the arrow keys on your keyboard to shoot the bubbles.<br> Shoot the bubble with the same color. The more bubbles fall, the more points you get.</html");

        button = new JButton();
        button.setText("I get it");
        button.setBounds(10,220,80,25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BubbleShooterMenuFrame bubbleShooterMenuFrame = new BubbleShooterMenuFrame(frame,profile);
                bubbleShooterMenuFrame.show();
                frame.dispose();
            }
        });
    }
}


