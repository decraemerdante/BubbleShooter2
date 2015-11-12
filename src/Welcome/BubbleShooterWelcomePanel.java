package Welcome;

import Login.BubbleShooterLoginFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by DanteDC on 10/11/2015.
 */
public class BubbleShooterWelcomePanel extends JPanel {
    private JLabel welcome;
    private JButton login;
    private JLabel space;
    private JButton register;
    private BoxLayout boxLayout;
    Dimension dimensionButtons = new Dimension(70,30);

    public BubbleShooterWelcomePanel(JFrame frame)
    {
        createComponents(frame);
        addComponents();
        boxLayout = new BoxLayout(this,BoxLayout.Y_AXIS);
        setLayout(boxLayout);

    }

    private void addComponents() {
        this.add(welcome);
        this.add(Box.createRigidArea(new Dimension(0,40)));
        this.add(login);
        this.add(Box.createRigidArea(new Dimension(0,10)));
        this.add(register);
    }

    private void createComponents(JFrame frame) {
        welcome = new JLabel("Welcome");
        welcome.setAlignmentX(Component.CENTER_ALIGNMENT);
        welcome.setFont(new Font("Serif", Font.BOLD, 40));

        login = new JButton("Login");
        login.setAlignmentX(Component.CENTER_ALIGNMENT);
        login.setPreferredSize(dimensionButtons);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BubbleShooterLoginFrame bubbleShooterLoginFrame = new BubbleShooterLoginFrame();
                bubbleShooterLoginFrame.show();
                frame.dispose();

            }
        });

        register = new JButton("Register");
        register.setAlignmentX(Component.CENTER_ALIGNMENT);
        register.setPreferredSize(dimensionButtons);

    }




}
