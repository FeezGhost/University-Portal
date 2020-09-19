/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portal;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ghost
 */
public class course implements Serializable {
    private String Name;
    private String Code;
    private String CreditHour;
    private String sem;
    private String tecID;
    private teacher t;
    private int presents;
    private int absents;
    private double [] QuizMarks;
    private double [] AssignmentMarks;
    private double [] SeasionalMarks;
    private double TerminalMarks;
    private ArrayList<teacher> TeacherList =TFileClass.readAllData();
    private ArrayList<student> StudentList ;
    public course() {
    }

    public course(String Name, String Code, String CreditHour, String sem, String tecID) {
        this.Name = Name;
        this.Code = Code;
        this.CreditHour = CreditHour;
        this.sem = sem;
        this.tecID = tecID;
        for(int i =0; i<TeacherList.size();i++){
            if(this.tecID.equals(TeacherList.get(i).getId())){
                t=TeacherList.get(i);
            }
        }
        StudentList =new ArrayList<student>();
        ArrayList<student> StudentList2=SFileClass.readAllData();
        for(int i =0; i<StudentList2.size();i++){
            if(this.getCode().equals(StudentList2.get(i).getCourseList().get(i).getCode())){
                StudentList.add(StudentList2.get(i));
            }
        }
    }

    public course(String Name, String Code, String CreditHour, String sem, String tecID, teacher t, int presents, int absents, double[] QuizMarks, double[] AssignmentMarks, double[] SeasionalMarks, double TerminalMarks) {
        this.Name = Name;
        this.Code = Code;
        this.CreditHour = CreditHour;
        this.sem = sem;
        this.tecID = tecID;
        this.t = t;
        this.presents = presents;
        this.absents = absents;
        this.QuizMarks = QuizMarks;
        this.AssignmentMarks = AssignmentMarks;
        this.SeasionalMarks = SeasionalMarks;
        this.TerminalMarks = TerminalMarks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getCreditHour() {
        return CreditHour;
    }

    public void setCreditHour(String CreditHour) {
        this.CreditHour = CreditHour;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public String getTecID() {
        return tecID;
    }

    public void setTecID(String tecID) {
        this.tecID = tecID;
    }

    public teacher getT() {
        return t;
    }

    public void setT(teacher t) {
        this.t = t;
    }

    public int getPresents() {
        return presents;
    }

    public void setPresents(int presents) {
        this.presents = presents;
    }

    public int getAbsents() {
        return absents;
    }

    public void setAbsents(int absents) {
        this.absents = absents;
    }

    public double[] getQuizMarks() {
        return QuizMarks;
    }

    public void setQuizMarks(double[] QuizMarks) {
        this.QuizMarks = QuizMarks;
    }

    public double[] getAssignmentMarks() {
        return AssignmentMarks;
    }

    public void setAssignmentMarks(double[] AssignmentMarks) {
        this.AssignmentMarks = AssignmentMarks;
    }

    public double[] getSeasionalMarks() {
        return SeasionalMarks;
    }

    public void setSeasionalMarks(double[] SeasionalMarks) {
        this.SeasionalMarks = SeasionalMarks;
    }

    public double getTerminalMarks() {
        return TerminalMarks;
    }

    public void setTerminalMarks(double TerminalMarks) {
        this.TerminalMarks = TerminalMarks;
    }

    public ArrayList<teacher> getTeacherList() {
        return TeacherList;
    }

    public void setTeacherList(ArrayList<teacher> TeacherList) {
        this.TeacherList = TeacherList;
    }
    public ArrayList<student> getStudentList() {
        return StudentList;
    }

    public void setStudentList(ArrayList<student> StudentList) {
        this.StudentList = StudentList;
    }

}