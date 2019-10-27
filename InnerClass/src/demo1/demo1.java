package demo1;

import org.junit.Test;
/*
* public>protected>private
* 1.外部类:public
* 2.成员内部类:public protected private
* 3.局部内部类什么都不能写*/
public class demo1 {
    @Test
    public void test1(){
        //外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称()
        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();


    }
}
