package com.example.classroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody() Student student){
        studentService.addStudent(student);
    }

    @PostMapping("/addTeacher")
    public void addTeacher(@RequestBody() Teacher teacher){
        studentService.addTeacher(teacher);
    }

    @GetMapping("/get_teacher_by_id")
    public Teacher getTeacher(@RequestParam("id") int id){
        return studentService.getT(id);
    }

    @GetMapping("/get_student_by_id")
    public Student getStudent(@RequestParam("id") int id){
        return studentService.getS(id);
    }

}
