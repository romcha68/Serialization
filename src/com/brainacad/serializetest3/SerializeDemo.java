package com.brainacad.serializetest3;

import com.brainacad.serializetest1.Employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by User on 20.03.2018.
 */
public class SerializeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Lucile");
        employee.setAddress("Chicago");
        employee.setSSN(123456);
        employee.setNumber(654321);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            out.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
