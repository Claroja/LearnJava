package demo3;

import org.junit.Test;
/*类(接口)可以做为成员变量来用
* 当使用接口作为成员变量时,要首先实现接口,然后传入接口的实现类*/
public class demo3 {
    @Test
    public void test1(){
        Variable variable = new Variable(10,"wang");
        ClassA classA = new ClassA(variable=variable);

        System.out.println(classA.variable.name);
        System.out.println(classA.variable.age);
    }
}
