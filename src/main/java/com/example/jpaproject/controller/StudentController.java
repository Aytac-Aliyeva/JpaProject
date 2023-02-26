package com.example.jpaproject.controller;

import com.example.jpaproject.DTO.StudentDto;
import com.example.jpaproject.entity.StudentEntity;
import com.example.jpaproject.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping("/add-student")
    public StudentEntity insertStudent(@RequestBody StudentDto studentDto) {
        StudentEntity studentEntity1 = StudentService.fromDtoToEntity(studentDto);
        StudentEntity studentEntity = studentService.insertStudent(studentEntity1);
        return studentEntity;

    }


    @GetMapping("/get-all-student")
    public List<StudentDto> getAllStudent() {
        List<StudentEntity> allStudent = studentService.getAllStudent();
        List<StudentDto> studentDtos = StudentService.fromEntityToDto(allStudent);


        return studentDtos;
    }
}
