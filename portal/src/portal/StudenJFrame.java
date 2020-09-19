/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Ghost
 */
public class StudenJFrame extends JFrame {
    
    static  int counter=0;
    private JButton home,cd, atten, marks;
    private JPanel main, north,north2, south, west, east, center, cdetail, att, markspanel;
    private ArrayList<student> CurrentStudentList = SFileClass.CurrentUserreadAllData();
    

    StudenJFrame() {
        creatview();
        this.setTitle("Welcome " + CurrentStudentList.get(0).getFirst_name() + " " + CurrentStudentList.get(0).getSecond_name());
        this.setMinimumSize(new Dimension(600, 600));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);

    }

    public void creatview() {
        main = new JPanel(new BorderLayout());
        this.getContentPane().add(main);
        center = new JPanel(new GridBagLayout());
        cdetail = new JPanel(new GridBagLayout());
        att = new JPanel(new GridBagLayout());
        north2 = new JPanel(new GridBagLayout());
        markspanel = new JPanel(new GridBagLayout());
        north = new JPanel(new BorderLayout());
        south = new JPanel(new GridBagLayout());
        main.add(north, BorderLayout.NORTH);
        main.add(center, BorderLayout.CENTER);
        main.add(cdetail, BorderLayout.CENTER);
        main.add(att, BorderLayout.CENTER);
        main.add(markspanel, BorderLayout.CENTER);
        north.add(north2, BorderLayout.SOUTH);
        cdetail.setVisible(false);
        att.setVisible(false);
        markspanel.setVisible(false);
        north.setPreferredSize(new Dimension(200, 200));
        south.setPreferredSize(new Dimension(200, 100));
        main.add(south, BorderLayout.SOUTH);
        north2.setBackground(java.awt.Color.cyan.darker());
        north.setBackground(java.awt.Color.cyan.darker());
        south.setBackground(java.awt.Color.cyan.darker());
        main.setBackground(java.awt.Color.blue.darker());
        GridBagConstraints c = new GridBagConstraints();
        cd = new JButton("Course Detail");
        atten = new JButton("Attendance");
        marks = new JButton("Marks Summary");
        cd.setVisible(false);
        atten.setVisible(false);
        marks.setVisible(false);
        home=new JButton("Home Page");
        JLabel intro=new JLabel("Welcome " + CurrentStudentList.get(0).getFirst_name() + " " + CurrentStudentList.get(0).getSecond_name());
        north.add(intro,BorderLayout.CENTER);
        c.anchor = new GridBagConstraints().LINE_END;
        c.insets = new Insets(3, 3, 3, 3);
        c.gridx = 0;
        c.gridy = 0;
        north2.add(home,c);
        ArrayList<JButton> buttonList = new ArrayList<JButton>();
        ArrayList<JLabel> labelList1 = new ArrayList<JLabel>();
        ArrayList<JLabel> labelList2 = new ArrayList<JLabel>();
        for (int i = 0; i < CurrentStudentList.get(0).getCourseList().size(); i++) {
            JButton button = new JButton(CurrentStudentList.get(0).getCourseList().get(i).getName());
            buttonList.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String data=button.getText();
                    for(int j=0;j<CurrentStudentList.get(0).getCourseList().size();j++){
                        counter=0;
                        if(data.equals(CurrentStudentList.get(0).getCourseList().get(j).getName())){
                            counter=j;
                            break;
                        }
                    }
                    
                    center.setVisible(false);
                    courseDetail(counter);
                    viewAttendance(counter);
                    viewMarkSummary(counter);
                    cdetail.setVisible(true);
                }
            });
            center.add(button, c);
            c.gridy++;
        }
        c.gridx = 1;
        c.gridy = 0;
        for (int i = 0; i < CurrentStudentList.get(0).getCourseList().size(); i++) {
            JLabel label = new JLabel(CurrentStudentList.get(0).getCourseList().get(i).getT().getFirst_name() + CurrentStudentList.get(0).getCourseList().get(i).getT().getSecond_name());
            labelList1.add(label);
            center.add(label, c);
            c.gridy++;
        }
        c.gridx = 2;
        c.gridy = 0;
        String s;
        for (int i = 0; i < CurrentStudentList.get(0).getCourseList().size(); i++) {
            s = percentage(CurrentStudentList.get(0).getCourseList().get(i).getPresents()) + "%";
            JLabel label = new JLabel(s);
            labelList2.add(label);
            center.add(label, c);
            c.gridy++;
        }
        cd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                center.setVisible(false);
                att.setVisible(false);
                markspanel.setVisible(false);
                courseDetail(counter);
                cdetail.setVisible(true);
            }
        });
        atten.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                center.setVisible(false);
                viewAttendance(counter);
                att.setVisible(true);
                markspanel.setVisible(false);
                cdetail.setVisible(false);
            }
        });
        marks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                center.setVisible(false);
                att.setVisible(false);
                viewMarkSummary(counter);
                markspanel.setVisible(true);
                cdetail.setVisible(false);
            }
        });
        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                center.setVisible(true);
                att.setVisible(false);
                markspanel.setVisible(false);
                cdetail.setVisible(false);
            }
        });

    }

    public void courseDetail(int index) {
        cd.setVisible(true);
        atten.setVisible(true);
        marks.setVisible(true);
        JLabel name = new JLabel("Course Name : ");
        JLabel code = new JLabel("Course Code : ");
        JLabel creH = new JLabel("Credit Hour : ");
        JLabel tec = new JLabel("Teacher Name : ");
        JLabel courseName = new JLabel(CurrentStudentList.get(0).getCourseList().get(index).getName());
        JLabel courseCode = new JLabel(CurrentStudentList.get(0).getCourseList().get(index).getCode());
        JLabel courseCreH = new JLabel(CurrentStudentList.get(0).getCourseList().get(index).getCreditHour());
        JLabel courseteacher = new JLabel(CurrentStudentList.get(0).getCourseList().get(index).getT().getFirst_name() + CurrentStudentList.get(0).getCourseList().get(index).getT().getSecond_name());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(3, 3, 3, 3);
        c.gridx = 0;
        c.gridy = 0;
        cdetail.add(cd,c);
        c.gridx++;
        cdetail.add(atten,c);
        c.gridx++;
        cdetail.add(marks,c);
        c.gridx++;
        c.anchor = new GridBagConstraints().LINE_END;
        c.gridx = 0;
        c.gridy = 1;
        cdetail.add(name, c);
        c.gridy++;
        cdetail.add(code, c);
        c.gridy++;
        cdetail.add(tec, c);
        c.gridy++;
        cdetail.add(creH, c);
        c.gridy++;
        c.gridx = 1;
        c.gridy = 1;
        cdetail.add(courseName, c);
        c.gridy++;
        cdetail.add(courseCode, c);
        c.gridy++;
        cdetail.add(courseCreH, c);
        c.gridy++;
        cdetail.add(courseteacher, c);
        c.gridy++;

    }

    public void viewAttendance(int index) {
        cd.setVisible(true);
        atten.setVisible(true);
        marks.setVisible(true);
        JLabel Total = new JLabel("Total Classes : ");
        JLabel pre = new JLabel("Presents : ");
        JLabel abs = new JLabel("Absents : ");
        JLabel per = new JLabel("Percentage : ");
        JLabel classes = new JLabel("30");
        JLabel presnt = new JLabel("" + CurrentStudentList.get(0).getCourseList().get(index).getPresents());
        JLabel absnt = new JLabel("" + CurrentStudentList.get(0).getCourseList().get(index).getAbsents());
        JLabel percent = new JLabel(percentage(CurrentStudentList.get(0).getCourseList().get(index).getPresents()) + "%");
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(3, 3, 3, 3);
        c.gridx = 0;
        c.gridy = 0;
        att.add(cd,c);
        c.gridx++;
        att.add(atten,c);
        c.gridx++;
        att.add(marks,c);
        c.gridx++;
        c.anchor = new GridBagConstraints().LINE_END;
        c.gridx = 0;
        c.gridy = 1;
        att.add(Total, c);
        c.gridy++;
        att.add(pre, c);
        c.gridy++;
        att.add(abs, c);
        c.gridy++;
        att.add(per, c);
        c.gridy++;
        c.gridx = 1;
        c.gridy = 1;
        att.add(classes, c);
        c.gridy++;
        att.add(presnt, c);
        c.gridy++;
        att.add(absnt, c);
        c.gridy++;
        att.add(percent, c);
        c.gridy++;
    }

    public void viewMarkSummary(int index) {
        cd.setVisible(true);
        atten.setVisible(true);
        marks.setVisible(true);
        JLabel Quiz = new JLabel("Quiz ");
        JLabel Assignment = new JLabel("Assignment ");
        JLabel Sessional = new JLabel("Sessional ");
        JLabel Terminal = new JLabel("Terminal ");
        ArrayList<JLabel> labelList1 = new ArrayList<JLabel>();
        JLabel classes = new JLabel("30");
        JLabel presnt = new JLabel("" + CurrentStudentList.get(0).getCourseList().get(index).getPresents());
        JLabel absnt = new JLabel("" + CurrentStudentList.get(0).getCourseList().get(index).getAbsents());
        JLabel percent = new JLabel(CurrentStudentList.get(0).getCourseList().get(index).getPresents() + "%");
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(3, 3, 3, 3);
        c.gridx = 0;
        c.gridy = 0;
        markspanel.add(cd,c);
        c.gridx++;
        markspanel.add(atten,c);
        c.gridx++;
        markspanel.add(marks,c);
        c.gridx++;
        c.anchor = new GridBagConstraints().LINE_END;
        c.gridx = 0;
        c.gridy = 1;
        markspanel.add(Quiz, c);
        c.gridy++;
        c.gridx = 0;
        c.gridy++;
        double[] qm = CurrentStudentList.get(0).getCourseList().get(index).getQuizMarks();
        for (int i = 0; i < 4; i++) {
            JLabel label1 = new JLabel("Quiz " + (i + 1) + " : ");
            markspanel.add(label1, c);
            c.gridx = 1;
            JLabel label2 = new JLabel("" + qm[i]);
            markspanel.add(label2, c);
            c.gridx = 0;
            c.gridy++;
        }
        att.add(Assignment, c);
        double[] ass = CurrentStudentList.get(0).getCourseList().get(index).getAssignmentMarks();
        for (int i = 0; i < 4; i++) {
            JLabel label1 = new JLabel("Assignment " + (i + 1) + " : ");
            markspanel.add(label1, c);
            c.gridx = 1;
            JLabel label2 = new JLabel("" + ass[i]);
            markspanel.add(label2, c);
            c.gridx = 0;
            c.gridy++;
        }
        c.gridy++;
        att.add(Sessional, c);
        c.gridy++;
        double[] sess = CurrentStudentList.get(0).getCourseList().get(index).getSeasionalMarks();
        for (int i = 0; i < 2; i++) {
            JLabel label1 = new JLabel("Sessional " + (i + 1) + " : ");
            markspanel.add(label1, c);
            c.gridx = 1;
            JLabel label2 = new JLabel("" + sess[i]);
            markspanel.add(label2, c);
            c.gridx = 0;
            c.gridy++;
        }
        att.add(Terminal);
        JLabel ter = new JLabel("Terminal ");
        markspanel.add(ter, c);
        c.gridy++;
        c.gridx = 1;
        JLabel terM = new JLabel("" + sess[2]);
        att.add(terM, c);
    }

    public double percentage(int p) {
        double per = (p / 30) * 100;
        return per;
    }
}
