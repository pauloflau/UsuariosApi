package com.jmp.dtos;

import java.util.List;
import org.springframework.http.HttpStatus;
import lombok.Data;

@Data
public class ErrorResponseDto {
	//codigo de erro que existem na API(ex: 400)
	private HttpStatus status;
	
	//lista contendo as mensagens de erro da API
	private List<String> errors;
	
}
