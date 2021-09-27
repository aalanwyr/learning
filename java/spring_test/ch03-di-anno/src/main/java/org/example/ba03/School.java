package org.example.service.ba02;

import javax.swing.*;

public class School {
    private String name;
    private String address;

    public School() {
        System.out.println("调用构造函数school");


    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
