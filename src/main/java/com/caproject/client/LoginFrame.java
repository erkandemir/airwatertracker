package com.caproject.client;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LoginFrame extends JFrame {
    private static final long serialVersionUID = 1L;
	private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel statusLabel;
    private IloginButonEventListener eventListener;

    public LoginFrame() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);

        constraints.gridx = 0;
        constraints.gridy = 0;
        JLabel usernameLabel = new JLabel("Username:");
        panel.add(usernameLabel, constraints);

        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1.0;
        usernameField = new JTextField(20);
        panel.add(usernameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel, constraints);

        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1.0;
        passwordField = new JPasswordField(20);
        panel.add(passwordField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        statusLabel = new JLabel();
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(statusLabel, constraints);

        constraints.gridy = 3;
        constraints.gridwidth = 1;
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                System.out.println(password.toString());
                // validate the username and password here
                if (AirWaterTrackerClient.Login(username, String.valueOf(password)).equals("success")) {
                    System.out.println("Login Success");
                    eventListener.isLoginSuccess(true);
                    dispose();
                } else {
                	System.out.println("Login Failed");
                	eventListener.isLoginSuccess(false);
                    // if the credentials are invalid, display an error message and clear the password field
                    statusLabel.setText("Invalid username or password.");
                    passwordField.setText("");
                    usernameField.setText("");
                }
            }
        });
        panel.add(loginButton, constraints);
        getContentPane().add(panel);
        pack();
        setResizable(false);
    }

    public void showDialog() {
        statusLabel.setText("");
        usernameField.setText("");
        passwordField.setText("");
        setVisible(false);
    }
    
    public void setEventListener(IloginButonEventListener listener)
    {
    	eventListener = listener;
    }
    
   
}
