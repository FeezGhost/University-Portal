/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portal;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Ghost
 */
public class TFileClass {

    public static ArrayList<teacher> readAllData() {
        //  ArrayList initialized with size 0
        ArrayList<teacher> TeacherList = new ArrayList<teacher>(0);
        // Input stream
        ObjectInputStream inputStream = null;
        try {
            // open file for reading
            inputStream = new ObjectInputStream(new FileInputStream("teacher.ser"));
            // End Of File flag
            boolean EOF = false;
            // Keep reading file until file ends
            while (!EOF) {
                try {
                    // read object and type cast into CarDetails object
                    teacher myObj = (teacher) inputStream.readObject();
                    // add object into ArrayList
                    TeacherList.add(myObj);
                    //System.out.println("Read: " + myObj.getName());
                } catch (ClassNotFoundException e) {
                    //System.out.println("Class not found");
                } catch (EOFException end) {
                    // EOFException is raised when file ends
                    // set End Of File flag to true so that loop exits
                    EOF = true;
                }
            }
        } catch (FileNotFoundException e) {
            //System.out.println("Cannot find file");
        } catch (IOException e) {
            //System.out.println("IO Exception while opening stream");
            //e.printStackTrace();
        } finally { // cleanup code to close stream if it was opened
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                System.out.println("IO Exception while closing file");
            }
        }

        // returns ArrayList
        return TeacherList;
    }

    public static void addArrayListToFile(ArrayList<teacher> TeacherList) {
        ObjectOutputStream outputStream = null;

        try {
            // Read old objects

            // Append new object into existing list
            // Open Stream for writing
            outputStream = new ObjectOutputStream(new FileOutputStream("teacher.ser"));

            // Write all objects (old and new one) into the file
            for (int i = 0; i < TeacherList.size(); i++) {
                outputStream.writeObject(TeacherList.get(i));
            }
        } catch (IOException e) {
            System.out.println("IO Exception while opening file");
        } finally { // cleanup code which closes output stream if its object was created
            try {
                if (outputStream != null) {
                    outputStream.close();
                }

            } catch (IOException e) {
                System.out.println("IO Exception while closing file");
            }
        }
    }
    public static ArrayList<teacher> readAllDataCurrentTeacher() {
        //  ArrayList initialized with size 0
        ArrayList<teacher> TeacherList = new ArrayList<teacher>(0);
        // Input stream
        ObjectInputStream inputStream = null;
        try {
            // open file for reading
            inputStream = new ObjectInputStream(new FileInputStream("CurrentTeacher.ser"));
            // End Of File flag
            boolean EOF = false;
            // Keep reading file until file ends
            while (!EOF) {
                try {
                    // read object and type cast into CarDetails object
                    teacher myObj = (teacher) inputStream.readObject();
                    // add object into ArrayList
                    TeacherList.add(myObj);
                    //System.out.println("Read: " + myObj.getName());
                } catch (ClassNotFoundException e) {
                    //System.out.println("Class not found");
                } catch (EOFException end) {
                    // EOFException is raised when file ends
                    // set End Of File flag to true so that loop exits
                    EOF = true;
                }
            }
        } catch (FileNotFoundException e) {
            //System.out.println("Cannot find file");
        } catch (IOException e) {
            //System.out.println("IO Exception while opening stream");
            //e.printStackTrace();
        } finally { // cleanup code to close stream if it was opened
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                System.out.println("IO Exception while closing file");
            }
        }

        // returns ArrayList
        return TeacherList;
    }

    public static void addArrayListToFileCurrentTeacher(ArrayList<teacher> TeacherList) {
        ObjectOutputStream outputStream = null;

        try {
            // Read old objects

            // Append new object into existing list
            // Open Stream for writing
            outputStream = new ObjectOutputStream(new FileOutputStream("CurrentTeacher.ser"));

            // Write all objects (old and new one) into the file
            for (int i = 0; i < TeacherList.size(); i++) {
                outputStream.writeObject(TeacherList.get(i));
            }
        } catch (IOException e) {
            System.out.println("IO Exception while opening file");
        } finally { // cleanup code which closes output stream if its object was created
            try {
                if (outputStream != null) {
                    outputStream.close();
                }

            } catch (IOException e) {
                System.out.println("IO Exception while closing file");
            }
        }
    }
}
