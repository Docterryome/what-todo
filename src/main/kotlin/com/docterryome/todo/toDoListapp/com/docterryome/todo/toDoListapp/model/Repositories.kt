package com.docterryome.todo.toDoListapp.com.docterryome.todo.toDoListapp.model

import org.springframework.data.repository.CrudRepository


interface  TaskRepository : CrudRepository<Task, Long>

interface UserRepository : CrudRepository<User, String>