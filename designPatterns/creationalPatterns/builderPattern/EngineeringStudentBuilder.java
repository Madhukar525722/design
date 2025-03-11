package designPatterns.creationalPatterns.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {
    @Override
    public EngineeringStudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("Science");
        this.subjects = subjects;
        return this;
    }
}
