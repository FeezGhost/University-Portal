/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portal;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Ghost
 */
public class SLogInFrame extends JFrame {

    JPanel panel;
    JButton logbutton;
    JLabel username, pass, title;
    JTextField usernamein, passin;

    public SLogInFrame() {
        createview();
        this.setTitle("Student Login");
        this.setSize(new Dimension(400, 200));
        this.setResizable(false);                                
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void createview() {
        panel = new JPanel(new GridBagLayout());
        this.getContentPane().add(panel);
        panel.setBackground(java.awt.Color.CYAN.darker());
        title = new JLabel("Student Portal");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        logbutton = new JButton("Log in");
        logbutton.setBackground(java.awt.Color.blue.darker());
        logbutton.setForeground(java.awt.Color.WHITE);
        logbutton.setFocusPainted(false);
        logbutton.setFont(new Font("Tahoma", Font.BOLD, 12));
        username = new JLabel("UserName : ");
        pass = new JLabel("Password : ");
        usernamein = new JTextField(18);
        passin = new JTextField(18);
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = new GridBagConstraints().LINE_START;
        c.gridx = 1;
        c.gridy = 0;
        panel.add(title, c);
        c.gridy = 2;
        c.gridx = 0;
        c.anchor = new GridBagConstraints().LINE_END;
        panel.add(username, c);
        c.gridy++;
        panel.add(pass, c);
        c.gridy = 2;
        c.gridx = 1;
        c.anchor = new GridBagConstraints().LINE_START;
        panel.add(usernamein, c);
        c.gridy++;
        panel.add(passin, c);
        c.gridy++;
        c.anchor = new GridBagConstraints().LINE_END;
        panel.add(logbutton, c);
        this.getRootPane().setDefaultButton(logbutton);
        logbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                ArrayList<student> studentList = new ArrayList<student>();
//                studentList = SFileClass.readAllData();
//                ArrayList<student> CurrentStudentList=new ArrayList<student>();
                int flag = 0;
//                for (int i = 0; i < studentList.size(); i++) {
//                    if (studentList.get(i).getReg_no().equals(usernamein.getText()) && studentList.get(i).getPassword().equals(passin.getText())) {
//                        flag = 1;
//                        student current=(student) studentList.get(i);
//                    CurrentStudentList.add(current);
//                    }
//                }
                usernamein.setText("");
                passin.setText("");
                if (flag == 0) {
                    JOptionPane.showMessageDialog(null, "Invalid Username/Password", "status", HEIGHT);
                } else {
                    
                }
            }

        });

    }

  
}
