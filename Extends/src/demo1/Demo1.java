package demo1;

import org.junit.Test;
/*继承是is-a的关系,既子类是父类的一种,父类一般被称为超类(super.class)*/

public class Demo1 {
    ////变量的继承和方法的继承的规则是一样的
    //子会继承父类的属性,personName只在父类定义,但是子类也可以访问
    @Test
    public void test1() {
        Person person = new Person();
        System.out.println(person.personName);
    }

    //重名的属性,会优先访问本类中的成员变量
    @Test
    public void test2() {
        Student student = new Student();
        System.out.println(student.name);
    }

    //方法中直接使用变量并,成员变量用this,父成员变量用super
    @Test
    public void test3(){
        Student student = new Student();
        student.hello();
    }
}
