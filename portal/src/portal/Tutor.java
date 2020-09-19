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
public class Tutor implements Serializable{
    private String name;
    ArrayList<course> CourseList = new ArrayList<course>(0);

    public Tutor() {
    }

    public Tutor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<course> getCourseList() {
        return CourseList;
    }

    public void setCourseList(ArrayList<course> CourseList) {
        this.CourseList = CourseList;
    }
    
}
