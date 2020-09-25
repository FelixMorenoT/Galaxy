package com.galaxy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.galaxy.responses.GalaxyResponse;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler
	public ResponseEntity<GalaxyResponse> PropertyValueException (org.hibernate.PropertyValueException ex){
		GalaxyResponse response = new GalaxyResponse();
		
		response.setStatus(HttpStatus.BAD_REQUEST.value());
		response.setMessage(ex.getMessage());
		response.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<GalaxyResponse>(response,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public ResponseEntity<GalaxyResponse> HttpMessageNotReadableException (org.springframework.http.converter.HttpMessageNotReadableException ex){
		GalaxyResponse response = new GalaxyResponse();
		
		response.setStatus(HttpStatus.BAD_REQUEST.value());
		response.setMessage(ex.getMessage());
		response.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<GalaxyResponse>(response,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public ResponseEntity<GalaxyResponse> EntityNotFoundException (javax.persistence.EntityNotFoundException ex){
		GalaxyResponse response = new GalaxyResponse();
		
		response.setStatus(HttpStatus.NOT_FOUND.value());
		response.setMessage(ex.getMessage());
		response.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<GalaxyResponse>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<GalaxyResponse> IndexOutOfBoundsException (java.lang.IndexOutOfBoundsException ex){
		GalaxyResponse response = new GalaxyResponse();
		
		response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		response.setMessage(ex.getMessage());
		response.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<GalaxyResponse>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
