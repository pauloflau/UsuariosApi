package com.jmp.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmp.dtos.AutenticarUsuarioRequestDto;
import com.jmp.dtos.AutenticarUsuarioResponseDto;
import com.jmp.dtos.CriarUsuarioRequestDto;
import com.jmp.dtos.CriarUsuarioResponseDto;
import com.jmp.entities.Usuario;
import com.jmp.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public CriarUsuarioResponseDto criarUsuario(CriarUsuarioRequestDto request) {
		if(usuarioRepository.findByEmail(request.getEmail()) != null) {
			throw new IllegalArgumentException("O email informado ja esta cadastrado.");
		}
		
		//pego o usuario que veio do controlador
		Usuario usuario = new Usuario();
		usuario.setNome(request.getNome());
		usuario.setEmail(request.getEmail());
		usuario.setSenha(request.getEmail());
		usuario.setDataHora(LocalDateTime.now());
		
		usuarioRepository.save(usuario);
		
		//crio a resposta para mandar p controlador
		CriarUsuarioResponseDto response = new CriarUsuarioResponseDto();
		response.setIdUsuario(usuario.getIdUsuario());
		response.setNome(usuario.getNome());
		response.setEmail(usuario.getEmail());
		response.setDataHoraCadastro(usuario.getDataHora());
		
		return response;
	}
	
	public AutenticarUsuarioResponseDto autenticarUsuario(AutenticarUsuarioRequestDto request) {
		return null;
	}
}
