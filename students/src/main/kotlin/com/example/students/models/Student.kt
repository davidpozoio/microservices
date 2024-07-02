package com.example.students.models

import jakarta.persistence.*

@Entity
@Table(name = "students")
class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null;

    @Column(name = "name")
    val name: String? = null
}