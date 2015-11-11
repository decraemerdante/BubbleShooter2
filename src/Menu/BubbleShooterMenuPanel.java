package Menu;



import GameGui.BubbleShooterGameFrame;
import Code.BubbleShooter;
import HighScore.BubbleShooterScoreFrame;
import Profile.BubbleShooterProfileFrame;
import Tutorial.BubbleShooterTutorialFrame;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by DanteDC on 11/11/2015.
 */
public class BubbleShooterMenuPanel extends JPanel{
    private JLabel title;
    private JButton play;
    private JButton highScore;
    private JButton profile;
    private JButton tutorial;


    public BubbleShooterMenuPanel(JFrame frame)
    {
        createComponents(frame);
        addComponents();
    }

    private void addComponents() {
        add(title);
        add(play);
        add(highScore);
        add(profile);
        add(tutorial);

    }

    private void createComponents(JFrame frame) {
        title = new JLabel("Bubbleblaster");
        title.setFont(new Font("Serif", Font.BOLD, 40));

        play = new JButton("Play");
        play.setPreferredSize(new Dimension(200,25));
        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BubbleShooterGameFrame bubbleShooterGameFrame = new BubbleShooterGameFrame(new BubbleShooter());
                bubbleShooterGameFrame.show();
                frame.dispose();


            }
        });

        highScore = new JButton("High Score");
        highScore.setPreferredSize(new Dimension(200, 25));
        highScore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BubbleShooterScoreFrame bubbleShooterScoreFrame = new BubbleShooterScoreFrame();
                bubbleShooterScoreFrame.show();
                frame.dispose();
            }
        });

        profile = new JButton("Profile");
        profile.setPreferredSize(new Dimension(200, 25));
        profile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BubbleShooterProfileFrame bubbleShooterProfileFrame = new BubbleShooterProfileFrame();
                bubbleShooterProfileFrame.show();
                frame.dispose();
            }
        });

        tutorial = new JButton("How to play");
        tutorial.setPreferredSize(new Dimension(200, 25));
        tutorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BubbleShooterTutorialFrame bubbleShooterTutorialFrame = new BubbleShooterTutorialFrame();
                bubbleShooterTutorialFrame.show();
                frame.dispose();
            }
        });

    }

}
