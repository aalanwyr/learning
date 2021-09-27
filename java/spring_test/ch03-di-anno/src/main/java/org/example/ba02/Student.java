package org.example.ba01;

import org.springframework.stereotype.Component;


/**
 * @Component(value = "myStudent")
 * public cla 用于创建对象 value的值是唯一的，创建的对象在
 * spring容器中是唯一的，因为spring底层是个map
 * 位置：在类的上面
 * 使用value属性，指定对象名称
 * 不指定对象 就是类名的首字母小写
 */
@Component("mystudent")
public class Student {

    private String name;

    private Integer age;

    public Student() {
        System.out.println("调用student无参构造方法");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
