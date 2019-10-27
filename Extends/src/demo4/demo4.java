package demo4;

import org.junit.Test;

public class demo4 {

    @Test//实现类必须实现接口的普通方法
    public void test1(){
        Student student = new Student();
        student.method1();
    }
    @Test//实现类可以直接调用接口的默认方法,当然也可以覆盖重写默认方法
    public void test2(){
        Student student = new Student();
        student.method2();
    }
    @Test//接口静态方法
    public void test3(){
        Person.method3();
    }

}
