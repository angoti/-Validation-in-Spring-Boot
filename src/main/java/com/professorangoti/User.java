package com.professorangoti;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotBlank(message = "O campo nome é obrigatório")
    private String name;
    
    @NotBlank(message = "O campo email é obrigatório")
    private String email;

	public User(@NotBlank(message = "O campo nome é obrigatório") String name,
			@NotBlank(message = "O campo email é obrigatório") String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
    
}
