package bank.management.system;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField panTextField, aadharTextField;
    JComboBox religionField, categoryField, incomeField, educationField, occupationField;
    JRadioButton seniorYes, seniorNo, existingYes, existingNo;
    JButton next;
    String formNo;

    private void addTextField(JTextComponent textFieldName, int y) {
        textFieldName.setFont(new Font("raleway", Font.BOLD, 14));
        textFieldName.setBounds(300, y, 400, 30);
        add(textFieldName);
    }

    SignupTwo(String formNo) {
        this.formNo = formNo;

        setLayout(null);

        setTitle("NEW ACCOUNT APLLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 300, 30);
        add(additionalDetails);

        // Religion Field
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 200, 30);
        add(religion);

        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian"};
        religionField = new JComboBox(valReligion);
        religionField.setBounds(300, 140, 400, 30);
        religionField.setBackground(Color.WHITE);
        add(religionField);


        // Category Field
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);

        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        categoryField = new JComboBox(valCategory);
        categoryField.setBounds(300, 190, 400, 30);
        categoryField.setBackground(Color.WHITE);
        add(categoryField);


        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);

        String valIncome[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        incomeField = new JComboBox(valIncome);
        incomeField.setBounds(300, 240, 400, 30);
        incomeField.setBackground(Color.WHITE);
        add(incomeField);


        JLabel educational = new JLabel("Educational:");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 200, 30);
        add(educational);
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);

        String valEducation[] = {"Non-Graduate", "Graduate", "Post Graduation", "Doctrate", "Others"};
        educationField = new JComboBox(valEducation);
        educationField.setBounds(300, 315, 400, 30);
        educationField.setBackground(Color.WHITE);
        add(educationField);

        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);

        String valOccupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        occupationField = new JComboBox(valOccupation);
        occupationField.setBounds(300, 390, 400, 30);
        occupationField.setBackground(Color.WHITE);
        add(occupationField);


        JLabel panNo = new JLabel("PAN Number:");
        panNo.setFont(new Font("Raleway", Font.BOLD, 20));
        panNo.setBounds(100, 440, 200, 30);
        add(panNo);
        panTextField = new JTextField();
        addTextField(panTextField ,440);

        JLabel aadharNo = new JLabel("Aadhar Number:");
        aadharNo.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharNo.setBounds(100, 490, 200, 30);
        add(aadharNo);
        aadharTextField = new JTextField();
        addTextField(aadharTextField ,490);

        JLabel seniorCitizen = new JLabel("Senior Citizen:");
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizen.setBounds(100, 540, 200, 30);
        add(seniorCitizen);

        seniorYes = new JRadioButton("Yes");
        seniorYes.setBounds(300, 540, 100, 30);
        seniorYes.setBackground(Color.WHITE);
        add(seniorYes);
        seniorNo = new JRadioButton("No");
        seniorNo.setBounds(450, 540, 100, 30);
        seniorNo.setBackground(Color.WHITE);
        add(seniorNo);
        ButtonGroup seniorCitizenGroup = new ButtonGroup();
        seniorCitizenGroup.add(seniorYes);
        seniorCitizenGroup.add(seniorNo);

        JLabel existingAccount = new JLabel("Existing Account:");
        existingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAccount.setBounds(100, 590, 200, 30);
        add(existingAccount);

        existingYes = new JRadioButton("Yes");
        existingYes.setBounds(300, 590, 100, 30);
        existingYes.setBackground(Color.WHITE);
        add(existingYes);
        existingNo = new JRadioButton("No");
        existingNo.setBounds(450, 590, 100, 30);
        existingNo.setBackground(Color.WHITE);
        add(existingNo);
        ButtonGroup existingStatusGroup = new ButtonGroup();
        existingStatusGroup.add(existingYes);
        existingStatusGroup.add(existingNo);

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
        String religion = (String) religionField.getSelectedItem();
        String category = (String) categoryField.getSelectedItem();
        String income = (String) incomeField.getSelectedItem();
        String education = (String) educationField.getSelectedItem();
        String occupation = (String) occupationField.getSelectedItem();

        String seniorCitizenVal = null;
        if (seniorYes.isSelected()) {
            seniorCitizenVal = "Yes";
        } else if (seniorNo.isSelected()) {
            seniorCitizenVal = "No";
        }


        String existingAccountVal = null;
        if (existingYes.isSelected()) {
            existingAccountVal = "Yes";
        } else if (existingNo.isSelected()) {
            existingAccountVal = "No";
        }

        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();

        try {
            Conn c = new Conn();
            String query = "insert into signuptwo values ('"+formNo+"', '"+religion+"', '"+category+"', '"+income+"', '"+education+"', '"+occupation+"', '"+pan+"', '"+aadhar+"',  '"+seniorCitizenVal+"', '"+existingAccountVal+"')";
            c.s.executeUpdate(query);

            // Signup 3
            setVisible(false);
            new SignupThree(formNo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new SignupTwo("");
    }
}
