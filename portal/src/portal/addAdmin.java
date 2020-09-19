/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portal;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Ghost
 */
public class addAdmin extends JFrame{
    private JPanel adminadd;
    private JFrame admin;
    addAdmin(){
        createview();
        admin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        admin.setResizable(false);
        admin.setMinimumSize(new Dimension(500, 400));
        admin.setVisible(true);
        admin.setLocationRelativeTo(null);
    }
    public void createview(){
        adminadd= new JPanel(new GridBagLayout());
        admin=new JFrame("Admin Add");
        admin.getContentPane().add(adminadd);
        JLabel firstn = new JLabel("First Name : ");
        JLabel secondn = new JLabel("Second Name : ");
        JLabel age = new JLabel("Age : ");
        JLabel gender = new JLabel("Gender : ");
        JLabel address = new JLabel("Address : ");
        JLabel email = new JLabel("Email : ");
        JLabel phoneNo = new JLabel("Phone Number : ");
        JLabel id = new JLabel("ID : ");
        JLabel pass = new JLabel("Password : ");
        JTextField firstnin = new JTextField(16);
        JTextField secondnin = new JTextField(16);
        JTextField agein = new JTextField(16);
        JTextField genderin = new JTextField(16);
        JTextField addressin = new JTextField(16);
        JTextField emailin = new JTextField(16);
        JTextField phoneNoin = new JTextField(16);
        JTextField idin = new JTextField(16);
        JTextField passin = new JTextField(16);
        JButton button = new JButton("Submit");
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(3, 3, 3, 3);
        c.anchor = new GridBagConstraints().LINE_END;
        adminadd.add(firstn, c);
        c.gridy++;
        adminadd.add(secondn, c);
        c.gridy++;
        adminadd.add(id, c);
        c.gridy++;
        adminadd.add(gender, c);
        c.gridy++;
        adminadd.add(age, c);
        c.gridy++;
        adminadd.add(pass, c);
        c.gridy++;
        adminadd.add(email, c);
        c.gridy++;
        adminadd.add(address, c);
        c.gridy++;
        adminadd.add(phoneNo, c);
        c.gridy++;
        adminadd.add(button, c);
        button.setBackground(java.awt.Color.cyan.darker());
        this.getRootPane().setDefaultButton(button);
        c.gridx = 1;
        c.gridy = 0;
        c.anchor = new GridBagConstraints().LINE_START;
        adminadd.add(firstnin, c);
        c.gridy++;
        adminadd.add(secondnin, c);
        c.gridy++;
        adminadd.add(idin, c);
        c.gridy++;
        adminadd.add(genderin, c);
        c.gridy++;
        adminadd.add(agein, c);
        c.gridy++;
        adminadd.add(passin, c);
        c.gridy++;
        adminadd.add(emailin, c);
        c.gridy++;
        adminadd.add(addressin, c);
        c.gridy++;
        adminadd.add(phoneNoin, c);
        c.gridy++;
        this.getRootPane().setDefaultButton(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<admin> AdminList = AFileClass.readAllData();
                admin a = new admin(idin.getText(), passin.getText(), firstnin.getText(), secondnin.getText(), agein.getText(), genderin.getText(), addressin.getText(), emailin.getText(), phoneNoin.getText());
                AdminList.add(a);
                AFileClass.addArrayListToFile(AdminList);
                idin.setText("");
                passin.setText("");
                firstnin.setText("");
                addressin.setText("");
                secondnin.setText("");
                agein.setText("");
                genderin.setText("");
                emailin.setText("");
                phoneNoin.setText("");
            }
        });
    }
}
