package org.example.service.ba01;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("调用构造方法");
        //this.name = name;
        //this.age = age;
    }

    public void setAge(int age) {
        System.out.println("调用setAge");
        this.age = age;
    }

    public void setName(String name) {
        System.out.println("调用setName");
        this.name = name;
    }
    public void setEmail(String email){
        System.out.println("调用setEmail");
    }
    @Override
    public String toString() {
        return "Student{"+
                "name="+name+'\''+
                ",age="+age+
                "}";
    }
}
