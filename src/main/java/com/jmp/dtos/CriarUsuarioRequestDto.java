package com.jmp.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CriarUsuarioRequestDto {

	/*
	 * ENVIO PARA API
	 */

	@Size(min = 2, max = 100, message = "Informe o nome com 2 a 100 caracteres.")
	@NotBlank(message = "O preenchimento do nome e obrigatorio.")
	private String nome;

	@Email(message = "Informe um email valido")
	@NotBlank(message = "O preenchimento do email e obrigatorio")
	private String email;

	@Pattern(regexp = "^[a-z]{2,100}$|^[A-Z]{2,100}$|^[0-9]{2,100}$",
		message = "Informe uma senha de 2 a 100 caracters com tudo maiusculo, minusculo ou numeros.")
	@NotBlank(message = "O preenchimento da senha e obrigatorio.")
	private String senha;
}
