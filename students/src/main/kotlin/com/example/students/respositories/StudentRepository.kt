package com.example.students.respositories

import com.example.students.models.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository: JpaRepository<Student, Long>{
}