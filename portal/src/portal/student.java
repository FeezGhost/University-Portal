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
public class student extends person implements Serializable {

    protected String reg_no, password, fees, sem, sec;
    protected ArrayList<course> courseList;

    public student() {
    }

    public student(String reg_no, String password, String fees, String sem, String sec) {
        this.reg_no = reg_no;
        this.password = password;
        this.fees = fees;
        this.sem = sem;
        this.sec = sec;
    }

    public student(String reg_no, String password, String fees, String sem, String sec, ArrayList<course> courseList) {
        this.reg_no = reg_no;
        this.password = password;
        this.fees = fees;
        this.sem = sem;
        this.sec = sec;
        this.courseList = courseList;
    }

    public String getReg_no() {
        return reg_no;
    }

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public ArrayList<course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<course> courseList) {
        this.courseList = courseList;
    }

    public student(String reg_no, String password, String fees, String sem, String sec, ArrayList<course> courseList, String first_name, String second_name, String age, String gender, String address, String email, String phone_no) {
        super(first_name, second_name, age, gender, address, email, phone_no);
        this.reg_no = reg_no;
        this.password = password;
        this.fees = fees;
        this.sem = sem;
        this.sec = sec;
        this.courseList = courseList;
    }


    void display() {

        super.display();

        System.out.println("Registration Number : " + reg_no + "\tSemester : " + sem + "\tSection : " + sec + "\tPassword : " + password + "\tFee : " + fees);
    }
}
