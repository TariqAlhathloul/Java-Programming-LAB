package org.example;


class Person{
    protected int age;
    public void setAge(int a){this.age=a;}
    public void greet(){System.out.println("Hello");}
}
class Student extends Person{
    public void goToClasses(){System.out.println("I'm going to class");}
    public void showAge(){System.out.printf("%s%d%s%n","My age is: ",age," years old");}
}
class Teacher extends Person{
    private String subject;
    public void explain(){System.out.println("Explanation begins");}
}

public class StudentAndTeacherTest {
    public static void main(String[] args) {
        Person p=new Person();
        p.greet();

        Student s=new Student();
        s.setAge(21);
        s.greet();
        s.showAge();

        Teacher t=new Teacher();
        t.setAge(40);
        t.greet();
        t.explain();
    }
}