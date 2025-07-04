package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {
    JRadioButton savingsAccRB, fdAccRB, currAccRB, reccuringDepositAccRB;
    JCheckBox atmCardCB, internetBankingCB, mobileBankingCB, alertsCB, chequeBookCB, eStatementCB, declarationCB;
    JButton submit, cancel;
    String formNo;

    SignupThree(String formNo) {
        this.formNo = formNo;
        setLayout(null);

        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        JLabel accountType = new JLabel("Account Type");
        accountType.setFont(new Font("Raleway", Font.BOLD, 22));
        accountType.setBounds(100, 140, 200, 30);
        add(accountType);

        savingsAccRB = new JRadioButton("Savings Account");
        savingsAccRB.setFont(new Font("Raleway", Font.BOLD, 16));
        savingsAccRB.setBackground(Color.WHITE);
        savingsAccRB.setBounds(100, 180, 250, 20);
        add(savingsAccRB);

        fdAccRB = new JRadioButton("Fixed Deposit Account");
        fdAccRB.setFont(new Font("Raleway", Font.BOLD, 16));
        fdAccRB.setBackground(Color.WHITE);
        fdAccRB.setBounds(350, 180, 250, 20);
        add(fdAccRB);

        currAccRB = new JRadioButton("Current Account");
        currAccRB.setFont(new Font("Raleway", Font.BOLD, 16));
        currAccRB.setBackground(Color.WHITE);
        currAccRB.setBounds(100, 220, 250, 20);
        add(currAccRB);

        reccuringDepositAccRB = new JRadioButton("Recurring Deposit Account");
        reccuringDepositAccRB.setFont(new Font("Raleway", Font.BOLD, 16));
        reccuringDepositAccRB.setBackground(Color.WHITE);
        reccuringDepositAccRB.setBounds(350, 220, 250, 20);
        add(reccuringDepositAccRB);

        ButtonGroup accTypeRbGroup = new ButtonGroup();
        accTypeRbGroup.add(savingsAccRB);
        accTypeRbGroup.add(fdAccRB);
        accTypeRbGroup.add(currAccRB);
        accTypeRbGroup.add(reccuringDepositAccRB);

        JLabel cardNumLabel = new JLabel("Card Number:");
        cardNumLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        cardNumLabel.setBounds(100, 300, 200, 30);
        add(cardNumLabel);

        JLabel cardNum = new JLabel("XXXX-XXXX-XXXX-8523");
        cardNum.setFont(new Font("Raleway", Font.BOLD, 22));
        cardNum.setBounds(330, 300, 300, 30);
        add(cardNum);

        JLabel cardNumDescription = new JLabel("Your 16 digit card number");
        cardNumDescription.setFont(new Font("Raleway", Font.BOLD, 12));
        cardNumDescription.setBounds(100, 330, 300, 20);
        add(cardNumDescription);

        JLabel pinNumLabel = new JLabel("PIN:");
        pinNumLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        pinNumLabel.setBounds(100, 370, 200, 30);
        add(pinNumLabel);

        JLabel pinNumber = new JLabel("XXXX");
        pinNumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pinNumber.setBounds(330, 370, 300, 30);
        add(pinNumber);

        JLabel pinNumDescription = new JLabel("Your 4 digit PIN");
        pinNumDescription.setFont(new Font("Raleway", Font.BOLD, 12));
        pinNumDescription.setBounds(100, 400, 300, 20);
        add(pinNumDescription);

        JLabel servicesLabel = new JLabel("Services Required:");
        servicesLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        servicesLabel.setBounds(100, 450, 400, 25);
        add(servicesLabel);

        atmCardCB = new JCheckBox("ATM Card");
        atmCardCB.setBackground(Color.WHITE);
        atmCardCB.setFont(new Font("Raleway", Font.BOLD, 16));
        atmCardCB.setBounds(100, 500, 200, 30);
        add(atmCardCB);

        internetBankingCB = new JCheckBox("Internet Banking");
        internetBankingCB.setBackground(Color.WHITE);
        internetBankingCB.setFont(new Font("Raleway", Font.BOLD, 16));
        internetBankingCB.setBounds(350, 500, 200, 30);
        add(internetBankingCB);

        mobileBankingCB = new JCheckBox("Mobile Banking");
        mobileBankingCB.setBackground(Color.WHITE);
        mobileBankingCB.setFont(new Font("Raleway", Font.BOLD, 16));
        mobileBankingCB.setBounds(100, 550, 200, 30);
        add(mobileBankingCB);

        alertsCB = new JCheckBox("Email and SMS Alerts");
        alertsCB.setBackground(Color.WHITE);
        alertsCB.setFont(new Font("Raleway", Font.BOLD, 16));
        alertsCB.setBounds(350, 550, 200, 30);
        add(alertsCB);

        chequeBookCB = new JCheckBox("Cheque Book");
        chequeBookCB.setBackground(Color.WHITE);
        chequeBookCB.setFont(new Font("Raleway", Font.BOLD, 16));
        chequeBookCB.setBounds(100, 600, 200, 30);
        add(chequeBookCB);

        eStatementCB = new JCheckBox("E Statement");
        eStatementCB.setBackground(Color.WHITE);
        eStatementCB.setFont(new Font("Raleway", Font.BOLD, 16));
        eStatementCB.setBounds(350, 600, 200, 30);
        add(eStatementCB);

        declarationCB = new JCheckBox("I hereby declare that the above mentioned details are correct to the best of my knowledge.");
        declarationCB.setBackground(Color.WHITE);
        declarationCB.setFont(new Font("Raleway", Font.BOLD, 12));
        declarationCB.setBounds(100, 680, 600, 30);
        add(declarationCB);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String accountType = null;
            if (savingsAccRB.isSelected()) {
                accountType = "Savings Account";
            } else if (fdAccRB.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if (currAccRB.isSelected()) {
                accountType = "Current Account";
            } else if (reccuringDepositAccRB.isSelected()) {
                accountType = "Recurring Deposit Account";
            }

            Random rand = new Random();
            String cardNumber = "" + Math.abs((rand.nextLong() % 90000000L) + 5040936000000000L);
            String pinNumber = "" + Math.abs((rand.nextLong() % 9000L) + 1000L);

            String facility = "";
            if (atmCardCB.isSelected()) {
                facility = facility + "ATM Card ";
            } else if (internetBankingCB.isSelected()) {
                facility = facility + "Internet Banking ";
            } else if (mobileBankingCB.isSelected()) {
                facility = facility + "Mobile Banking ";
            } else if (alertsCB.isSelected()) {
                facility = facility + "Alerts";
            } else if (chequeBookCB.isSelected()) {
                facility = facility + "Cheque Book ";
            } else if (eStatementCB.isSelected()) {
                facility = facility + "E Statement ";
            }

            try {
                if (accountType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Account Type is required");
                } else {
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formNo+"', '"+accountType+"', '"+cardNumber+"', '"+pinNumber+"', '"+facility+"')";
                    String query2 = "insert into login values('"+formNo+"', '"+cardNumber+"', '"+pinNumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null, "Card Number: " + cardNumber + "\n Pin: " + pinNumber);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == cancel) {

        }
    }
    public static void main(String[] args) {
        new SignupThree("");
    }
}
