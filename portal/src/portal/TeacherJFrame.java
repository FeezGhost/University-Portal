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
import static portal.StudenJFrame.counter;

/**
 *
 * @author Ghost
 */
public class TeacherJFrame extends JFrame {

    static int counter = 0;
    static int counter2 = 0;
    private JButton home, sd, atten, marks;
    private JPanel main, north, north2, south, west, east, center, sdetail, att, markspanel;
    private ArrayList<teacher> CurrentTeacherList = TFileClass.readAllDataCurrentTeacher();

    TeacherJFrame() {
        creatview();
        this.setTitle("Welcome " + CurrentTeacherList.get(0).getFirst_name() + " " + CurrentTeacherList.get(0).getSecond_name());
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
        sdetail = new JPanel(new GridBagLayout());
        att = new JPanel(new GridBagLayout());
        north2 = new JPanel(new GridBagLayout());
        markspanel = new JPanel(new GridBagLayout());
        north = new JPanel(new BorderLayout());
        south = new JPanel(new GridBagLayout());
        main.add(north, BorderLayout.NORTH);
        main.add(center, BorderLayout.CENTER);
        main.add(sdetail, BorderLayout.CENTER);
        main.add(att, BorderLayout.CENTER);
        main.add(markspanel, BorderLayout.CENTER);
        north.add(north2, BorderLayout.SOUTH);
        sdetail.setVisible(false);
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
        sd = new JButton("Student Detail");
        atten = new JButton("Attendance");
        marks = new JButton("Marks Summary");
        sd.setVisible(false);
        atten.setVisible(false);
        marks.setVisible(false);
        home = new JButton("Home Page");
        JLabel intro = new JLabel("Welcome " + CurrentTeacherList.get(0).getFirst_name() + " " + CurrentTeacherList.get(0).getSecond_name());
        north.add(intro, BorderLayout.CENTER);
        c.anchor = new GridBagConstraints().LINE_END;
        c.insets = new Insets(3, 3, 3, 3);
        c.gridx = 0;
        c.gridy = 0;
        north2.add(home, c);
        ArrayList<JButton> buttonList = new ArrayList<JButton>();
        ArrayList<JButton> subButtonList = new ArrayList<JButton>();
        ArrayList<JLabel> labelList1 = new ArrayList<JLabel>();
        ArrayList<JLabel> labelList2 = new ArrayList<JLabel>();
        for (int i = 0; i < CurrentTeacherList.get(0).getCourses().size(); i++) {
            JButton sbutton = new JButton(CurrentTeacherList.get(0).getCourses().get(i).getName());
            buttonList.add(sbutton);
            sbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String data = sbutton.getText();
                    for (int j = 0; j < CurrentTeacherList.get(0).getCourses().size(); j++) {
                        counter2 = 0;
                        if (data.equals(CurrentTeacherList.get(0).getCourses().get(j).getName())) {
                            counter2 = j;
                            break;
                        }
                    }
                    for (int i = 0; i < CurrentTeacherList.get(0).getCourses().get(i).getStudentList().size(); i++) {
                        JButton button = new JButton(CurrentTeacherList.get(0).getCourses().get(i).getStudentList().get(i).getReg_no());
                        subButtonList.add(button);
                        button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String data = button.getText();
                                for (int j = 0; j < CurrentTeacherList.get(0).getCourses().get(counter2).getStudentList().size(); j++) {
                                    counter = 0;
                                    if (data.equals(CurrentTeacherList.get(0).getCourses().get(counter2).getStudentList().get(j).getReg_no())) {
                                        counter = j;
                                        break;
                                    }
                                }
                                center.setVisible(false);
                                studentDetail(counter2,counter);
                                setAttendance(counter);
                                setMarkSummary(counter);
                                sdetail.setVisible(true);
                            }
                        });
                    }
                }
            });

            center.add(sbutton, c);
            c.gridy++;
        }
        c.gridx = 1;
        c.gridy = 0;
        for (int i = 0;i < CurrentTeacherList.get(0).getCourses().size(); i++) {
            JLabel label = new JLabel(CurrentTeacherList.get(0).getCourses().get(i).getCode());
            labelList1.add(label);
            center.add(label, c);
            c.gridy++;
        }
        c.gridx = 2;
        c.gridy = 0;
        String s;
        for (int i = 0;
                i < CurrentTeacherList.get(
                        0).getCourses().size(); i++) {
            s = ("" + CurrentTeacherList.get(0).getCourses().get(i).getCreditHour());
            JLabel label = new JLabel(s);
            labelList2.add(label);
            center.add(label, c);
            c.gridy++;
        }

        sd.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e
            ) {
                center.setVisible(false);
                att.setVisible(false);
                markspanel.setVisible(false);
                studentDetail(counter,counter2);
                sdetail.setVisible(true);
            }
        }
        );
        atten.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e
            ) {
                center.setVisible(false);
                setAttendance(counter);
                att.setVisible(true);
                markspanel.setVisible(false);
                sdetail.setVisible(false);
            }
        }
        );
        marks.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e
            ) {
                center.setVisible(false);
                att.setVisible(false);
                setMarkSummary(counter);
                markspanel.setVisible(true);
                sdetail.setVisible(false);
            }
        }
        );
        home.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e
            ) {
                center.setVisible(true);
                att.setVisible(false);
                markspanel.setVisible(false);
                sdetail.setVisible(false);
            }
        }
        );

    }

    public void studentDetail(int index,int index2) {
        sd.setVisible(true);
        atten.setVisible(true);
        marks.setVisible(true);
        JLabel name = new JLabel("Student Name : ");
        JLabel reg = new JLabel("Student Registration Number : ");
        JLabel sem = new JLabel("Student Semester : ");
        JLabel sec = new JLabel("Student Section : ");
        JLabel sName = new JLabel(CurrentTeacherList.get(0).getCourses().get(index).getStudentList().get(index2).getFirst_name()+CurrentTeacherList.get(0).getCourses().get(index).getStudentList().get(index2).getSecond_name());
        JLabel sReg = new JLabel(CurrentTeacherList.get(0).getCourses().get(index).getStudentList().get(index2).getReg_no());
        JLabel sSem = new JLabel(CurrentTeacherList.get(0).getCourses().get(index).getStudentList().get(index2).getSem());
        JLabel sSec = new JLabel(CurrentTeacherList.get(0).getCourses().get(index).getStudentList().get(index2).getSec());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(3, 3, 3, 3);
        c.gridx = 0;
        c.gridy = 0;
        sdetail.add(sd, c);
        c.gridx++;
        sdetail.add(atten, c);
        c.gridx++;
        sdetail.add(marks, c);
        c.gridx++;
        c.anchor = new GridBagConstraints().LINE_END;
        c.gridx = 0;
        c.gridy = 1;
        sdetail.add(name, c);
        c.gridy++;
        sdetail.add(reg, c);
        c.gridy++;
        sdetail.add(sem, c);
        c.gridy++;
        sdetail.add(sec, c);
        c.gridy++;
        c.gridx = 1;
        c.gridy = 1;
        sdetail.add(sName, c);
        c.gridy++;
        sdetail.add(sReg, c);
        c.gridy++;
        sdetail.add(sSem, c);
        c.gridy++;
        sdetail.add(sSec, c);
        c.gridy++;

    }

    public void setAttendance(int index) {
        sd.setVisible(true);
        atten.setVisible(true);
        marks.setVisible(true);
        JLabel Total = new JLabel("Total Classes : ");
        JLabel pre = new JLabel("Presents : ");
        JLabel abs = new JLabel("Absents : ");
        JLabel per = new JLabel("Percentage : ");
        JLabel classes = new JLabel("30");
        JLabel presnt = new JLabel("" + CurrentTeacherList.get(0).getCourses().get(index).getPresents());
        JLabel absnt = new JLabel("" + CurrentTeacherList.get(0).getCourses().get(index).getAbsents());
        JLabel percent = new JLabel(percentage(CurrentTeacherList.get(0).getCourses().get(index).getPresents()) + "%");
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(3, 3, 3, 3);
        c.gridx = 0;
        c.gridy = 0;
        att.add(sd, c);
        c.gridx++;
        att.add(atten, c);
        c.gridx++;
        att.add(marks, c);
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

    public void setMarkSummary(int index) {
        sd.setVisible(true);
        atten.setVisible(true);
        marks.setVisible(true);
        JLabel Quiz = new JLabel("Quiz ");
        JLabel Assignment = new JLabel("Assignment ");
        JLabel Sessional = new JLabel("Sessional ");
        JLabel Terminal = new JLabel("Terminal ");
        ArrayList<JLabel> labelList1 = new ArrayList<JLabel>();
        JLabel classes = new JLabel("30");
        JLabel presnt = new JLabel("" + CurrentTeacherList.get(0).getCourses().get(index).getPresents());
        JLabel absnt = new JLabel("" + CurrentTeacherList.get(0).getCourses().get(index).getAbsents());
        JLabel percent = new JLabel(CurrentTeacherList.get(0).getCourses().get(index).getPresents() + "%");
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(3, 3, 3, 3);
        c.gridx = 0;
        c.gridy = 0;
        markspanel.add(sd, c);
        c.gridx++;
        markspanel.add(atten, c);
        c.gridx++;
        markspanel.add(marks, c);
        c.gridx++;
        c.anchor = new GridBagConstraints().LINE_END;
        c.gridx = 0;
        c.gridy = 1;
        markspanel.add(Quiz, c);
        c.gridy++;
        c.gridx = 0;
        c.gridy++;
        double[] qm = CurrentTeacherList.get(0).getCourses().get(index).getQuizMarks();
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
        double[] ass = CurrentTeacherList.get(0).getCourses().get(index).getAssignmentMarks();
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
        double[] sess = CurrentTeacherList.get(0).getCourses().get(index).getSeasionalMarks();
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
