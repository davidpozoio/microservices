package com.example.students.controllers

import com.example.students.models.Student
import com.example.students.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/students")
class StudentController {
    @Autowired
    lateinit var studentService: StudentService

    @GetMapping
    fun findAll(): List<Student>{
        return  studentService.findAll()
    }

    @PostMapping
    fun save(@RequestBody student: Student): Student{
        return  studentService.save(student);
    }
}