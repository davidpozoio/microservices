package com.example.grades.repositories

import com.example.grades.models.Grade
import org.springframework.data.jpa.repository.JpaRepository

interface GradeRepository: JpaRepository<Grade, Long> {
}