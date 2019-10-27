package demo4;
/*
* Java7 : 常量,抽象方法
* Java8 : 默认方法(可以有方法体),静态方法
* Java9 : 私有方法
*
* 接口不能直接使用,要有子类来实现,implements
* 接口的实现类必须重写所有的抽象方法
*
* 接口的成员变量必须被public static final进行修饰(默认),必须赋值,本质上就是常量*/
public interface Person {
    public static final int NUM = 10;//static修饰可以通过接口直接使用,final不可变,所以必须大写



    public abstract void method1();//接口中的方法必须是 public abstract(默认)
    public default void method2(){
        System.out.println("接口默认的方法");
    }
    public static void method3(){
        System.out.println("接口静态方法");
    }
    //私有方法主要用来解决接口内部重复方法,可用私有方法写公有部分,被其他方法调用,而且该方法不应该被子类实现
    //只有Java9中才能够使用
//    private int method4(){
//        System.out.println("接口普通私有方法");
//    }
//    private static int method5(){
//        System.out.println("接口静态私有方法");
//    }
}
