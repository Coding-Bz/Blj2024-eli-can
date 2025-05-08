import javax.swing.*;

public class TextInputExample {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Text Input Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a panel to hold the components
        JPanel panel = new JPanel();

        // Create a label
        JLabel label = new JLabel("Enter your text:");

        // Create a text field
        JTextField textField = new JTextField(20);

        // Create a button
        JButton button = new JButton("Submit");

        // Add an action listener to the button
        button.addActionListener(e -> {
            // Get the text from the text field
            String inputText = textField.getText();
            // Display the text in a dialog box
            JOptionPane.showMessageDialog(frame, "You entered: " + inputText);
            if (inputText.equals("Hallo")){

                JOptionPane.showMessageDialog(frame,"Cool");
            }
        });

        // Add components to the panel
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame visibility to true
        frame.setVisible(true);
    }
}
