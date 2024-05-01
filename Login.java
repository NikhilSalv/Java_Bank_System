import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JButton clear, signUp, signIn;
    JTextField cardTextField;
    JPasswordField pinTextField;


    Login() {
        setSize(800, 480);
        setLocationRelativeTo(null);  // Center the frame on the screen
        setTitle("Automated Tailor Machine");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the frame is closed

        // Load and scale the image
        ImageIcon icon = new ImageIcon(getClass().getResource("/icons/logo.png"));
        Image scaledImage = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Create and configure components
        JLabel imageLabel = new JLabel(scaledIcon);
        JLabel textLabel = new JLabel("Welcome");
        textLabel.setFont(new Font("Arial", Font.BOLD, 20)); // Set font and size for the text

        // Set layout to null for absolute positioning of components
        setLayout(null);

        // Set bounds for the image label and text label
        imageLabel.setBounds(70, 10, 100, 100);
        textLabel.setBounds(200, 40, 100, 40);
        add(imageLabel);
        add(textLabel);

        JLabel textLabel2 = new JLabel("Card Number : ");
        textLabel2.setBounds(200, 40, 100, 150);
        add(textLabel2);

        JLabel textLabel3 = new JLabel("PIN : ");
        textLabel3.setBounds(200, 40, 100, 200);
        add(textLabel3);

        cardTextField = new JTextField();
        cardTextField.setBounds(500, 100, 200, 30);
        add(cardTextField);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(500, 140, 200, 30);
        add(pinTextField);

        signIn = new JButton("SIGN IN");
        signIn.setBounds(300, 300, 100, 30);
        signIn.addActionListener(this);
        add(signIn);

        clear = new JButton("CLEAR");
        clear.setBounds(400, 300, 100, 30);
        clear.addActionListener(this);
        add(clear);

        signUp = new JButton("SIGN UP");
        signUp.setBounds(350, 350, 100, 30);
        signUp.addActionListener(this);
        add(signUp);


        // Add components to the frame

        // Make the frame visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            pinTextField.setText("");;
            cardTextField.setText("");

        }

        else if(ae.getSource() == signIn) {

        }
        else if(ae.getSource() == signUp) {

        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
