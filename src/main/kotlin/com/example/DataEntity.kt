package com.example

import jakarta.persistence.*

@Entity
@Table(name = "data")
data class DataEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0,

    @Column(name = "data", nullable = false)
    var data: String
)
