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
public class TLogInFrame extends JFrame {

    JPanel panel;
    JButton logbutton;
    JLabel username, pass, title;
    JTextField usernamein, passin;

    public TLogInFrame() {
        createview();
        this.setTitle("Teacher Login");
        this.setSize(new Dimension(400, 200));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void createview() {
        panel = new JPanel(new GridBagLayout());
        this.getContentPane().add(panel);
        panel.setBackground(java.awt.Color.CYAN.darker());
        title = new JLabel("Teacher Portal");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        logbutton = new JButton("Log in");
        logbutton.setBackground(java.awt.Color.blue.darker());
        logbutton.setForeground(java.awt.Color.WHITE);
        logbutton.setFocusPainted(false);
        logbutton.setFont(new Font("Tahoma", Font.BOLD, 12));
        username = new JLabel("ID : ");
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
                ArrayList<teacher> teacherList = new ArrayList<teacher>(0);
                teacherList = TFileClass.readAllData();
                int flag = 0;
                for (int i = 0; i < teacherList.size(); i++) {
                    if (teacherList.get(i).getId().equals(usernamein.getText()) && teacherList.get(i).getPassword().equals(passin.getText())) {
                        flag = 1;
                    }
                }
                usernamein.setText("");
                passin.setText("");
                if (flag == 0) {
                    JOptionPane.showMessageDialog(null, "Invalid Username/Password", "Status", HEIGHT);
                } 
                else {

                }
            }

        });

    }

    public void Display(boolean visi) {
        this.setVisible(visi);
    }
}
