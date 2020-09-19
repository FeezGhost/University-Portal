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
public class Semester implements Serializable{
    private String sem;
    ArrayList<course> CourseList = new ArrayList<course>(0);

    public Semester() {
    }

    public Semester(String sem) {
        this.sem = sem;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public ArrayList<course> getCourseList() {
        return CourseList;
    }

    public void setCourseList(ArrayList<course> CourseList) {
        this.CourseList = CourseList;
    }
    
    
}
