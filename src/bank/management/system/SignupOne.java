package bank.management.system;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener {

    long random;

    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
    JDateChooser dobField;
    JRadioButton male, female, married, unmarried, other;
    JButton next;
    JLabel formNo;

    private void addTextField(JTextComponent textFieldName, int y) {
        textFieldName.setFont(new Font("raleway", Font.BOLD, 14));
        textFieldName.setBounds(300, y, 400, 30);
        add(textFieldName);
    }

    SignupOne() {

        setLayout(null);

        Random ran = new Random();
        random = Math.abs(ran.nextLong() % 9000L + 1000L);

        formNo = new JLabel("APPLICATION FORM NO. " + random);
        formNo.setFont(new Font("Raleway", Font.BOLD, 38));
        formNo.setBounds(140, 20, 600, 40);
        add(formNo);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 300, 30);
        add(personalDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 200, 30);
        add(name);
        nameTextField = new JTextField();
        addTextField(nameTextField ,140);

        JLabel fName = new JLabel("Father's Name:");
        fName.setFont(new Font("Raleway", Font.BOLD, 20));
        fName.setBounds(100, 190, 200, 30);
        add(fName);
        fnameTextField = new JTextField();
        addTextField(fnameTextField ,190);

        JLabel dob = new JLabel("Date of birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        dobField = new JDateChooser();
        dobField.setBounds(300, 240, 400, 30);
        dobField.setForeground(new Color(105,105,105));
        add(dobField);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 120, 30);
        male.setBackground(Color.WHITE);
        add(male);
        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel email = new JLabel("Email address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);
        emailTextField = new JTextField();
        addTextField(emailTextField ,340);

        JLabel maritalStatus = new JLabel("Marital Status:");
        maritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        maritalStatus.setBounds(100, 390, 200, 30);
        add(maritalStatus);
        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);
        ButtonGroup maritalStatusGroup = new ButtonGroup();
        maritalStatusGroup.add(married);
        maritalStatusGroup.add(unmarried);
        maritalStatusGroup.add(other);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        addressTextField = new JTextField();
        addTextField(addressTextField ,440);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        cityTextField = new JTextField();
        addTextField(cityTextField ,490);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        stateTextField = new JTextField();
        addTextField(stateTextField ,540);

        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        pincodeTextField = new JTextField();
        addTextField(pincodeTextField ,590);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String formNo = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dobField.getDateEditor().getUiComponent()).getText();

        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }

        String email = emailTextField.getText();

        String marital = null;
        if (unmarried.isSelected()) {
          marital = "Unmarried";
        } else if (married.isSelected()) {
            marital = "Married";
        } else if (other.isSelected()) {
            marital = "Other";
        }

        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();

        try {
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name is required");
            } else {
                Conn c = new Conn();
                String query = "insert into signupone values ('"+formNo+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"',  '"+city+"', '"+pincode+"', '"+state+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupTwo(formNo).setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new SignupOne();
    }
}
