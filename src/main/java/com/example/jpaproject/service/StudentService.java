package com.example.jpaproject.service;


import com.example.jpaproject.DTO.StudentDto;
import com.example.jpaproject.entity.StudentEntity;
import com.example.jpaproject.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService {

    private final StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<StudentEntity> getAllStudent() {
        List<StudentEntity> studentEntities = studentRepository.findAll();
        return studentEntities;

    }


    public StudentEntity insertStudent(StudentEntity studentEntity) {
        StudentEntity saved = studentRepository.save(studentEntity);

        return saved;
    }


    public static List<StudentDto> fromEntityToDto(List<StudentEntity> entityList) {
        List<StudentDto> dtoArrayList = new ArrayList<>();
        for (StudentEntity entity : entityList) {
            StudentDto studentDto = new StudentDto();
            studentDto.setId(entity.getId());
            studentDto.setName(entity.getName());
            studentDto.setSurname(entity.getSurname());
            dtoArrayList.add(studentDto);
        }

        return dtoArrayList;
    }


    public static StudentEntity fromDtoToEntity(StudentDto studentDto) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(studentDto.getId());
        studentEntity.setName(studentDto.getName());
        studentEntity.setSurname(studentDto.getSurname());


        return studentEntity;
    }
}
