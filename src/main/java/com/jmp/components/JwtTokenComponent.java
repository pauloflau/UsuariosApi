package com.jmp.components;

import java.security.Key;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.jmp.entities.Usuario;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtTokenComponent {
	// pegou a chave que criei o applicatiom.properties
	@Value("${jwt.secret}")
	String jwtSecret;

	// carrego o tempo de expiracao do token
	@Value("${jwt.expirationInMinutes}")
	Integer jwtExpirationInMinutes;

	// Método para gerar o token JWT GERADO POR IA
	// gravando o token com os dados abaixo
	public String gerarToken(Usuario usuario) {
		Key key = Keys.hmacShaKeyFor(jwtSecret.getBytes()); // Usa a chave secreta para criar um HMAC key

        return Jwts.builder()
                .setSubject(usuario.getEmail()) // Define o e-mail do usuário como "subject"
                .setIssuedAt(new Date()) // Define a data de emissão
                .setExpiration(new Date(System.currentTimeMillis() + jwtExpirationInMinutes * 1000)) // Define a data de expiração
                .signWith(key, SignatureAlgorithm.HS256) // Usando a chave gerada para assinar com HS256
                .compact();  // Cria o token compactado
        }

	public LocalDateTime getExpirationDate() {
        // Obtenha a data e hora atual
        LocalDateTime now = LocalDateTime.now();

        // Adicione os minutos à data/hora atual
        return now.plusMinutes(jwtExpirationInMinutes);  // Adiciona a quantidade de minutos diretamente
    }
	

}
