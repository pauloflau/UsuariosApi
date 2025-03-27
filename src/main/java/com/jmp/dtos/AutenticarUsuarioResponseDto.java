package com.jmp.dtos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class AutenticarUsuarioResponseDto {

	/*
	 * API DEVOLVE
	 */

	private Integer idUsuario;
	private String nome;
	private String email;
	private String token;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dataHoraAcesso;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dataHoraExpiracao;
}
