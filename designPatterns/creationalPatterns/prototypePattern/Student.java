package designPatterns.creationalPatterns.prototypePattern;

public class Student implements Prototype {
    public int age;
    public int rollNo;

    Student(int age, int rollNo){
        this.age = age;
        this.rollNo = rollNo;
    }

    @Override
    public Prototype clone() {
        return new Student(age, rollNo);
    }
}
