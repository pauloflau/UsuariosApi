package com.jmp.dtos;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class AutenticarUsuarioResponseDto {

	/*
	 * API DEVOLVE
	 */

	private Integer idUsuario;
	private String nome;
	private String email;
	private LocalDateTime dataHoraAcesso;
	private String token;
	private LocalDateTime dataHoraExpiracao;
}
