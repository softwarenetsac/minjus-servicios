package pe.gob.minsa.indicadores.controller;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.gob.minsa.indicadores.bean.ResponseBeanGeneric;

@ControllerAdvice
public class ExcepcioHandler {

	@ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseBeanGeneric HandleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        return ResponseBeanGeneric.error(e.getBindingResult().getFieldError().getDefaultMessage());
    }
	
}
