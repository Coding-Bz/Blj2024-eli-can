import javax.swing.*;
import java.awt.*;

public class RegisterGUI {
        public static void main(String[] args) {
                // Main Frame
                JFrame frame = new JFrame("Register/Login");
                frame.setSize(900, 500);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().setBackground(new Color(228, 221, 177));
                frame.setLayout(null);

                // Register Panel
                JPanel registerPanel = new JPanel();
                registerPanel.setLayout(new BoxLayout(registerPanel, BoxLayout.Y_AXIS));
                registerPanel.setBackground(new Color(209, 227, 187));
                registerPanel.setBounds(600, 80, 250, 300);
                registerPanel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

                // REGISTER Label
                JLabel registerLabel = new JLabel("REGISTER");
                registerLabel.setForeground(Color.WHITE);
                registerLabel.setFont(new Font("Arial", Font.BOLD, 24));
                registerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
                registerPanel.add(registerLabel);
                registerPanel.add(Box.createRigidArea(new Dimension(0, 20)));

                // Username Label
                JLabel userLabel = new JLabel("USERNAME");
                userLabel.setForeground(Color.WHITE);
                registerPanel.add(userLabel);

                // Username TextField
                JTextField usernameField = new JTextField();
                usernameField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
                usernameField.setBackground(new Color(139, 154, 110));
                usernameField.setForeground(Color.WHITE);
                registerPanel.add(usernameField);
                registerPanel.add(Box.createRigidArea(new Dimension(0, 10)));

                // Password Label
                JLabel passLabel = new JLabel("PASSWORD");
                passLabel.setForeground(Color.WHITE);
                registerPanel.add(passLabel);

                // Password Field
                JPasswordField passwordField = new JPasswordField();
                passwordField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
                passwordField.setBackground(new Color(139, 154, 110));
                passwordField.setForeground(Color.WHITE);
                registerPanel.add(passwordField);

                // Add register panel to frame
                frame.add(registerPanel);

                // Login Button
                JButton loginButton = new JButton("LOGIN");
                loginButton.setBounds(160, 200, 180, 50);
                loginButton.setBackground(new Color(139, 154, 110));
                loginButton.setForeground(Color.WHITE);
                loginButton.setFont(new Font("Arial", Font.BOLD, 18));
                loginButton.setFocusPainted(false);
                frame.add(loginButton);

                // Show GUI
                frame.setVisible(true);
        }
}
