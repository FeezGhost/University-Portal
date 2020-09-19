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
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;

/**
 *
 * @author Ghost
 */
public class adminJFrame extends JFrame {

    private JFrame homeFrame;
    private JPanel homePanel, studentpanel, teacherpanel, studentadd, studentdel, studentedit, studentedit2, studentlist, studentsearch, studentsearch2,
            teacheradd, teacherdel, teacheredit, teacheredit2, teacherlist, teachersearch, teachersearch2, coursepanel;
    private JButton homebutton, homebutton2, studentbutton, teacherbutton;

    adminJFrame() {

        creatview();
        setTitle("Admin Block");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        this.setVisible(true);
        this.setMinimumSize(new Dimension(300, 300));
        setLocationRelativeTo(null);
    }

    public void creatview() {
        homeFrame = new JFrame();
        homePanel = new JPanel(new GridBagLayout());
        studentpanel = new JPanel(new GridBagLayout());
        teacherpanel = new JPanel(new GridBagLayout());
        this.getContentPane().add(homePanel);
        homebutton = new JButton("Home");
        homebutton.setBackground(java.awt.Color.black);
        homebutton.setForeground(java.awt.Color.white);
        homebutton2 = new JButton("Home");
        homebutton2.setBackground(java.awt.Color.black);
        homebutton2.setForeground(java.awt.Color.white);
        studentbutton = new JButton("Back");
        studentbutton.setBackground(java.awt.Color.black);
        studentbutton.setForeground(java.awt.Color.white);
        teacherbutton = new JButton("Back");
        teacherbutton.setBackground(java.awt.Color.black);
        teacherbutton.setForeground(java.awt.Color.white);
        teacherpanel.setVisible(false);
        teacherf();
        homePanel.add(teacherpanel);
        studentpanel.setVisible(false);
        studentf();
        homePanel.add(studentpanel);
        coursepanel = new JPanel(new GridBagLayout());
        studentadd = new JPanel(new GridBagLayout());
        studentdel = new JPanel(new GridBagLayout());
        studentedit = new JPanel(new GridBagLayout());
        studentedit2 = new JPanel(new GridBagLayout());
        studentsearch = new JPanel(new GridBagLayout());
        studentsearch2 = new JPanel(new BorderLayout());
        studentlist = new JPanel(new BorderLayout());
        homePanel.add(studentlist);
        homePanel.add(studentadd);
        homePanel.add(studentdel);
        homePanel.add(studentedit);
        homePanel.add(studentedit2);
        homePanel.add(studentsearch);
        homePanel.add(studentsearch2);
        homePanel.add(coursepanel);
        coursepanel.setVisible(false);
        coursef();
        studentlist.setVisible(false);
        studentadd.setVisible(false);
        studentdel.setVisible(false);
        studentedit.setVisible(false);
        studentedit2.setVisible(false);
        studentsearch.setVisible(false);
        studentsearch2.setVisible(false);
        teacheradd = new JPanel(new GridBagLayout());
        teacherdel = new JPanel(new GridBagLayout());
        teacheredit = new JPanel(new GridBagLayout());
        teacheredit2 = new JPanel(new GridBagLayout());
        teachersearch = new JPanel(new GridBagLayout());
        teachersearch2 = new JPanel(new BorderLayout());
        teacherlist = new JPanel(new BorderLayout());
        homePanel.add(teacherlist);
        homePanel.add(teacheradd);
        homePanel.add(teacherdel);
        homePanel.add(teacheredit);
        homePanel.add(teacheredit2);
        homePanel.add(teachersearch);
        homePanel.add(teachersearch2);
        teacherlist.setVisible(false);
        teacheredit.setVisible(false);
        teacheredit2.setVisible(false);
        teacherdel.setVisible(false);
        teacheradd.setVisible(false);
        teachersearch.setVisible(false);
        teachersearch2.setVisible(false);
        JButton button1 = new JButton("STUDENT");
        button1.setBackground(java.awt.Color.cyan.darker());
        JButton button2 = new JButton("TEACHER");
        button2.setBackground(java.awt.Color.cyan.darker());
        JButton button4 = new JButton("LogOut");
        button4.setBackground(java.awt.Color.cyan.darker());
        JButton button3 = new JButton("Course");
        button3.setBackground(java.awt.Color.cyan.darker());
        homePanel.setBackground(java.awt.Color.GRAY.darker());
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = new GridBagConstraints().CENTER;
        c.insets = new Insets(30, 20, 5, 30);
        c.gridx = 0;
        c.gridy = 0;
        homePanel.add(button1, c);
        c.gridy++;
        homePanel.add(button2, c);
        c.gridy++;
        homePanel.add(button3, c);
        c.gridy++;
        c.insets = new Insets(30, 10, 40, 30);
        c.anchor = new GridBagConstraints().CENTER;
        homePanel.add(button4, c);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminJFrame.this.setSize(new Dimension(400, 500));
                adminJFrame.this.setLocationRelativeTo(null);
                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
                button4.setVisible(false);
                studentpanel.setVisible(true);
            }

        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminJFrame.this.setSize(new Dimension(400, 500));
                adminJFrame.this.setLocationRelativeTo(null);
                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
                button4.setVisible(false);
                teacherpanel.setVisible(true);
            }

        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminJFrame.this.setSize(new Dimension(300, 300));
                adminJFrame.this.setLocationRelativeTo(null);
                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
                button4.setVisible(false);
                coursepanel.setVisible(true);
                coursef();
            }

        });
        studentbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminJFrame.this.setSize(new Dimension(400, 500));
                adminJFrame.this.setLocationRelativeTo(null);
                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
                studentpanel.setPreferredSize(new Dimension(300, 400));
                studentpanel.setVisible(true);
                studentadd.setVisible(false);
                studentdel.setVisible(false);
                studentedit.setVisible(false);
                studentedit2.setVisible(false);
                studentlist.setVisible(false);
                studentsearch.setVisible(false);
                studentsearch2.setVisible(false);
                studentf();
            }

        });
        homebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminJFrame.this.setSize(new Dimension(300, 300));
                adminJFrame.this.setLocationRelativeTo(null);
                button1.setVisible(true);
                button2.setVisible(true);
                button3.setVisible(true);
                homePanel.setVisible(true);
                studentpanel.setVisible(false);
                studentadd.setVisible(false);
                studentdel.setVisible(false);
                studentedit.setVisible(false);
                studentedit2.setVisible(false);
                studentlist.setVisible(false);
                studentsearch.setVisible(false);
                studentsearch2.setVisible(false);
                studentf();
            }

        });
        teacherbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminJFrame.this.setSize(new Dimension(400, 500));
                adminJFrame.this.setLocationRelativeTo(null);
                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
                button4.setVisible(false);
                teacherpanel.setVisible(true);
                teacheradd.setVisible(false);
                teacherdel.setVisible(false);
                teacheredit.setVisible(false);
                teacheredit2.setVisible(false);
                teacherlist.setVisible(false);
                teachersearch.setVisible(false);
                teachersearch2.setVisible(false);
                teacherf();
            }

        });
        homebutton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminJFrame.this.setSize(new Dimension(300, 300));
                adminJFrame.this.setLocationRelativeTo(null);
                button1.setVisible(true);
                button2.setVisible(true);
                button3.setVisible(true);
                button4.setVisible(true);
                teacherpanel.setVisible(false);
                teacheradd.setVisible(false);
                teacherdel.setVisible(false);
                teacheredit.setVisible(false);
                teacheredit2.setVisible(false);
                teacherlist.setVisible(false);
                teachersearch.setVisible(false);
                teachersearch2.setVisible(false);
                coursepanel.setVisible(false);
                button1.setVisible(true);
                button2.setVisible(true);
                button3.setVisible(true);
                studentpanel.setVisible(false);
                studentadd.setVisible(false);
                studentdel.setVisible(false);
                studentedit.setVisible(false);
                studentedit2.setVisible(false);
                studentlist.setVisible(false);
                studentsearch.setVisible(false);
                studentsearch2.setVisible(false);
                coursepanel.setVisible(false);
                studentf();
                coursef();
                teacherf();
            }

        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeFrame.dispose();
                homeFrame.setVisible(false);
                homepageFrame f = new homepageFrame();
            }

        });

    }

    public void studentf() {
        GridBagConstraints c = new GridBagConstraints();
        JButton sbutton1 = new JButton("Add Student");
        JButton sbutton2 = new JButton("Delete Student");
        JButton sbutton3 = new JButton("Edit Student");
        JButton sbutton4 = new JButton("Student List");
        JButton sbutton5 = new JButton("Search Student");
        studentpanel.setBackground(java.awt.Color.gray);
        c.insets = new Insets(20, 20, 20, 20);
        c.gridx = 0;
        c.gridy = 0;
        studentpanel.add(homebutton, c);
        c.gridy = 1;
        studentpanel.add(sbutton1, c);
        c.gridy++;
        studentpanel.add(sbutton2, c);
        c.gridy++;
        studentpanel.add(sbutton3, c);
        c.gridy++;
        studentpanel.add(sbutton4, c);
        c.gridy++;
        studentpanel.add(sbutton5, c);
        c.gridy++;
        c.anchor = new GridBagConstraints().CENTER;
        sbutton1.setBackground(java.awt.Color.cyan.darker());
        sbutton2.setBackground(java.awt.Color.cyan.darker());
        sbutton3.setBackground(java.awt.Color.cyan.darker());
        sbutton4.setBackground(java.awt.Color.cyan.darker());
        sbutton5.setBackground(java.awt.Color.cyan.darker());
        sbutton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent();
                adminJFrame.this.setSize(new Dimension(600, 400));
                adminJFrame.this.setLocationRelativeTo(null);
                studentadd.setVisible(true);
                studentpanel.setVisible(false);
                studentadd.setBackground(java.awt.Color.gray.brighter());
            }
        });
        sbutton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delStudent();
                adminJFrame.this.setSize(new Dimension(200, 100));
                adminJFrame.this.setLocationRelativeTo(null);
                studentdel.setVisible(true);
                studentpanel.setVisible(false);
            }
        });
        sbutton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editStudent();
                adminJFrame.this.setSize(new Dimension(200, 100));
                adminJFrame.this.setLocationRelativeTo(null);
                studentedit.setVisible(true);
                studentpanel.setVisible(false);
            }
        });
        sbutton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listStudent();
                adminJFrame.this.setSize(new Dimension(1000, 600));
                adminJFrame.this.setLocationRelativeTo(null);
                studentlist.setVisible(true);
                studentpanel.setVisible(false);
            }
        });
        sbutton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchStudent();
                adminJFrame.this.setSize(new Dimension(1000, 300));
                adminJFrame.this.setLocationRelativeTo(null);
                studentsearch.setVisible(true);
                studentpanel.setVisible(false);
            }
        });
    }

    public void coursef() {
        JLabel Name = new JLabel("Name : ");
        JLabel Code = new JLabel("Code : ");
        JLabel CreditHour = new JLabel("Credit Hour : ");
        JLabel sem = new JLabel("Semester : ");
        JLabel tecID = new JLabel("Teacher ID : ");
        JTextField Namein = new JTextField(16);
        JTextField Codein = new JTextField(16);
        JTextField semin = new JTextField(16);
        JTextField CreditHourin = new JTextField(16);
        JTextField tecIDin = new JTextField(16);
        JButton button = new JButton("Submit");
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        coursepanel.add(homebutton2, c);
        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(3, 3, 3, 3);
        c.anchor = new GridBagConstraints().LINE_END;
        coursepanel.add(Name, c);
        c.gridy++;
        coursepanel.add(Code, c);
        c.gridy++;
        coursepanel.add(CreditHour, c);
        c.gridy++;
        coursepanel.add(sem, c);
        c.gridy++;
        coursepanel.add(tecID, c);
        c.gridy++;
        coursepanel.add(button, c);
        button.setBackground(java.awt.Color.cyan.darker());
        this.getRootPane().setDefaultButton(button);
        c.gridx = 1;
        c.gridy = 1;
        c.anchor = new GridBagConstraints().LINE_START;
        coursepanel.add(Namein, c);
        c.gridy++;
        coursepanel.add(Codein, c);
        c.gridy++;
        coursepanel.add(CreditHourin, c);
        c.gridy++;
        coursepanel.add(semin, c);
        c.gridy++;
        coursepanel.add(tecIDin, c);
        c.gridy++;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<course> CourseList = CFileClass.readAllData();
                course c = new course(Namein.getText(),Codein.getText(),CreditHourin.getText(),semin.getText(),tecIDin.getText());
                CourseList.add(c);
                CFileClass.addArrayListToFile(CourseList);
            }
        });

    }

    public void addStudent() {
        JLabel firstn = new JLabel("First Name : ");
        JLabel secondn = new JLabel("Second Name : ");
        JLabel age = new JLabel("Age : ");
        JLabel gender = new JLabel("Gender : ");
        JLabel address = new JLabel("Address : ");
        JLabel email = new JLabel("Email : ");
        JLabel phoneNo = new JLabel("Phone Number : ");
        JLabel sem = new JLabel("Semester : ");
        JLabel sec = new JLabel("Section : ");
        JLabel regNo = new JLabel("Registration No : ");
        JLabel pass = new JLabel("Password : ");
        JLabel fees = new JLabel("Fees : ");
        JTextField firstnin = new JTextField(16);
        JTextField secondnin = new JTextField(16);
        JTextField agein = new JTextField(16);
        JTextField genderin = new JTextField(16);
        JTextField addressin = new JTextField(16);
        JTextField emailin = new JTextField(16);
        JTextField phoneNoin = new JTextField(16);
        JTextField semin = new JTextField(16);
        JTextField secin = new JTextField(16);
        JTextField regNoin = new JTextField(16);
        JTextField passin = new JTextField(16);
        JTextField feesin = new JTextField(16);
        JButton button = new JButton("Submit");
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        studentadd.add(homebutton2, c);
        c.gridx++;
        studentadd.add(studentbutton, c);
        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(3, 3, 3, 3);
        c.anchor = new GridBagConstraints().LINE_END;
        studentadd.add(firstn, c);
        c.gridy++;
        studentadd.add(secondn, c);
        c.gridy++;
        studentadd.add(regNo, c);
        c.gridy++;
        studentadd.add(gender, c);
        c.gridy++;
        studentadd.add(age, c);
        c.gridy++;
        studentadd.add(sem, c);
        c.gridy++;
        studentadd.add(sec, c);
        c.gridy++;
        studentadd.add(pass, c);
        c.gridy++;
        studentadd.add(email, c);
        c.gridy++;
        studentadd.add(address, c);
        c.gridy++;
        studentadd.add(phoneNo, c);
        c.gridy++;
        studentadd.add(fees, c);
        c.gridy++;
        studentadd.add(button, c);
        button.setBackground(java.awt.Color.cyan.darker());
        this.getRootPane().setDefaultButton(button);
        c.gridx = 1;
        c.gridy = 1;
        c.anchor = new GridBagConstraints().LINE_START;
        studentadd.add(firstnin, c);
        c.gridy++;
        studentadd.add(secondnin, c);
        c.gridy++;
        studentadd.add(regNoin, c);
        c.gridy++;
        studentadd.add(genderin, c);
        c.gridy++;
        studentadd.add(agein, c);
        c.gridy++;
        studentadd.add(semin, c);
        c.gridy++;
        studentadd.add(secin, c);
        c.gridy++;
        studentadd.add(passin, c);
        c.gridy++;
        studentadd.add(emailin, c);
        c.gridy++;
        studentadd.add(addressin, c);
        c.gridy++;
        studentadd.add(phoneNoin, c);
        c.gridy++;
        studentadd.add(feesin, c);
        c.gridy++;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<student> StudentList = SFileClass.readAllData();
                ArrayList<enrolledStudent> EnrolledStudentList = SFileClass.readAllDataEnrolledStudent();
                ArrayList<course> CourseList =CFileClass.readAllData();
                ArrayList<course> courselist = new ArrayList<course>();
                System.out.println("size "+CourseList.size());
                for (int i = 0; i < CourseList.size(); i++) {
                        if (CourseList.get(i).getSem().equals(semin.getText())) {
                            System.out.println("course name of file"+CourseList.get(i).getName());
                            courselist.add(CourseList.get(i));
                            System.out.println("course name of file after"+courselist.get(i).getName());
                            enrolledStudent enrolledstudents=new enrolledStudent(CourseList.get(i).getCode(),regNoin.getText());
                            EnrolledStudentList.add(enrolledstudents);
                    }
                }
                SFileClass.addArrayListToFileEnrolledStudent(EnrolledStudentList);
                student s = new student(regNoin.getText(), passin.getText(), feesin.getText(), semin.getText(), secin.getText(), courselist, firstnin.getText(), secondnin.getText(), agein.getText(), genderin.getText(), addressin.getText(), emailin.getText(), phoneNoin.getText());
                SFileClass.addArrayListToFileEnrolledStudent(EnrolledStudentList);
                StudentList.add(s);
                SFileClass.addArrayListToFile(StudentList);
                regNoin.setText("");
                passin.setText("");
                feesin.setText("");
                semin.setText("");
                secin.setText("");
                firstnin.setText("");
                secondnin.setText("");
                agein.setText("");
                genderin.setText("");
                emailin.setText("");
                phoneNoin.setText("");
                addressin.setText("");
            }
        });
    }

    public void delStudent() {
        JButton del = new JButton("Delete ");
        JLabel username = new JLabel("UserName : ");
        JTextField usernamein = new JTextField(16);
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(3, 3, 3, 3);
        c.gridx = 0;
        c.gridy = 0;
        studentdel.add(homebutton2, c);
        c.gridx++;
        studentdel.add(studentbutton, c);
        c.gridx = 0;
        c.gridy = 1;
        c.anchor = new GridBagConstraints().LINE_END;
        studentdel.add(username, c);
        c.gridy++;
        studentdel.add(del, c);
        c.gridy = 1;
        c.gridx = 1;
        c.anchor = new GridBagConstraints().LINE_START;
        studentdel.add(usernamein, c);
        c.gridy++;
        studentdel.setBackground(java.awt.Color.gray.brighter());
        del.setBackground(java.awt.Color.cyan.darker());
        this.getRootPane().setDefaultButton(del);
        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<student> StudentList = SFileClass.readAllData();
                int flag = 0;
                for (int i = 0; i < StudentList.size(); i++) {
                    if (StudentList.get(i).getReg_no().equals(usernamein.getText())) {
                        StudentList.remove(i);
                        flag = 1;
                    }
                }
                SFileClass.addArrayListToFile(StudentList);
                usernamein.setText("");
                if (flag != 1) {
                    JOptionPane.showMessageDialog(null, "Record Doesn't Exists", "Status", HEIGHT);
                }
            }
        });
    }

    public void editStudent() {
        JButton edit = new JButton("Search ");
        JLabel username = new JLabel("UserName : ");
        JTextField usernamein = new JTextField(16);
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(3, 3, 3, 3);
        c.gridx = 0;
        c.gridy = 0;
        studentedit.add(homebutton2, c);
        c.gridx++;
        studentedit.add(studentbutton, c);
        c.gridx = 0;
        c.gridy = 1;
        c.anchor = new GridBagConstraints().LINE_END;
        studentedit.add(username, c);
        c.gridy++;
        studentedit.add(edit, c);
        c.gridy = 1;
        c.gridx = 1;
        c.anchor = new GridBagConstraints().LINE_START;
        studentedit.add(usernamein, c);
        c.gridy++;
        studentedit.setBackground(java.awt.Color.gray.brighter());
        edit.setBackground(java.awt.Color.cyan.darker());
        this.getRootPane().setDefaultButton(edit);

        JLabel firstn = new JLabel("First Name : ");
        JLabel secondn = new JLabel("Second Name : ");
        JLabel age = new JLabel("Age : ");
        JLabel gender = new JLabel("Gender : ");
        JLabel address = new JLabel("Address : ");
        JLabel email = new JLabel("Email : ");
        JLabel phoneNo = new JLabel("Phone Number : ");
        JLabel sem = new JLabel("Semester : ");
        JLabel sec = new JLabel("Section : ");
        JLabel pass = new JLabel("Password : ");
        JLabel fees = new JLabel("Fees : ");
        JTextField firstnin = new JTextField(16);
        JTextField secondnin = new JTextField(16);
        JTextField agein = new JTextField(16);
        JTextField genderin = new JTextField(16);
        JTextField addressin = new JTextField(16);
        JTextField emailin = new JTextField(16);
        JTextField phoneNoin = new JTextField(16);
        JTextField semin = new JTextField(16);
        JTextField secin = new JTextField(16);
        JTextField passin = new JTextField(16);
        JTextField feesin = new JTextField(16);
        JButton button = new JButton("Edit");
        c.gridx = 0;
        c.gridy = 0;
        studentedit.add(homebutton2, c);
        c.gridx++;
        studentedit.add(studentbutton, c);
        c.gridx = 0;
        c.gridy = 1;
        c.anchor = new GridBagConstraints().LINE_END;
        studentedit2.add(firstn, c);
        c.gridy++;
        studentedit2.add(secondn, c);
        c.gridy++;
        studentedit2.add(gender, c);
        c.gridy++;
        studentedit2.add(sem, c);
        c.gridy++;
        studentedit2.add(sec, c);
        c.gridy++;
        studentedit2.add(pass, c);
        c.gridy++;
        studentedit2.add(age, c);
        c.gridy++;
        studentedit2.add(email, c);
        c.gridy++;
        studentedit2.add(address, c);
        c.gridy++;
        studentedit2.add(phoneNo, c);
        c.gridy++;
        studentedit2.add(fees, c);
        c.gridy++;
        studentedit2.add(button, c);
        button.setBackground(java.awt.Color.cyan.darker());
        c.gridx = 1;
        c.gridy = 1;
        c.anchor = new GridBagConstraints().LINE_START;
        studentedit2.add(firstnin, c);
        c.gridy++;
        studentedit2.add(secondnin, c);
        c.gridy++;
        studentedit2.add(genderin, c);
        c.gridy++;
        studentedit2.add(semin, c);
        c.gridy++;
        studentedit2.add(secin, c);
        c.gridy++;
        studentedit2.add(passin, c);
        c.gridy++;
        studentedit2.add(agein, c);
        c.gridy++;
        studentedit2.add(emailin, c);
        c.gridy++;
        studentedit2.add(addressin, c);
        c.gridy++;
        studentedit2.add(phoneNoin, c);
        c.gridy++;
        studentedit2.add(feesin, c);
        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<student> StudentList = SFileClass.readAllData();
                int flag = 0;
                for (int i = 0; i < StudentList.size(); i++) {
                    if (StudentList.get(i).reg_no.equals(usernamein.getText())) {

                        adminJFrame.this.setSize(new Dimension(400, 400));
                        studentedit.setVisible(false);
                        studentedit2.setVisible(true);
                        if (addressin.getText() != null) {
                            StudentList.get(i).setAddress(addressin.getText());
                        }
                        if (firstnin.getText() != null) {
                            StudentList.get(i).setFirst_name(firstnin.getText());
                        }
                        if (secondnin.getText() != null) {
                            StudentList.get(i).setSecond_name(secondnin.getText());
                        }
                        if (agein.getText() != null) {
                            StudentList.get(i).setAge(agein.getText());
                        }
                        if (genderin.getText() != null) {
                            StudentList.get(i).setGender(genderin.getText());
                        }
                        if (phoneNoin.getText() != null) {
                            StudentList.get(i).setPhone_no(phoneNoin.getText());
                        }
                        if (feesin.getText() != null) {
                            StudentList.get(i).setFees(feesin.getText());
                        }
                        if (semin.getText() != null) {
                            StudentList.get(i).setSem(semin.getText());
                        }
                        if (secin.getText() != null) {
                            StudentList.get(i).setSec(secin.getText());
                        }
                        flag = 1;
                    }
                }
                if (flag != 1) {
                    JOptionPane.showMessageDialog(null, "Record Doesn't Exists", "Status", HEIGHT);
                } else {
                    SFileClass.addArrayListToFile(StudentList);
                }
                studentedit2.setVisible(false);
                studentedit.setVisible(true);
            }
        });
    }

    public void listStudent() {
        ArrayList<student> StudentList = SFileClass.readAllData();
        String[][] data = new String[StudentList.size()][12];
        JPanel north = new JPanel(new GridBagLayout());
        studentlist.add(north, BorderLayout.NORTH);
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(3, 3, 3, 3);
        c.gridx = 0;
        c.gridy = 0;
        north.add(homebutton2, c);
        c.gridx++;
        north.add(studentbutton, c);
        c.gridx++;
        for (int i = 0; i < StudentList.size(); i++) {
            String[] data2 = {StudentList.get(i).getReg_no(), StudentList.get(i).getFirst_name(), StudentList.get(i).getSecond_name(), StudentList.get(i).getAge(), StudentList.get(i).getGender(), StudentList.get(i).getSem(), StudentList.get(i).getSec(), StudentList.get(i).getFees(), StudentList.get(i).getAddress(), StudentList.get(i).getPhone_no(), StudentList.get(i).getEmail()};
            for (int j = 0; j < 11; j++) {
                data[i][j] = data2[j];
            }
        }
        String[] heading = {"Registration No", "First Name", "Second Name", "Age", "Gender", "Semester", "Section", "Fees", "Address", "Phone No", "Email"};
        JTable stu = new JTable(data, heading);
        stu.setPreferredScrollableViewportSize(new Dimension(900, 400));
        JScrollPane sp = new JScrollPane(stu);
        studentlist.add(sp, BorderLayout.CENTER);
    }

    public void searchStudent() {
        JButton search = new JButton("Search ");
        JLabel username = new JLabel("UserName : ");
        JTextField usernamein = new JTextField(16);
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(3, 3, 3, 3);
        c.gridx = 0;
        c.gridy = 0;
        studentsearch.add(homebutton2, c);
        c.gridx++;
        studentsearch.add(studentbutton, c);
        c.gridx = 0;
        c.gridy = 1;
        c.anchor = new GridBagConstraints().LINE_END;
        studentsearch.add(username, c);
        c.gridy++;
        studentsearch.add(search, c);
        c.gridy = 1;
        c.gridx = 1;
        c.anchor = new GridBagConstraints().LINE_START;
        studentsearch.add(usernamein, c);
        c.gridy++;
        studentsearch.setBackground(java.awt.Color.gray.brighter());
        search.setBackground(java.awt.Color.cyan.darker());
        this.getRootPane().setDefaultButton(search);
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<student> StudentList = SFileClass.readAllData();
                String[][] data = new String[1][11];
                int flag = 0;
                for (int i = 0; i < StudentList.size(); i++) {
                    if (StudentList.get(i).getReg_no().equals(usernamein.getText())) {
                        flag = 1;
                        String[] data2 = {StudentList.get(i).getReg_no(), StudentList.get(i).getFirst_name(), StudentList.get(i).getSecond_name(), StudentList.get(i).getAge(), StudentList.get(i).getGender(), StudentList.get(i).getSem(), StudentList.get(i).getSec(), StudentList.get(i).getFees(), StudentList.get(i).getAddress(), StudentList.get(i).getPhone_no(), StudentList.get(i).getEmail()};
                        for (int j = 0; j <11; j++) {
                            data[0][j] = data2[j];
                        }
                    }
                }
                if (flag == 0) {
                    JOptionPane.showMessageDialog(null, "Record Doesn't Exists", "Status", HEIGHT);
                } else {
                    String[] heading = {"Registration No", "First Name", "Second Name", "Age", "Gender", "Semester", "Section", "Fees", "Address", "Phone No", "Email"};
                    JTable stu = new JTable(data, heading);
                    stu.setPreferredScrollableViewportSize(new Dimension(900, 300));
                    JPanel north = new JPanel(new GridBagLayout());
                    studentsearch2.add(north, BorderLayout.NORTH);
                    GridBagConstraints c = new GridBagConstraints();
                    c.insets = new Insets(3, 3, 3, 3);
                    c.gridx = 0;
                    c.gridy = 0;
                    north.add(homebutton2, c);
                    c.gridx++;
                    north.add(studentbutton, c);
                    c.gridx++;
                    studentsearch2.add(stu, BorderLayout.CENTER);
                    studentsearch.setVisible(false);
                    studentsearch2.setVisible(true);
                }
            }
        });
    }

    public void teacherf() {
        GridBagConstraints c = new GridBagConstraints();
        JButton sbutton1 = new JButton("Add Teacher");
        JButton sbutton2 = new JButton("Delete Teacher");
        JButton sbutton3 = new JButton("Edit Teacher");
        JButton sbutton4 = new JButton("Teacher List");
        JButton sbutton5 = new JButton("Search Teacher");
        teacherpanel.setBackground(java.awt.Color.gray);
        c.insets = new Insets(20, 20, 20, 20);
        c.gridx = 0;
        c.gridy = 0;
        homebutton2.setVisible(true);
        teacherpanel.add(homebutton2, c);
        c.gridy++;
        teacherpanel.add(sbutton1, c);
        c.gridy++;
        teacherpanel.add(sbutton2, c);
        c.gridy++;
        teacherpanel.add(sbutton3, c);
        c.gridy++;
        teacherpanel.add(sbutton4, c);
        c.gridy++;
        teacherpanel.add(sbutton5, c);
        c.gridy++;
        c.anchor = new GridBagConstraints().CENTER;
        sbutton1.setBackground(java.awt.Color.cyan.darker());
        sbutton2.setBackground(java.awt.Color.cyan.darker());
        sbutton3.setBackground(java.awt.Color.cyan.darker());
        sbutton4.setBackground(java.awt.Color.cyan.darker());
        sbutton5.setBackground(java.awt.Color.cyan.darker());
        sbutton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTeacher();
                adminJFrame.this.setSize(new Dimension(600, 400));
                adminJFrame.this.setLocationRelativeTo(null);
                teacheradd.setVisible(true);
                teacherpanel.setVisible(false);
                teacheradd.setBackground(java.awt.Color.gray.brighter());
            }
        });
        sbutton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delTeacher();
                adminJFrame.this.setSize(new Dimension(200, 100));
                adminJFrame.this.setLocationRelativeTo(null);
                teacherdel.setVisible(true);
                teacherpanel.setVisible(false);
            }
        });
        sbutton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editTeacher();
                adminJFrame.this.setSize(new Dimension(200, 100));
                adminJFrame.this.setLocationRelativeTo(null);
                teacheredit.setVisible(true);
                teacherpanel.setVisible(false);
            }
        });
        sbutton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listTeacher();
                adminJFrame.this.setSize(new Dimension(1000, 600));
                adminJFrame.this.setLocationRelativeTo(null);
                teacherpanel.setVisible(false);
                teacherlist.setVisible(true);
            }
        });
        sbutton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchTeacher();
                adminJFrame.this.setSize(new Dimension(1000, 300));
                adminJFrame.this.setLocationRelativeTo(null);
                teachersearch.setVisible(true);
                teacherpanel.setVisible(false);
            }
        });
    }

    public void addTeacher() {
        JLabel firstn = new JLabel("First Name : ");
        JLabel secondn = new JLabel("Second Name : ");
        JLabel age = new JLabel("Age : ");
        JLabel gender = new JLabel("Gender : ");
        JLabel address = new JLabel("Address : ");
        JLabel email = new JLabel("Email : ");
        JLabel phoneNo = new JLabel("Phone Number : ");
        JLabel id = new JLabel("ID : ");
        JLabel pass = new JLabel("Password : ");
        JLabel pay = new JLabel("Pay : ");
        JTextField firstnin = new JTextField(16);
        JTextField secondnin = new JTextField(16);
        JTextField agein = new JTextField(16);
        JTextField genderin = new JTextField(16);
        JTextField addressin = new JTextField(16);
        JTextField emailin = new JTextField(16);
        JTextField phoneNoin = new JTextField(16);
        JTextField idin = new JTextField(16);
        JTextField passin = new JTextField(16);
        JTextField payin = new JTextField(16);
        JButton button = new JButton("Submit");
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        teacheradd.add(homebutton2, c);
        c.gridx++;
        teacheradd.add(teacherbutton, c);
        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(3, 3, 3, 3);
        c.anchor = new GridBagConstraints().LINE_END;
        teacheradd.add(firstn, c);
        c.gridy++;
        teacheradd.add(secondn, c);
        c.gridy++;
        teacheradd.add(id, c);
        c.gridy++;
        teacheradd.add(gender, c);
        c.gridy++;
        teacheradd.add(age, c);
        c.gridy++;
        teacheradd.add(pass, c);
        c.gridy++;
        teacheradd.add(email, c);
        c.gridy++;
        teacheradd.add(address, c);
        c.gridy++;
        teacheradd.add(phoneNo, c);
        c.gridy++;
        teacheradd.add(pay, c);
        c.gridy++;
        teacheradd.add(button, c);
        button.setBackground(java.awt.Color.cyan.darker());
        this.getRootPane().setDefaultButton(button);
        c.gridx = 1;
        c.gridy = 1;
        c.anchor = new GridBagConstraints().LINE_START;
        teacheradd.add(firstnin, c);
        c.gridy++;
        teacheradd.add(secondnin, c);
        c.gridy++;
        teacheradd.add(idin, c);
        c.gridy++;
        teacheradd.add(genderin, c);
        c.gridy++;
        teacheradd.add(agein, c);
        c.gridy++;
        teacheradd.add(passin, c);
        c.gridy++;
        teacheradd.add(emailin, c);
        c.gridy++;
        teacheradd.add(addressin, c);
        c.gridy++;
        teacheradd.add(phoneNoin, c);
        c.gridy++;
        teacheradd.add(payin, c);
        c.gridy++;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<teacher> TeacherList = TFileClass.readAllData();
                ArrayList<course> CourseListTemp = CFileClass.readAllData();
                ArrayList<course> CourseList = new ArrayList<course>(0);
                for (int j = 0; j < CourseListTemp.size(); j++) {
                    if (CourseListTemp.get(j).getTecID().equals(idin.getText())) {
                        CourseList.add(CourseListTemp.get(j));
                    }
                }
                teacher s=new teacher(idin.getText(),passin.getText(), pay.getText(), CourseList,firstnin.getText(), secondnin.getText(), agein.getText(), genderin.getText(), addressin.getText(), emailin.getText(), phoneNoin.getText());
                TeacherList.add(s);
                TFileClass.addArrayListToFile(TeacherList);
                idin.setText("");
                passin.setText("");
                payin.setText("");
                firstnin.setText("");
                secondnin.setText("");
                agein.setText("");
                genderin.setText("");
                emailin.setText("");
                phoneNoin.setText("");
            }
        });
    }

    public void delTeacher() {
        JButton del = new JButton("Delete ");
        JLabel username = new JLabel("UserName : ");
        JTextField usernamein = new JTextField(16);
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(3, 3, 3, 3);
        c.gridx = 0;
        c.gridy = 0;
        teacherdel.add(homebutton2, c);
        c.gridx++;
        teacherdel.add(teacherbutton, c);
        c.gridx = 0;
        c.gridy = 1;
        c.anchor = new GridBagConstraints().LINE_END;
        teacherdel.add(username, c);
        c.gridy++;
        teacherdel.add(del, c);
        c.gridy = 1;
        c.gridx = 1;
        c.anchor = new GridBagConstraints().LINE_START;
        teacherdel.add(usernamein, c);
        c.gridy++;
        teacherdel.setBackground(java.awt.Color.gray.brighter());
        del.setBackground(java.awt.Color.cyan.darker());
        this.getRootPane().setDefaultButton(del);
        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<teacher> TeacherList = TFileClass.readAllData();
                int flag = 0;
                for (int i = 0; i < TeacherList.size(); i++) {
                    if (TeacherList.get(i).id.equals(usernamein.getText())) {
                        TeacherList.remove(i);
                        flag = 1;
                    }
                }
                TFileClass.addArrayListToFile(TeacherList);
                usernamein.setText("");
                if (flag != 1) {
                    JOptionPane.showMessageDialog(null, "Record Doesn't Exists", "Status", HEIGHT);
                }
            }
        });
    }

    public void editTeacher() {
        JButton edit = new JButton("Search ");
        JLabel username = new JLabel("UserName : ");
        JTextField usernamein = new JTextField(16);
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(3, 3, 3, 3);
        c.gridx = 0;
        c.gridy = 0;
        teacheredit.add(homebutton2, c);
        c.gridx++;
        teacheredit.add(teacherbutton, c);
        c.gridx = 0;
        c.gridy = 1;
        c.anchor = new GridBagConstraints().LINE_END;
        teacheredit.add(username, c);
        c.gridy++;
        teacheredit.add(edit, c);
        c.gridy = 1;
        c.gridx = 1;
        c.anchor = new GridBagConstraints().LINE_START;
        teacheredit.add(usernamein, c);
        c.gridy++;
        teacheredit.setBackground(java.awt.Color.gray.brighter());
        edit.setBackground(java.awt.Color.cyan.darker());
        this.getRootPane().setDefaultButton(edit);

        JLabel firstn = new JLabel("First Name : ");
        JLabel secondn = new JLabel("Second Name : ");
        JLabel age = new JLabel("Age : ");
        JLabel gender = new JLabel("Gender : ");
        JLabel address = new JLabel("Address : ");
        JLabel email = new JLabel("Email : ");
        JLabel phoneNo = new JLabel("Phone Number : ");
        JLabel pass = new JLabel("Password : ");
        JLabel pay = new JLabel("Pay : ");
        JTextField firstnin = new JTextField(16);
        JTextField secondnin = new JTextField(16);
        JTextField agein = new JTextField(16);
        JTextField genderin = new JTextField(16);
        JTextField addressin = new JTextField(16);
        JTextField emailin = new JTextField(16);
        JTextField phoneNoin = new JTextField(16);
        JTextField passin = new JTextField(16);
        JTextField payin = new JTextField(16);
        JButton button = new JButton("Edit");
        c.gridx = 0;
        c.gridy = 0;
        teacheredit.add(homebutton2, c);
        c.gridx++;
        teacheredit.add(teacherbutton, c);
        c.gridx = 0;
        c.gridy = 1;
        c.anchor = new GridBagConstraints().LINE_END;
        teacheredit2.add(firstn, c);
        c.gridy++;
        teacheredit2.add(secondn, c);
        c.gridy++;
        teacheredit2.add(gender, c);
        c.gridy++;
        teacheredit2.add(age, c);
        c.gridy++;
        studentedit2.add(pass, c);
        c.gridy++;
        teacheredit2.add(email, c);
        c.gridy++;
        teacheredit2.add(address, c);
        c.gridy++;
        teacheredit2.add(phoneNo, c);
        c.gridy++;
        teacheredit2.add(pay, c);
        c.gridy++;
        teacheredit2.add(button, c);
        button.setBackground(java.awt.Color.cyan.darker());
        c.gridx = 1;
        c.gridy = 1;
        c.anchor = new GridBagConstraints().LINE_START;
        teacheredit2.add(firstnin, c);
        c.gridy++;
        teacheredit2.add(secondnin, c);
        c.gridy++;
        teacheredit2.add(genderin, c);
        c.gridy++;
        teacheredit2.add(agein, c);
        c.gridy++;
        teacheredit2.add(passin, c);
        c.gridy++;
        teacheredit2.add(emailin, c);
        c.gridy++;
        teacheredit2.add(addressin, c);
        c.gridy++;
        teacheredit2.add(phoneNoin, c);
        c.gridy++;
        teacheredit2.add(payin, c);
        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<teacher> TeacherList = TFileClass.readAllData();
                int flag = 0;
                for (int i = 0; i < TeacherList.size(); i++) {
                    if (TeacherList.get(i).id.equals(usernamein.getText())) {

                        adminJFrame.this.setSize(new Dimension(400, 400));
                        studentedit.setVisible(false);
                        studentedit2.setVisible(true);
                        if (addressin.getText() != null) {
                            TeacherList.get(i).setAddress(addressin.getText());
                        }
                        if (firstnin.getText() != null) {
                            TeacherList.get(i).setFirst_name(firstnin.getText());
                        }
                        if (secondnin.getText() != null) {
                            TeacherList.get(i).setSecond_name(secondnin.getText());
                        }
                        if (agein.getText() != null) {
                            TeacherList.get(i).setAge(agein.getText());
                        }
                        if (genderin.getText() != null) {
                            TeacherList.get(i).setGender(genderin.getText());
                        }
                        if (phoneNoin.getText() != null) {
                            TeacherList.get(i).setPhone_no(phoneNoin.getText());
                        }
                        if (payin.getText() != null) {
                            TeacherList.get(i).setPay(payin.getText());
                        }
                        flag = 1;
                    }
                }
                if (flag != 1) {
                    JOptionPane.showMessageDialog(null, "Record Doesn't Exists", "Status", HEIGHT);
                } else {
                    TFileClass.addArrayListToFile(TeacherList);
                }
                studentedit2.setVisible(false);
                studentedit.setVisible(true);
            }
        });
    }

    public void listTeacher() {
        ArrayList<teacher> TeacherList = TFileClass.readAllData();
        String[][] datat = new String[TeacherList.size()][10];
        JPanel northt = new JPanel(new GridBagLayout());
        teacherlist.add(northt, BorderLayout.NORTH);
        GridBagConstraints ct = new GridBagConstraints();
        ct.insets = new Insets(3, 3, 3, 3);
        ct.gridx = 0;
        ct.gridy = 0;
        northt.add(homebutton2, ct);
        ct.gridx++;
        northt.add(teacherbutton, ct);
        ct.gridx++;
        for (int i = 0; i < TeacherList.size(); i++) {
            String[] data2t = {TeacherList.get(i).getId(), TeacherList.get(i).getFirst_name(), TeacherList.get(i).getSecond_name(), TeacherList.get(i).getAge(), TeacherList.get(i).getGender(), TeacherList.get(i).getPay(), TeacherList.get(i).getAddress(), TeacherList.get(i).getPhone_no(), TeacherList.get(i).getEmail()};
            for (int j = 0; j < 9; j++) {
                datat[i][j] = data2t[j];
            }
        }
        String[] heading = {"ID", "First Name", "Second Name", "Age", "Gender", "Pay", "Address", "Phone No", "Email"};
        JTable tec = new JTable(datat, heading);
        tec.setPreferredScrollableViewportSize(new Dimension(800, 400));
        JScrollPane sp = new JScrollPane(tec);
        teacherlist.add(sp, BorderLayout.CENTER);
    }

    public void searchTeacher() {
        JButton search = new JButton("Search ");
        JLabel username = new JLabel("UserName : ");
        JTextField usernamein = new JTextField(16);
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(3, 3, 3, 3);
        c.gridx = 0;
        c.gridy = 0;
        teachersearch.add(homebutton2, c);
        c.gridx++;
        teachersearch.add(teacherbutton, c);
        c.gridx = 0;
        c.gridy = 1;
        c.anchor = new GridBagConstraints().LINE_END;
        teachersearch.add(username, c);
        c.gridy++;
        teachersearch.add(search, c);
        c.gridy = 1;
        c.gridx = 1;
        c.anchor = new GridBagConstraints().LINE_START;
        teachersearch.add(usernamein, c);
        c.gridy++;
        teachersearch.setBackground(java.awt.Color.gray.brighter());
        search.setBackground(java.awt.Color.cyan.darker());
        this.getRootPane().setDefaultButton(search);
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<teacher> TeacherList = TFileClass.readAllData();
                String[][] data = new String[1][10];
                int flag = 0;
                for (int i = 0; i < TeacherList.size(); i++) {
                    if (TeacherList.get(i).getId().equals(usernamein.getText())) {
                        flag = 1;
                        String[] data2 = {TeacherList.get(i).getId(), TeacherList.get(i).getFirst_name(), TeacherList.get(i).getSecond_name(), TeacherList.get(i).getAge(), TeacherList.get(i).getGender(), TeacherList.get(i).getPay(), TeacherList.get(i).getAddress(), TeacherList.get(i).getPhone_no(), TeacherList.get(i).getEmail()};
                        for (int j = 0; j < 10; j++) {
                            data[1][j] = data2[j];
                        }
                    }
                }
                if (flag == 0) {
                    JOptionPane.showMessageDialog(null, "Record Doesn't Exists", "Status", HEIGHT);
                } else {
                    String[] heading = {"Registration No", "First Name", "Second Name", "Age", "Gender", "Pay", "Address", "Phone No", "Email"};
                    JTable tec = new JTable(data, heading);
                    tec.setPreferredScrollableViewportSize(new Dimension(800, 200));
                    JPanel north = new JPanel(new GridBagLayout());
                    teachersearch2.add(north, BorderLayout.NORTH);
                    GridBagConstraints c = new GridBagConstraints();
                    c.insets = new Insets(3, 3, 3, 3);
                    c.gridx = 0;
                    c.gridy = 0;
                    north.add(homebutton2, c);
                    c.gridx++;
                    north.add(teacherbutton, c);
                    c.gridx++;
                    teachersearch.setVisible(false);
                    teachersearch2.add(tec, BorderLayout.CENTER);
                    teachersearch2.setVisible(true);
                }
            }
        });
    }
}
