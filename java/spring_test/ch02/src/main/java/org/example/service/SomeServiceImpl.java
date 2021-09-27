package org.example.service;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.example.service.impl.SomeService;

public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl(){
        super();
        System.out.println("SomeServiceImpl 无参构造函数");
    }
    @Override
    public void doSome() {
        System.out.println("----业务方法-----");
    }
}
