package designPatterns.creationalPatterns.prototypePattern;

public class Main {
    public static void main(String args[]){
        Student obj = new Student(0, 0);
        Student cloneObj = (Student) obj.clone();
        System.out.println("The student with roll no" + cloneObj.rollNo + " is of age:" + cloneObj.age);
    }
}
