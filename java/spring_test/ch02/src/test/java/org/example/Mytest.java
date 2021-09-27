package org.example;

import org.example.service.SomeServiceImpl;
import org.example.service.impl.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Mytest {
    @Test
    public void test01(){
        SomeService service=new SomeServiceImpl();
        service.doSome();
    }

    @Test
    public void test02(){
        //配置文件的名字
        String config="applicationContext.xml";
        //创建了容器 参数是配置文件 去读这个xml 去检索bean 反射创建对象
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        //从容器中获取这个对象 接口类型的 类型进行强转 从而获得这个对象 从map中获取这个对象
        // ac底层是个map
        SomeService service=(SomeService)  ac.getBean("someService");
        service.doSome();
    }

    /**
     * 获取spring 容器中java 对象信息
     * 默认调用无参构造方法
     */
    @Test
    public void test03(){
        String config="applicationContext.xml";
        //创建了容器 参数是配置文件 去读这个xml 去检索bean 反射创建对象
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        int nums=ac.getBeanDefinitionCount();
        System.out.println("容器中定义对象的数量："+nums);
        //获取容器中每个定义的每个对象的名字
        String names[]=ac.getBeanDefinitionNames();//容器中所有对象的名称
        for(String name:names){
            System.out.println(name);
        }
    }

    /**
     * spring 利用无参方式构造出了bean
     */
    @Test
    public void test04(){
        String config="applicationContext.xml";
        //创建了容器 参数是配置文件 去读这个xml 去检索bean 反射创建对象
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Date mydata=(Date) ac.getBean("mydata");
        System.out.println("Date:"+mydata);
    }

}
