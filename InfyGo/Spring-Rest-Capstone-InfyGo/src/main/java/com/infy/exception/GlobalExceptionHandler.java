package com.infy.exception;

import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@PropertySource(value = "classpath:VlidationMessages.properties")
public class GlobalExceptionHandler {
	
	@Autowired
	private Environment environment;

	@ExceptionHandler(InfyGoException.class)
	public ResponseEntity<ErrorMessage> infyGoExceptionHandler(InfyGoException e) {
		ErrorMessage errorMessage = new ErrorMessage(HttpStatus.BAD_REQUEST.value(),
				environment.getProperty(e.getMessage()));
		return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorMessage> methodArgumentNotValueExceptionHandler(MethodArgumentNotValidException e) {
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setErrorCode(HttpStatus.NOT_ACCEPTABLE.value());
		errorMessage.setMessage(e.getBindingResult().getAllErrors().stream().map(ObjectError::getDefaultMessage).map(value -> this.environment.getProperty(value))
				.collect(Collectors.joining(", ")));
		return new ResponseEntity<>(errorMessage, HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<ErrorMessage> constraintViolationExceptionHandler(ConstraintViolationException e) {
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setErrorCode(HttpStatus.NOT_ACCEPTABLE.value());
		errorMessage.setMessage(e.getConstraintViolations().stream().map(ConstraintViolation::getMessage).map(value -> this.environment.getProperty(value))
				.collect(Collectors.joining(", ")));
		return new ResponseEntity<>(errorMessage, HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> generalExceptionHandler(Exception e) {
		ErrorMessage errorMessage = new ErrorMessage(HttpStatus.BAD_REQUEST.value(),
				e.getMessage());
		return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
	}

}
