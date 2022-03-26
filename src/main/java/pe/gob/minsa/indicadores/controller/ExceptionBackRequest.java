package pe.gob.minsa.indicadores.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import pe.gob.minsa.indicadores.bean.ResponseBeanGeneric;
import pe.gob.minsa.indicadores.util.MyException;

@ControllerAdvice(annotations = RestController.class)
public class ExceptionBackRequest {

	@ExceptionHandler(MyException.class)
	public ResponseEntity<ResponseBeanGeneric> myExcepcion(Exception e) {		
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ResponseBeanGeneric.error(e.getMessage()));		
	}

//	@ResponseBody
//	@ExceptionHandler(MyException.class)
//	public ResponseBeanGeneric myExcepcion(Exception e) {
//		return ResponseBeanGeneric.error(e.getMessage());
//	}
	
}
