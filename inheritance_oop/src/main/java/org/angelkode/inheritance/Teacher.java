package org.angelkode.inheritance;

import java.util.List;

public final class Teacher extends Person{
    private List<String> subjects;

    Teacher(){
        super("","",0);
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public String getSubjectAt(int index) {
        if(index >= subjects.size()) return "Index is higher than the size of the subjects of " + this.getName();

        return this.subjects.get(index);
    }
}
