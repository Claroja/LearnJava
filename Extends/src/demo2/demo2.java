package demo2;

import org.junit.Test;


/*因为构造方法必须和类名相同,所以子类是无法继承父类的构造方法的.
子类构造方法必须调用父类的构造方法,先构造父类,在构造子类.
子类中通过super()方法调用父类的构造方法,super()就是父类的构造方法.
* 无参构造是默认调用
* 有参构造需要手动*/
public class demo2 {

    //子类的无参构造会默认调用父类的无参构造
    @Test
    public void test1(){
        Student student = new Student();
    }
    @Test
    public void test2(){
        Student student = new Student(1);
    }
}

