package designPatterns.creationalPatterns.builderPattern;

public class Main {
    public static void main (String[] args){
        StudentBuilder student1Temp = new EngineeringStudentBuilder();
        student1Temp.setRollNumber(1).setName("Ramesh").setSubjects();
        Student student1 = student1Temp.build();
        for(int i=0;i<student1.subjects.size();i++){
            System.out.println(student1.subjects.get(i));
        }

        StudentBuilder student2Temp = new MBAStudentBuilder();
        student2Temp.setRollNumber(2).setName("Suresh").setSubjects();
        Student student2 = student2Temp.build();
        for(int i=0;i<student2.subjects.size();i++){
            System.out.println(student2.subjects.get(i));
        }
    }
}
