package com.jmp.handlers;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.jmp.dtos.ErrorResponseDto;

@ControllerAdvice
public class IllegalArgumentExceptionHandler {
	/*
	 * METODO GERADO POR IA PARA TRATAR OS ERROS ASSIM CADA ERRO QUE HOUVER ENTRE O
	 * FRONT E O CONTROLLER ESSA CLASSE PEGA E EXIBE DE MODO MAIS LIMPO RETORNANDO
	 * PARA O FRONT
	 */
	
	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ErrorResponseDto handleIllegalArgumentException(IllegalArgumentException e) {

		ErrorResponseDto response = new ErrorResponseDto();
		response.setStatus(HttpStatus.BAD_REQUEST);
		response.setErrors(new ArrayList<String>());

		response.getErrors().add(e.getMessage());
		return response;
	}
}
