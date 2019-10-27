package demo1;

public class Student extends Person{
    int num = 2;
    int studentNum = 20;

    public void method(){
        System.out.println("子类方法");
    }

    public void methodStudent(){
        System.out.println("子类独有方法");
    }
}
