package com.docterryome.todo.toDoListapp

import com.docterryome.todo.toDoListapp.com.docterryome.todo.toDoListapp.model.Task
import com.docterryome.todo.toDoListapp.com.docterryome.todo.toDoListapp.model.TaskRepository
import com.docterryome.todo.toDoListapp.com.docterryome.todo.toDoListapp.model.User
import com.docterryome.todo.toDoListapp.com.docterryome.todo.toDoListapp.model.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ToDoListappApplication {

    @Bean
    fun databaseInitilizer(@Autowired userRepository: UserRepository, @Autowired taskRepository: TaskRepository) = CommandLineRunner {
        val docterryome = User("docterryome@gmail.com", "Doc", "Wilkins")
        userRepository.save(docterryome);
        val tasks : List<Task> = listOf(
                Task("Wake up", user = docterryome),
                Task("Take shower", user = docterryome),
                Task("Get Dressed", user = docterryome),
                Task("Go to work", user = docterryome),
                Task("Drink coffee", user = docterryome))

        tasks.forEach { task -> taskRepository.save(task) }


    }

}


    fun main(args: Array<String>) {
        runApplication<ToDoListappApplication>(*args)

    }

