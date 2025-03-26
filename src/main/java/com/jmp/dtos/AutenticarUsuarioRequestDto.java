package com.jmp.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AutenticarUsuarioRequestDto {

	/*
	 * ENVIO PARA API
	 */
	
	@Email(message = "Informe um email valido")
	@NotBlank(message = "O preenchimento do email e obrigatorio")
	private String email;
	
	@Size(min = 2, max = 20, message="Informe a senha com 2 a 20 caracteres")
	@NotBlank(message = "O preenchimento da senha e obrigatorio")
	private String senha;
}
