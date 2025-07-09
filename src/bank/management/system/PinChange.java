package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {

    JPasswordField newPin, reNewPin;
    JButton change, back;
    String pinNumber;

    PinChange(String pinNumber) {
        this.pinNumber = pinNumber;

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(250, 280, 500, 35);
        image.add(text);

        JLabel newPinLabel = new JLabel("New PIN: ");
        newPinLabel.setForeground(Color.WHITE);
        newPinLabel.setFont(new Font("System", Font.BOLD, 16));
        newPinLabel.setBounds(165, 320, 180, 25);
        image.add(newPinLabel);

        newPin = new JPasswordField();
        newPin.setFont(new Font("Raleway", Font.BOLD, 25));
        newPin.setBounds(330, 320, 180, 25);
        image.add(newPin);

        JLabel reNewPinLabel = new JLabel("Re-Enter PIN: ");
        reNewPinLabel.setForeground(Color.WHITE);
        reNewPinLabel.setFont(new Font("System", Font.BOLD, 16));
        reNewPinLabel.setBounds(165, 360, 180, 25);
        image.add(reNewPinLabel);

        reNewPin = new JPasswordField();
        reNewPin.setFont(new Font("Raleway", Font.BOLD, 25));
        reNewPin.setBounds(330, 360, 180, 25);
        image.add(reNewPin);

        change = new JButton("CHANGE");
        change.setBounds(355, 485, 150, 30);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("BACK");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(900,900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == change) {
            try {
                String newPin = this.newPin.getText();
                String reNewPin = this.reNewPin.getText();

                if (!newPin.equals(reNewPin)) {
                    JOptionPane.showMessageDialog(null, "PIN Does not match");
                    return;
                }

                if (newPin.equals("")) {
                    JOptionPane.showMessageDialog(null, "PIN should not be empty");
                    return;
                }

                if (reNewPin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                    return;
                }

                Conn conn = new Conn();
                String query1 = "update bank set pin = '"+reNewPin+"' where pin = '"+pinNumber+"'";
                String query2 = "update login set pin = '"+reNewPin+"' where pin = '"+pinNumber+"'";
                String query3 = "update signupthree set pin = '"+reNewPin+"' where pin = '"+pinNumber+"'";

                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);

                JOptionPane.showMessageDialog(null, "PIN Changed successfully");
                setVisible(false);
                new Transactions(reNewPin).setVisible(true);

            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }

    }

    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }
}
