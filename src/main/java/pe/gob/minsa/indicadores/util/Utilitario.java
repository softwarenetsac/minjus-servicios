package pe.gob.minsa.indicadores.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilitario {

	public static String validarMayorFechaActual(String fecha) throws ParseException {
		String respuesta = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		Date d1 = dateFormat.parse(fecha);
		Date d2 = new Date();

		if (d2.after(d1)) {
			respuesta = "6004";
		} else {
			respuesta = "0000";
		}

		return respuesta;

	}
}
