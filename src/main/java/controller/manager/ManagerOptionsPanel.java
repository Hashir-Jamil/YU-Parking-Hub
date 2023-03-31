package controller.manager;

import controller.auth.LoginView;
import model.user.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerOptionsPanel extends JFrame {
    private JButton validateAccount;
    private JButton handleParking;
    private JButton backButton;

    public ManagerOptionsPanel(User user) {

        this.setSize(500,500);

        validateAccount = new JButton("Validate Accounts");
        validateAccount.setFont(new Font("Arial", Font.PLAIN, 16));
        validateAccount.setForeground(Color.BLACK);
        validateAccount.setBackground(Color.LIGHT_GRAY);
        validateAccount.setFocusPainted(false);
        validateAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                new AccountValidationPanel(user);
            }
        });
        validateAccount.setPreferredSize(new Dimension(200, 40));

        handleParking = new JButton("Handle Parkings");
        handleParking.setFont(new Font("Arial", Font.PLAIN, 16));
        handleParking.setForeground(Color.BLACK);
        handleParking.setBackground(Color.LIGHT_GRAY);
        handleParking.setFocusPainted(false);
        handleParking.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                new ManagerGUI(user).setVisible(true);
            }
        });
        handleParking.setPreferredSize(new Dimension(200, 40));


        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial", Font.PLAIN, 16));
        backButton.setForeground(Color.BLACK);
        backButton.setBackground(Color.LIGHT_GRAY);
        backButton.setFocusPainted(false);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                logout();
            }

        });
        backButton.setPreferredSize(new Dimension(200, 40));

        JPanel mainPanel = new JPanel();

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(validateAccount);
        mainPanel.add(handleParking);
        mainPanel.add(backButton);

        add(mainPanel);
    }

    private void logout(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
                setVisible(false);

            }
        });
    }

}


