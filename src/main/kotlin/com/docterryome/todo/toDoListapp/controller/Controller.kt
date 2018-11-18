package com.docterryome.todo.toDoListapp.controller

import com.docterryome.todo.toDoListapp.com.docterryome.todo.toDoListapp.model.TaskRepository
import com.docterryome.todo.toDoListapp.com.docterryome.todo.toDoListapp.model.UserRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.set
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping


@Controller
class HtmlController(private val userRepository: UserRepository, private val taskRepository: TaskRepository){


    @RequestMapping("/")
    fun toDoList(model : Model) : String
    {
        model["tasks"] = taskRepository.findAll()

        model["user"]  = userRepository.findById("docterryome@gmail.com").get()
        println(userRepository.findById("docterryome@gmail.com"))
        return "index"
    }
}