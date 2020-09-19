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
public class admin extends person implements Serializable {

    protected String id, password;

    public admin() {
    }

    public admin(String id, String password, String first_name, String second_name, String age, String gender, String address, String email, String phone_no) {
        super(first_name, second_name, age, gender, address, email, phone_no);
        this.id = id;
        this.password = password;
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

    void display() {

        super.display();

        System.out.println("ID : " + id + "\tPassword : " + password);
    }
}
