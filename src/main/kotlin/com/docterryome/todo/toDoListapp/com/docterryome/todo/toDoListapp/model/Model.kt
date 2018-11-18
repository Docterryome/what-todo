package com.docterryome.todo.toDoListapp.com.docterryome.todo.toDoListapp.model


import java.time.LocalDateTime
import javax.persistence.*


@Entity
data class Task(val name: String,
                val startDate: LocalDateTime = LocalDateTime.now(),
                @ManyToOne @JoinColumn val user : User,
                @Id @GeneratedValue val id: Long? = null)

@Entity
data class User(@Id val login: String,
                val firstName: String,
                val lastName: String)