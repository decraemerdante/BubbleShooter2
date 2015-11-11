package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Code.Profile;
import Menu.BubbleShooterMenuFrame;
import Welcome.BubbleShooterWelcomeFrame;

/**
 * Created by DanteDC on 10/11/2015.
 */
public class BubbleShooterLoginPanel extends JPanel {
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JLabel back;


    public BubbleShooterLoginPanel(JFrame frame)
    {
        createComponents(frame);
        addComponents();

    }

    private void addComponents() {
       this.add(back);
        this.add(userLabel);
        this.add(userText);
        this.add(passwordLabel);
        this.add(passwordText);
        this.add(loginButton);

    }

    private void createComponents(JFrame frame) {

        this.setLayout(null);

        back = new JLabel();
        back.setIcon(new javax.swing.ImageIcon("src\\back.png"));
        back.setBounds(2, 2, 30, 25);
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

        userLabel = new JLabel("Login");
        userLabel.setBounds(10, 50, 80, 25);

        userText = new JTextField(20);
        userText.setBounds(100, 50, 160, 25);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 90, 80, 25);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 90, 160, 25);

        loginButton = new JButton("login");
        loginButton.setBounds(10, 120, 80, 25);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(userText.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Please enter a username/password");
                }
                else
                {

                    BubbleShooterMenuFrame bubbleShooterMenuFrame = new BubbleShooterMenuFrame(frame,new Profile(userText.getText()));
                    bubbleShooterMenuFrame.show();
                    frame.dispose();
                }



            }
        });


    }


}
