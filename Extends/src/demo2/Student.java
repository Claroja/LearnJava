package demo2;

public class Student extends Person {
    public Student(){
        System.out.println("Student 无参构造");
    }

    public Student(int num){
        super(num);
        System.out.println("Student 有参构造,父类想调用有参构造,必须使用super()");
    }
}
