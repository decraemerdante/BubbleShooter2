package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Menu.BubbleShooterMenuFrame;

/**
 * Created by DanteDC on 10/11/2015.
 */
public class BubbleShooterLoginPanel extends JPanel {
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;


    public BubbleShooterLoginPanel(JFrame frame)
    {
        createComponents(frame);
        addComponents();

    }

    private void addComponents() {
        this.add(userLabel);
        this.add(userText);
        this.add(passwordLabel);
        this.add(passwordText);
        this.add(loginButton);

    }

    private void createComponents(JFrame frame) {

        this.setLayout(null);

        userLabel = new JLabel("Login");
        userLabel.setBounds(10, 10, 80, 25);

        userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 40, 80, 25);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 40, 160, 25);

        loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BubbleShooterMenuFrame bubbleShooterMenuFrame = new BubbleShooterMenuFrame();
                bubbleShooterMenuFrame.show();
                frame.dispose();


            }
        });


    }


}
