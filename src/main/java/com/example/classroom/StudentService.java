package com.example.classroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRespository studentRespository;

    public void addStudent(Student st){
        studentRespository.addStudent(st);
    }

    public void addTeacher(Teacher t){
        studentRespository.addTeacher(t);
    }

    public Teacher getT(int i){
        return studentRespository.getTeacher(i);
    }

    public Student getS(int id){
        return studentRespository.getStudent(id);
    }
}
