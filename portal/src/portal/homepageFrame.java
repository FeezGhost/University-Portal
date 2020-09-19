/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;
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
public class homepageFrame extends JFrame {

    private JFrame  homeFrame,Account;
    private JPanel  homePanel,panel;
    private JButton createAccount;

    homepageFrame() {
        creatview();
        setTitle("HOME PAGE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        this.setMinimumSize(new Dimension(500, 600));
        this.setVisible(true);
        setLocationRelativeTo(null);
        Account.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Account.setResizable(false);
        Account.setMinimumSize(new Dimension(400, 200));
        Account.setVisible(false);
        Account.setLocationRelativeTo(null);
    }

    public void creatview() {
        Account=new JFrame("Admin Account");
        panel = new JPanel(new GridBagLayout());
        Account.getContentPane().add(panel);
        panel.setBackground(java.awt.Color.CYAN.darker());
        JLabel title = new JLabel("Create Account");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        JButton logbutton = new JButton("Log in");
        logbutton.setBackground(java.awt.Color.blue.darker());
        logbutton.setForeground(java.awt.Color.WHITE);
        logbutton.setFocusPainted(false);
        logbutton.setFont(new Font("Tahoma", Font.BOLD, 12));
        JLabel username = new JLabel("ID : ");
        JLabel pass = new JLabel("Password : ");
        JTextField usernamein = new JTextField(18);
        JTextField passin = new JTextField(18);
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
        Account.getRootPane().setDefaultButton(logbutton);
        logbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                addAdmin a = new addAdmin();
                Account.dispose();
                Account.setVisible(false);
                
            }

        });
        
        
        
        this.setLayout(null);
        homeFrame = new JFrame();
        homePanel = new JPanel(new BorderLayout());
        this.getContentPane().add(homePanel);
        JLabel welcome = new JLabel("WELCOME TO THE UNIVERSITY PORTAL");
        welcome.setFont(new Font("Arial", Font.BOLD, 18));
        ImageIcon image = new ImageIcon(getClass().getResource("new.jpg"));
        JLabel i = new JLabel(image);
        welcome.setBounds(70, 40, 400, 20);
        this.add(welcome);
        JButton button1 = new JButton("STUDENT");
        button1.setBounds(50, 400, 100, 20);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SLogInFrame stu = new SLogInFrame();
                stu.Display(true);
            }
        });
        JButton button2 = new JButton("TEACHER");
        button2.setBounds(200, 400, 100, 20);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TLogInFrame tec = new TLogInFrame();
                tec.Display(true);
            }
        });
        JButton button3 = new JButton("ADMIN");
        button3.setBounds(350, 400, 100, 20);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ALogInFrame ad = new ALogInFrame();
                ad.Display(true);
            }
        });
        createAccount=new JButton("Account");
        createAccount.setBounds(200, 450, 100, 20);
        createAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Account.setVisible(true);
            }
        });
        this.add(createAccount);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        i.setBounds(0, 0, 500, 500);
        this.add(i);
    }

}
