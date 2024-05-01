import javax.swing.*;
import java.awt.*;
import java.util.Random;
// import com.toedter.calender.JDateChooser;

public class SignUp extends JFrame {

    JTextField firstName;
    JTextField lastName;

    SignUp() {
        setLayout(null);

        // Generate random application form number
        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        // Set up the frame
        getContentPane().setBackground(Color.gray);
        setSize(850, 800);
        setLocationRelativeTo(null);  // Center the frame on the screen
        setTitle("Sign Up page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and add label for application form number
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        // formno.setForeground(Color.black); // Set foreground color to black
        formno.setBounds(100, 100, 650, 40);
        add(formno);

        JLabel personalDetails = new JLabel("Personal details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        // formno.setForeground(Color.black); // Set foreground color to black
        personalDetails.setBounds(290, 140, 400, 30);
        add(personalDetails);

        JLabel name = new JLabel("Name : ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        // formno.setForeground(Color.black); // Set foreground color to black
        name.setBounds(100, 180, 100, 30);
        add(name);

        JTextField nameField = new JTextField();
        nameField.setFont(new Font("Raleway", Font.BOLD, 20));
        nameField.setBounds(300, 180, 400, 30);
        add(nameField);



        JLabel fathersName = new JLabel("Father's Name : ");
        fathersName.setFont(new Font("Raleway", Font.BOLD, 20));
        // formno.setForeground(Color.black); // Set foreground color to black
        fathersName.setBounds(100, 220, 100, 30);
        add(fathersName);

        JTextField fathersNameField = new JTextField();
        fathersNameField.setFont(new Font("Raleway", Font.BOLD, 20));
        fathersNameField.setBounds(300, 220, 400, 30);
        add(fathersNameField);

        JLabel dateofbirth = new JLabel("Date of birth : ");
        dateofbirth.setFont(new Font("Raleway", Font.BOLD, 20));
        // formno.setForeground(Color.black); // Set foreground color to black
        dateofbirth.setBounds(100, 260, 100, 30);
        add(dateofbirth);

        // JDateChooser dateChooser = new JDateChooser();
        // dateChooser.setBounds(300, 260, 400, 30);

        JLabel gender = new JLabel("Gender : ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        // formno.setForeground(Color.black); // Set foreground color to black
        gender.setBounds(100, 300, 400, 30);
        add(gender);

        JLabel maritalStatus = new JLabel("Marital status : ");
        maritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        // formno.setForeground(Color.black); // Set foreground color to black
        maritalStatus.setBounds(100, 340, 400, 30);
        add(maritalStatus);

        JLabel email = new JLabel("Email : ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        // formno.setForeground(Color.black); // Set foreground color to black
        email.setBounds(100, 380, 100, 30);
        add(email);

        JTextField emailField = new JTextField();
        emailField.setFont(new Font("Raleway", Font.BOLD, 20));
        emailField.setBounds(300, 380, 400, 30);
        add(emailField);

        JLabel address = new JLabel("Address : ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        // formno.setForeground(Color.black); // Set foreground color to black
        address.setBounds(100, 420, 100, 30);
        add(address);

        JTextField addressField = new JTextField();
        addressField.setFont(new Font("Raleway", Font.BOLD, 20));
        addressField.setBounds(300, 420, 400, 30);
        add(addressField);

        JLabel city = new JLabel("City : ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        // formno.setForeground(Color.black); // Set foreground color to black
        city.setBounds(100, 460, 100, 30);
        add(city);

        JTextField cityField = new JTextField();
        cityField.setFont(new Font("Raleway", Font.BOLD, 20));
        cityField.setBounds(300, 460, 400, 30);
        add(cityField);


        JLabel pincode = new JLabel("Pincode : ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        // formno.setForeground(Color.black); // Set foreground color to black
        pincode.setBounds(100, 500, 100, 30);
        add(pincode);

        JTextField pincodeField = new JTextField();
        pincodeField.setFont(new Font("Raleway", Font.BOLD, 20));
        pincodeField.setBounds(300, 500, 400, 30);
        add(pincodeField);



        // Make the frame visible after adding components
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
