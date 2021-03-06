package com.brainacad.serializetest1;

import java.io.Serializable;

/**
 * Created by User on 20.03.2018.
 */
public class Employee implements Serializable {
    private String name;
    private String address;
    private transient int SSN;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee:{\n\tname:" + name +
                "\n\taddress:" + address +
                "\n\tSSN:" + SSN +
                "\n\tnumber:" + number + "\n}";
    }
}
