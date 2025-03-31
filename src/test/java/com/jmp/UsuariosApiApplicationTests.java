package com.jmp;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.jmp.dtos.AutenticarUsuarioRequestDto;
import com.jmp.dtos.CriarUsuarioRequestDto;

@SpringBootTest
@AutoConfigureMockMvc // executar os testes na API
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // ordem dos testes
class UsuariosApiApplicationTests {

	@Autowired
	MockMvc mockMvc; // realizar as chamadas para a API
	@Autowired
	ObjectMapper objectMapper; // envio dos dados para a API
	
	//atributos
	private static String email;
	private static String senha;

	@Test
	@Order(1)
	public void criarUsuarioTest() throws Exception {
		Faker faker = new Faker();
		CriarUsuarioRequestDto dto = new CriarUsuarioRequestDto();
		dto.setNome(faker.name().fullName());
		dto.setEmail(faker.internet().emailAddress());
		dto.setSenha("1234");
		// executando a chamada para a API
		mockMvc.perform(post("/api/usuario/criar").contentType("application/json")
				.content(objectMapper.writeValueAsString(dto))).andExpect(status().isOk());
		email = dto.getEmail();
		senha = dto.getSenha();
	}

	@Test
	@Order(2)
	public void autenticarUsuariotest() throws Exception {
		AutenticarUsuarioRequestDto dto = new AutenticarUsuarioRequestDto();
		dto.setEmail(email);
		dto.setSenha(senha);
		mockMvc.perform(post("/api/usuario/autenticar").contentType("application/json")
				.content(objectMapper.writeValueAsString(dto))).andExpect(status().isOk());
	}

}
