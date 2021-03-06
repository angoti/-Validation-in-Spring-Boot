package com.professorangoti;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@PostMapping("/users")
	ResponseEntity<String> addUser(@Valid @RequestBody User user) {
		// persistindo o usuario
		return ResponseEntity.ok("Usuário cadastrado com sucesso");
	}

}