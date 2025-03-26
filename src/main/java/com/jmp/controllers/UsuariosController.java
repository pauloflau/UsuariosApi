package com.jmp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmp.dtos.AutenticarUsuarioRequestDto;
import com.jmp.dtos.AutenticarUsuarioResponseDto;
import com.jmp.dtos.CriarUsuarioRequestDto;
import com.jmp.dtos.CriarUsuarioResponseDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/usuario")
public class UsuariosController {
	
	@PostMapping("criar")
	public CriarUsuarioResponseDto criar(@RequestBody @Valid CriarUsuarioRequestDto request) {
		return null;
	}
	
	@PostMapping("autenticar")
	public AutenticarUsuarioResponseDto autenticar(@RequestBody @Valid AutenticarUsuarioRequestDto request) {
		return null;
	}
}
