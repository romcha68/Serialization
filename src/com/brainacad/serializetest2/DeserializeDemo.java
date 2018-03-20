package com.brainacad.serializetest2;

import com.brainacad.serializetest1.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by User on 20.03.2018.
 */
public class DeserializeDemo {
    public static void main(String[] args) {
        Employee employee = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            employee = (Employee) in.readObject();
            System.out.println("Employee saved!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(employee);
    }
}
