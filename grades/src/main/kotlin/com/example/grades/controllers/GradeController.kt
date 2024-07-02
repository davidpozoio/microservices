package com.example.grades.controllers

import com.example.grades.models.Grade
import com.example.grades.services.GradeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/grades")
class GradeController {
    @Autowired
    lateinit var gradeService: GradeService

    @GetMapping
    fun findAll(): List<Grade>{
        return  gradeService.findAll()
    }
}