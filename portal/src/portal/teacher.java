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
public class teacher extends person implements Serializable {

    protected String id, password, pay;
    protected ArrayList<course> courses;
    public teacher() {
    }

    public teacher(String id, String password, String pay, ArrayList<course> courses) {
        this.id = id;
        this.password = password;
        this.pay = pay;
        this.courses = courses;
    }

    public teacher(String id, String password, String pay, ArrayList<course> courses, String first_name, String second_name, String age, String gender, String address, String email, String phone_no) {
        super(first_name, second_name, age, gender, address, email, phone_no);
        this.id = id;
        this.password = password;
        this.pay = pay;
        this.courses = courses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public ArrayList<course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<course> courses) {
        this.courses = courses;
    }
    
    void display() {

        super.display();

        System.out.println("ID : " + id + "\tPassword : " + password + "\tPay : " + pay);
    }
}
