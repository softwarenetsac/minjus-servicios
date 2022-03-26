package pe.gob.minsa.indicadores.util;

public class MyException extends RuntimeException{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(){             
    }
	
	public MyException(String mensaje){
        super(mensaje);        
    }


}
