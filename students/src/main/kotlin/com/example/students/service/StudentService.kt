package com.example.students.service

import com.example.students.models.Student
import com.example.students.respositories.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService {
    @Autowired
    private lateinit var studentRepository: StudentRepository

    fun findAll(): List<Student>{
        return studentRepository.findAll()
    }

    fun save(student: Student): Student{
        return  studentRepository.save(student)
    }
}