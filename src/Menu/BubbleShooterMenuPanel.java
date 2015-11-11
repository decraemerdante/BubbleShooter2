package Menu;



import GameGui.BubbleShooterGameFrame;
import Code.BubbleShooter;
import HighScore.BubbleShooterScoreFrame;
import Profile.BubbleShooterProfileFrame;
import Tutorial.BubbleShooterTutorialFrame;
import Choice.BubbleShooterChoiceFrame;
import Welcome.BubbleShooterWelcomeFrame;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by DanteDC on 11/11/2015.
 */
public class BubbleShooterMenuPanel extends JPanel{
    private JLabel title;
    private JButton play;
    private JButton highScore;
    private JButton profile;
    private JButton tutorial;
    private JLabel back;


    public BubbleShooterMenuPanel(JFrame frame)
    {
        createComponents(frame);
        addComponents();
    }

    private void addComponents() {

        add(back);
        add(title);
        add(play);
        add(highScore);
        add(profile);
        add(tutorial);


    }

    private void createComponents(JFrame frame) {
        setLayout(null);

        back = new JLabel();
        back.setIcon(new javax.swing.ImageIcon("src\\back.png"));
        back.setBounds(0,0,30,25);
        back.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                BubbleShooterWelcomeFrame bubbleShooterWelcomeFrame = new BubbleShooterWelcomeFrame();
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
        title = new JLabel("Bubbleblaster");
        title.setFont(new Font("Serif", Font.BOLD, 40));
        title.setBounds(80, 30, 250,40);

        play = new JButton("Play");
        play.setBounds(100,80,200,25);
        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BubbleShooterChoiceFrame bubbleShooterChoiceFrame = new BubbleShooterChoiceFrame();
                bubbleShooterChoiceFrame.show();
                frame.dispose();


            }
        });

        highScore = new JButton("High Score");
        highScore.setBounds(100, 120, 200, 25);
        highScore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BubbleShooterScoreFrame bubbleShooterScoreFrame = new BubbleShooterScoreFrame();
                bubbleShooterScoreFrame.show();
                frame.dispose();
            }
        });

        profile = new JButton("Profile");
        profile.setBounds(100, 160, 200, 25);
        profile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BubbleShooterProfileFrame bubbleShooterProfileFrame = new BubbleShooterProfileFrame();
                bubbleShooterProfileFrame.show();
                frame.dispose();
            }
        });

        tutorial = new JButton("How to play");
        tutorial.setBounds(100, 200 ,200 ,25);
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
