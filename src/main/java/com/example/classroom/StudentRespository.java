package com.example.classroom;

import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public class StudentRespository {

    private HashMap<Integer, Student> student;
    private HashMap<Integer, Teacher> teacher;

    public StudentRespository(HashMap<Integer, Student> student, HashMap<Integer, Teacher> teacher) {
        this.student = student;
        this.teacher = teacher;
    }


    //adding a student
    public void addStudent(Student st){
        int id = st.getId();
        student.put(id, st);
    }

    //adding a teacher
    public void addTeacher(Teacher teacher1){
        int id = teacher1.getId();
        teacher.put(id, teacher1);
    }

    // get teacher

    public Teacher getTeacher(int i){
        return teacher.get(i);
    }

    // get student
    public Student getStudent(int id){
        return student.get(id);
    }
}
