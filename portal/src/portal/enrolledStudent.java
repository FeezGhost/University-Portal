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
public class enrolledStudent implements Serializable {
    private String courseID;
    private String regNO;
    ArrayList<course> CourseList = new ArrayList<course>(0);
    ArrayList<student> StudentList = new ArrayList<student>(0);
    public enrolledStudent() {
    }

    public enrolledStudent(String courseID, String regNO) {
        this.courseID = courseID;
        this.regNO = regNO;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getRegNO() {
        return regNO;
    }

    public void setRegNO(String regNO) {
        this.regNO = regNO;
    }
    
}
