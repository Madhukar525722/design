package designPatterns.creationalPatterns.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {
    
    @Override
    public MBAStudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Management");
        this.subjects = subjects;
        return this;
    }
}
