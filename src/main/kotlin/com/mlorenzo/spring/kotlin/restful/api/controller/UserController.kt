package com.mlorenzo.spring.kotlin.restful.api.controller

import com.mlorenzo.spring.kotlin.restful.dto.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping("/users")
class UserController {
	
	@GetMapping
	fun getUsers(): List<User> {
		val users = listOf(User(123, "John Doe", 20.000), User(777, "Joe Bucks", 30.000))
		return users
	}
	
	// Cuando el cuerpo de una función solo tiene una sentencia, se puede resumir de esta forma, es decir,
	// en este caso, este método devuelve una instancia de la clase User.
	// Nota: Kotlin puede inferir el tipo de retorno del método. Por lo tanto, especificar el tipo de retorno es opcional.
	@GetMapping("/{id}")
	fun getUser(@PathVariable id: Int) = User(id, "John Doe", 20.000)
}