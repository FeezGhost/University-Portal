/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portal;

import java.io.Serializable;

/**
 *
 * @author Ghost
 */
public class person implements Serializable {

    protected String first_name;
    protected String second_name;
    protected String age;
    protected String gender;
    protected String address;
    protected String email;
    protected String phone_no;

    public person() {
        this.first_name = "0";
        this.second_name = "0";
        this.age = "0";
        this.gender = "0";
        this.address = "0";
        this.email = "0";
        this.phone_no = "0";
    }

    public person(String first_name, String second_name, String age, String gender, String address, String email, String phone_no) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.phone_no = phone_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    void display() {
        System.out.println("First Name : " + first_name + "\tSecond Name : " + second_name + "\tAge : " + age + "\tGender : " + gender + "\tAddress : " + address + "\tEmail : " + email + "\tContact Number : " + phone_no);
    }
}
