package com.jmp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmp.dtos.AutenticarUsuarioRequestDto;
import com.jmp.dtos.AutenticarUsuarioResponseDto;
import com.jmp.dtos.CriarUsuarioRequestDto;
import com.jmp.dtos.CriarUsuarioResponseDto;
import com.jmp.services.UsuarioService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/usuario")
public class UsuariosController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping("criar")
	public CriarUsuarioResponseDto criar(@RequestBody @Valid CriarUsuarioRequestDto request) {
		return usuarioService.criarUsuario(request);
	}
	
	@PostMapping("autenticar")
	public AutenticarUsuarioResponseDto autenticar(@RequestBody @Valid AutenticarUsuarioRequestDto request) {
		return null;
	}
}
