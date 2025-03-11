package designPatterns.creationalPatterns.builderPattern;

import java.util.*;

public class Student {
    public int rollNo;
    public String name;
    public List<String> subjects;

    public Student(StudentBuilder builder) {
        this.rollNo = builder.rollNo;
        this.name = builder.name;
        this.subjects = builder.subjects;
    } 
}
