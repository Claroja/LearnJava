package demo3;
/*
* 1.不能直接new抽象类
* 2.抽象必须被继承
* 3.子类必须重写所有父类的抽象方法*/
public class Student extends Person{
    @Override
    public void say() {
        System.out.println("hello");
    }
}
