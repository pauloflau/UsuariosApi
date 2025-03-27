package com.jmp.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tb_usuario")
public class Usuario {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	
	@Column(length=100, nullable=false)
	private String nome;
	
	@Column(length = 100, nullable = false, unique=true)
	private String email;
	
	@Column( length = 40, nullable=false)
	private String senha;
	
	private LocalDateTime dataHora;
}
