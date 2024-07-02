package com.example.grades.models

import jakarta.persistence.*

@Entity
@Table(name = "grades")
class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(name = "score")
    var score: Double? = null
}