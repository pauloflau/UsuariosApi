package com.jmp.dtos;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class CriarUsuarioResponseDto {
	
	/*
	 * API DEVOLVE
	 */
	
	private Integer idUsuario;
	private String nome;
	private String email;
	private LocalDateTime dataHoraCadastro;
}
