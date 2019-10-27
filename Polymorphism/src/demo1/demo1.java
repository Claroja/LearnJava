package demo1;

import org.junit.Test;

/*
* 父类应用指向子类对象
* 1.父类名称 对象名 = new 子类名称()
* 2.接口名称 对象名 new 实现类名称()*/
public class demo1 {

    @Test//编译看左边,运行看左边
    public void test1(){

        //向上转型,多态本质就是向上转型
        Person person = new Student();
        System.out.println(person instanceof Student);//判断这个人本质是不是学生
        System.out.println(person.num);//父类和子类都有,但是调用的是父类的num(非多态的情况调用的子类的num)
        System.out.println(person.personNum);//父类独有,调用父类的
//        System.out.println(person.studentNum);//父类没有,不能调用

        //向下转型
        System.out.println(((Student) person).studentNum);//将Student向下转型,调用子类的属性
        System.out.println(((Student) person).num);//将Student向下转型,调用子类中与父类重名的属性
    }

    @Test//编译看左,运行看右
    public void test2(){
        Person person = new Student();
        person.method();//调用子类的重名方法,编译看左边,父类有该方法,编译通过,运行时看右边,子类也有该方法,优先调用子类方法
        person.methodPerson();//子类没有,向上找父类方法//编译看左边,父类有该方法,编译通过,运行看右边,子类没有该方法,所以向上找父类的该方法
//        person.methodStudent();//父类没有该方法不能通过编译//编译看左边,父类没有该方法,所有编译不能通过

        //向下转型
        ((Student) person).methodStudent();//将Person向下转型为Student
    }
}
