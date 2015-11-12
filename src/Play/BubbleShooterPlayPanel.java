package Play;

import Login.BubbleShooterLoginFrame;

import Register.BubbleShooterRegisterFrame;
import Menu.BubbleShooterMenuFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by DanteDC on 10/11/2015.
 */
public class BubbleShooterPlayPanel extends JPanel {
    private JLabel play;
    private JButton guest;
    private JButton login;
    private JButton register;
    private JLabel back;


    public BubbleShooterPlayPanel(JFrame frame)
    {
        createComponents(frame);
        addComponents();


    }

    private void addComponents() {
        this.add(play);
        this.add(guest);
        this.add(login);
        this.add(register);
        this.add(back);
    }

    private void createComponents(JFrame frame) {
        setLayout(null);

        back = new JLabel();
        back.setIcon(new javax.swing.ImageIcon("src\\back.png"));
        back.setBounds(0,0,30,25);
        back.addMouseListener(new MouseListener() {
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
        play = new JLabel("Bubbleblaster");
        play.setFont(new Font("Serif", Font.BOLD, 40));
        play.setBounds(80, 30, 250,40);

        guest = new JButton("Play as guest");
        guest.setBounds(100,80,200,25);
        guest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



            }
        });

        login = new JButton("Login");
        login.setBounds(100, 120, 200, 25);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BubbleShooterLoginFrame bubbleShooterScoreFrame = new BubbleShooterLoginFrame();
                bubbleShooterScoreFrame.show();
                frame.dispose();
            }
        });

        register = new JButton("Register");
        register.setBounds(100, 160, 200, 25);
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BubbleShooterRegisterFrame bubbleShooterregisterFrame = new BubbleShooterRegisterFrame();
                frame.dispose();
            }
        });




    }




}
