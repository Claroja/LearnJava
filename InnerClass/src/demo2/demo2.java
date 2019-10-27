package demo2;

import org.junit.Test;

/*如果接口的实现类(或者父类的子类)只需要使用唯一一次,可以不定义该实现类(子类),直接用匿名内部类,一次性使用
* 格式:
* 接口名 对象名 = new 接口名称();*/
public class demo2 {

    @Test
    public void test1(){
        Person obj = new Person() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现的方法");
            }
        };
        obj.method();
    }
}
