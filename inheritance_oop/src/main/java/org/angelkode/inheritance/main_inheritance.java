package org.angelkode.inheritance;

import java.util.ArrayList;

public class main_inheritance {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Angel");
        student.setSurname("Kode");

        Teacher teacher = new Teacher();
        teacher.setName("Angel Teacher");
        teacher.setSubjects(new ArrayList<>());

        System.out.println(teacher.getSubjectAt(0));
        System.out.println(teacher.getSubjectAt(1));

        Person studentTwo = new Student();
        ((Student)studentTwo).setGrades(0,8.3);
    }
}
