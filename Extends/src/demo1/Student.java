package demo1;

public class Student extends Person {
    public String studentName = "studentName";
    public String name = "name in student";

    public void hello(){
        String name = "name in Student.hello()";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
