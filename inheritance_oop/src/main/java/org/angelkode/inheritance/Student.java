package org.angelkode.inheritance;

import java.util.List;

public final class Student extends Person {
    private String collegeName;
    private List<Double> grades;

    Student(){
        super("","",0);
    }
    @Override
    public String getName(){
        return this.name + ", I'm a student";
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setGrades(int index, Double grade) {
        this.grades.set(index, grade);
    }

    public double getGradeAt(int index) {
        return this.grades.get(index);
    }
}
