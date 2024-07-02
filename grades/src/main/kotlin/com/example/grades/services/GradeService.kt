package com.example.grades.services

import com.example.grades.models.Grade
import com.example.grades.repositories.GradeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GradeService {
    @Autowired
    lateinit var gradeRepository: GradeRepository

    fun findAll(): List<Grade>{
        return gradeRepository.findAll()
    }
}