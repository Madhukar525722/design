package designPatterns.creationalPatterns.builderPattern;

import java.util.List;

public abstract class StudentBuilder {
    public int rollNo;
    public String name;
    public List<String> subjects;

    public StudentBuilder setRollNumber(int roll){
        this.rollNo = roll;
        return this;
    }

    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    public abstract StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }

}
