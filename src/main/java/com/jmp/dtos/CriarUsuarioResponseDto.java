package com.jmp.dtos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class CriarUsuarioResponseDto {
	
	/*
	 * API DEVOLVE
	 */
	
	private Integer idUsuario;
	private String nome;
	private String email;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dataHoraCadastro;
}
