package pe.gob.minjus.indicadores.dao.impl;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import pe.gob.minjus.indicadores.bean.ConsultaAnualRequest;
import pe.gob.minjus.indicadores.bean.ConsultaJudicialRequest;
import pe.gob.minjus.indicadores.bean.ConsultaMesRequest;
import pe.gob.minjus.indicadores.bean.RequestBeanGeneric;
import pe.gob.minjus.indicadores.bean.ResponseBeanGeneric;
import pe.gob.minjus.indicadores.dao.ExportarConsultaDao;
import pe.gob.minjus.indicadores.util.Mensaje;

@Component
public class ExportarConsultaDaoImpl implements ExportarConsultaDao {

	JdbcTemplate jdbcTemplate;

	public ExportarConsultaDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public ResponseBeanGeneric getCerradoExcel(RequestBeanGeneric req) {
		ResponseBeanGeneric response = null;

		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_consulta_cerrado_excel").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_fecha_desde", Types.INTEGER),
						new SqlParameter("p_fecha_hasta", Types.INTEGER)
//                        new SqlOutParameter("P_RESULTADO", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_fecha_desde", req.getFechaInicio());
		parameters.put("p_fecha_hasta", req.getFechaFin());		
		Map<String, Object> resultado = simpleJdbcCall.execute(parameters);

		if (resultado.size() > 0) {
			response = new ResponseBeanGeneric("0000", Mensaje.CONSULTA_EXITOSA.getMensaje(),
					resultado.get("#result-set-1"));
		} else {
			response = new ResponseBeanGeneric("0000", Mensaje.SIN_RESULTADO.getMensaje(), null);
		}
		return response;
	}

	@Override
	public ResponseBeanGeneric getDiarioExcel(RequestBeanGeneric req) {
		ResponseBeanGeneric response = null;

		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_consulta_diario_excel").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_fecha_desde", Types.INTEGER),
						new SqlParameter("p_fecha_hasta", Types.INTEGER)
//                        new SqlOutParameter("P_RESULTADO", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_fecha_desde", req.getFechaInicio());
		parameters.put("p_fecha_hasta", req.getFechaFin());		
		Map<String, Object> resultado = simpleJdbcCall.execute(parameters);

		if (resultado.size() > 0) {
			response = new ResponseBeanGeneric("0000", Mensaje.CONSULTA_EXITOSA.getMensaje(),
					resultado.get("#result-set-1"));
		} else {
			response = new ResponseBeanGeneric("0000", Mensaje.SIN_RESULTADO.getMensaje(), null);
		}
		return response;
	}

	@Override
	public ResponseBeanGeneric getDiligenciaLibreCerradoExcel(RequestBeanGeneric req) {
		ResponseBeanGeneric response = null;

		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_diligencia_libre_cerrado_excel").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_fecha_desde", Types.INTEGER),
						new SqlParameter("p_fecha_hasta", Types.INTEGER)
//                        new SqlOutParameter("P_RESULTADO", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_fecha_desde", req.getFechaInicio());
		parameters.put("p_fecha_hasta", req.getFechaFin());		
		Map<String, Object> resultado = simpleJdbcCall.execute(parameters);

		if (resultado.size() > 0) {
			response = new ResponseBeanGeneric("0000", Mensaje.CONSULTA_EXITOSA.getMensaje(),
					resultado.get("#result-set-1"));
		} else {
			response = new ResponseBeanGeneric("0000", Mensaje.SIN_RESULTADO.getMensaje(), null);
		}
		return response;
	}

	@Override
	public ResponseBeanGeneric getDiligenciaLibreDiarioExcel(RequestBeanGeneric req) {
		ResponseBeanGeneric response = null;

		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_diligencia_libre_diario_excel").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_fecha_desde", Types.INTEGER),
						new SqlParameter("p_fecha_hasta", Types.INTEGER)
//                        new SqlOutParameter("P_RESULTADO", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_fecha_desde", req.getFechaInicio());
		parameters.put("p_fecha_hasta", req.getFechaFin());		
		Map<String, Object> resultado = simpleJdbcCall.execute(parameters);

		if (resultado.size() > 0) {
			response = new ResponseBeanGeneric("0000", Mensaje.CONSULTA_EXITOSA.getMensaje(),
					resultado.get("#result-set-1"));
		} else {
			response = new ResponseBeanGeneric("0000", Mensaje.SIN_RESULTADO.getMensaje(), null);
		}
		return response;
	}

	@Override
	public ResponseBeanGeneric getEventoCerradoExcel(RequestBeanGeneric req) {
		ResponseBeanGeneric response = null;

		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_evento_cerrado_excel").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_fecha_desde", Types.INTEGER),
						new SqlParameter("p_fecha_hasta", Types.INTEGER)
//                        new SqlOutParameter("P_RESULTADO", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_fecha_desde", req.getFechaInicio());
		parameters.put("p_fecha_hasta", req.getFechaFin());		
		Map<String, Object> resultado = simpleJdbcCall.execute(parameters);

		if (resultado.size() > 0) {
			response = new ResponseBeanGeneric("0000", Mensaje.CONSULTA_EXITOSA.getMensaje(),
					resultado.get("#result-set-1"));
		} else {
			response = new ResponseBeanGeneric("0000", Mensaje.SIN_RESULTADO.getMensaje(), null);
		}
		return response;
	}

	@Override
	public ResponseBeanGeneric getEventoDiarioExcel(RequestBeanGeneric req) {
		ResponseBeanGeneric response = null;

		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_evento_diario_excel").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_fecha_desde", Types.INTEGER),
						new SqlParameter("p_fecha_hasta", Types.INTEGER)
//                        new SqlOutParameter("P_RESULTADO", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_fecha_desde", req.getFechaInicio());
		parameters.put("p_fecha_hasta", req.getFechaFin());		
		Map<String, Object> resultado = simpleJdbcCall.execute(parameters);

		if (resultado.size() > 0) {
			response = new ResponseBeanGeneric("0000", Mensaje.CONSULTA_EXITOSA.getMensaje(),
					resultado.get("#result-set-1"));
		} else {
			response = new ResponseBeanGeneric("0000", Mensaje.SIN_RESULTADO.getMensaje(), null);
		}
		return response;
	}

	@Override
	public ResponseBeanGeneric getPatrocinioCerradoExcel(RequestBeanGeneric req) {
		ResponseBeanGeneric response = null;

		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_patrocinio_cerrado_excel").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_fecha_desde", Types.INTEGER),
						new SqlParameter("p_fecha_hasta", Types.INTEGER)
//                        new SqlOutParameter("P_RESULTADO", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_fecha_desde", req.getFechaInicio());
		parameters.put("p_fecha_hasta", req.getFechaFin());		
		Map<String, Object> resultado = simpleJdbcCall.execute(parameters);

		if (resultado.size() > 0) {
			response = new ResponseBeanGeneric("0000", Mensaje.CONSULTA_EXITOSA.getMensaje(),
					resultado.get("#result-set-1"));
		} else {
			response = new ResponseBeanGeneric("0000", Mensaje.SIN_RESULTADO.getMensaje(), null);
		}
		return response;
	}

	@Override
	public ResponseBeanGeneric getPatrocinioDiarioExcel(RequestBeanGeneric req) {
		ResponseBeanGeneric response = null;

		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_patrocinio_diario_excel").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_fecha_desde", Types.INTEGER),
						new SqlParameter("p_fecha_hasta", Types.INTEGER)
//                        new SqlOutParameter("P_RESULTADO", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_fecha_desde", req.getFechaInicio());
		parameters.put("p_fecha_hasta", req.getFechaFin());		
		Map<String, Object> resultado = simpleJdbcCall.execute(parameters);

		if (resultado.size() > 0) {
			response = new ResponseBeanGeneric("0000", Mensaje.CONSULTA_EXITOSA.getMensaje(),
					resultado.get("#result-set-1"));
		} else {
			response = new ResponseBeanGeneric("0000", Mensaje.SIN_RESULTADO.getMensaje(), null);
		}
		return response;
	}

	@Override
	public ResponseBeanGeneric getPatrocinioDelitoCerradoExcel(RequestBeanGeneric req) {
		ResponseBeanGeneric response = null;

		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_patrocinio_delito_cerrado_excel").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_fecha_desde", Types.INTEGER),
						new SqlParameter("p_fecha_hasta", Types.INTEGER)
//                        new SqlOutParameter("P_RESULTADO", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_fecha_desde", req.getFechaInicio());
		parameters.put("p_fecha_hasta", req.getFechaFin());		
		Map<String, Object> resultado = simpleJdbcCall.execute(parameters);

		if (resultado.size() > 0) {
			response = new ResponseBeanGeneric("0000", Mensaje.CONSULTA_EXITOSA.getMensaje(),
					resultado.get("#result-set-1"));
		} else {
			response = new ResponseBeanGeneric("0000", Mensaje.SIN_RESULTADO.getMensaje(), null);
		}
		return response;
	}

	@Override
	public ResponseBeanGeneric getPatrocinioDelitoDiarioExcel(RequestBeanGeneric req) {
		ResponseBeanGeneric response = null;

		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_patrocinio_delito_diario_excel").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_fecha_desde", Types.INTEGER),
						new SqlParameter("p_fecha_hasta", Types.INTEGER)
//                        new SqlOutParameter("P_RESULTADO", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_fecha_desde", req.getFechaInicio());
		parameters.put("p_fecha_hasta", req.getFechaFin());		
		Map<String, Object> resultado = simpleJdbcCall.execute(parameters);

		if (resultado.size() > 0) {
			response = new ResponseBeanGeneric("0000", Mensaje.CONSULTA_EXITOSA.getMensaje(),
					resultado.get("#result-set-1"));
		} else {
			response = new ResponseBeanGeneric("0000", Mensaje.SIN_RESULTADO.getMensaje(), null);
		}
		return response;
	}

}
