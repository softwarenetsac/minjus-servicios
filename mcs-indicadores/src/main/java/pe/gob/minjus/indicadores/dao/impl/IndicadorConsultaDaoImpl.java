package pe.gob.minjus.indicadores.dao.impl;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import pe.gob.minjus.indicadores.bean.ConsultaAnualRequest;
import pe.gob.minjus.indicadores.bean.ConsultaEventoDistritoRequest;
import pe.gob.minjus.indicadores.bean.ConsultaEventoTemarioRequest;
import pe.gob.minjus.indicadores.bean.ConsultaJudicialRequest;
import pe.gob.minjus.indicadores.bean.ConsultaMesRequest;
import pe.gob.minjus.indicadores.bean.ConsultaPatrocinioAnioRequest;
import pe.gob.minjus.indicadores.bean.ConsultaPatrocinioDistritoRequest;
import pe.gob.minjus.indicadores.bean.ConsultaPatrocinioGeneroRequest;
import pe.gob.minjus.indicadores.bean.ConsultaPatrocinioMesRequest;
import pe.gob.minjus.indicadores.bean.ConsultaPatrocinioRangoEdadRequest;
import pe.gob.minjus.indicadores.bean.RequestBeanGeneric;
import pe.gob.minjus.indicadores.bean.ResponseBeanGeneric;
import pe.gob.minjus.indicadores.dao.IndicadorConsultaDao;
import pe.gob.minjus.indicadores.util.Mensaje;

@Component
public class IndicadorConsultaDaoImpl implements IndicadorConsultaDao {

	JdbcTemplate jdbcTemplate;

	public IndicadorConsultaDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public ResponseBeanGeneric getMesCerrado(ConsultaMesRequest req) {
		ResponseBeanGeneric response = null;
//		ObjectMapper mapper = new ObjectMapper();
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_consulta_mes_cerrado").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_anio", Types.INTEGER),
						new SqlParameter("p_distrito_id", Types.INTEGER), new SqlParameter("p_sede_id", Types.INTEGER),
						new SqlParameter("p_consulta_materia_id", Types.INTEGER)
//                        new SqlOutParameter("P_RESULTADO", Types.INTEGER),
//                        new SqlOutParameter("P_DETALLE_RESULTADO", Types.VARCHAR)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_distrito_id", req.getIdDistrito());
		parameters.put("p_sede_id", req.getIdSede());
		parameters.put("p_consulta_materia_id", req.getIdMateria());
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
	public ResponseBeanGeneric getMesdiario(ConsultaMesRequest req) {
		ResponseBeanGeneric response = null;
//		ObjectMapper mapper = new ObjectMapper();
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_consulta_mes_diario").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_anio", Types.INTEGER),
						new SqlParameter("p_distrito_id", Types.INTEGER), new SqlParameter("p_sede_id", Types.INTEGER),
						new SqlParameter("p_consulta_materia_id", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_distrito_id", req.getIdDistrito());
		parameters.put("p_sede_id", req.getIdSede());
		parameters.put("p_consulta_materia_id", req.getIdMateria());
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
	public ResponseBeanGeneric getAnualCerrado(ConsultaAnualRequest req) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_consulta_anual_cerrado").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_anio", Types.INTEGER),
						new SqlParameter("p_distrito_id", Types.INTEGER), new SqlParameter("p_sede_id", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_distrito_id", req.getIdDistrito());
		parameters.put("p_sede_id", req.getIdSede());
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
	public ResponseBeanGeneric getAnualDiario(ConsultaAnualRequest req) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_consulta_anual_diario").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_anio", Types.INTEGER),
						new SqlParameter("p_distrito_id", Types.INTEGER), new SqlParameter("p_sede_id", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_distrito_id", req.getIdDistrito());
		parameters.put("p_sede_id", req.getIdSede());
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
	public ResponseBeanGeneric getDistritoJudicialCerrado(ConsultaJudicialRequest req) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_consulta_distritojudicial_cerrado").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_anio", Types.INTEGER),
						new SqlParameter("p_consulta_materia_id", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_consulta_materia_id", req.getIdMateria());
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
	public ResponseBeanGeneric getDistritoJudicialDiario(ConsultaJudicialRequest req) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_consulta_distritojudicial_diario").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_anio", Types.INTEGER),
						new SqlParameter("p_consulta_materia_id", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_consulta_materia_id", req.getIdMateria());
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
	public ResponseBeanGeneric getPatrocinioNuevoDistritoCerrado(ConsultaPatrocinioDistritoRequest req) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_patrocinio_nuevo_distrito_cerrado").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_anio", Types.INTEGER),
						new SqlParameter("p_grupo_servicio_id", Types.INTEGER),
						new SqlParameter("p_mes_id", Types.INTEGER)	
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_grupo_servicio_id", req.getIdGrupoServicio());
		parameters.put("p_mes_id", req.getMes());
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
	public ResponseBeanGeneric getPatrocinioNuevoDistritoDiario(ConsultaPatrocinioDistritoRequest req) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_patrocinio_nuevo_distrito_diario").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_anio", Types.INTEGER),
						new SqlParameter("p_grupo_servicio_id", Types.INTEGER),
						new SqlParameter("p_mes_id", Types.INTEGER)	
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_grupo_servicio_id", req.getIdGrupoServicio());
		parameters.put("p_mes_id", req.getMes());
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
	public ResponseBeanGeneric getPatrocinioNuevoGeneroCerrado(ConsultaPatrocinioGeneroRequest req) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_patrocinio_nuevo_genero_cerrado").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_anio", Types.INTEGER),
						new SqlParameter("p_grupo_servicio_id", Types.INTEGER),
						new SqlParameter("p_distrito_id", Types.INTEGER),
						new SqlParameter("p_sede_id", Types.INTEGER),
						new SqlParameter("p_mes_id", Types.INTEGER)	
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_grupo_servicio_id", req.getIdGrupoServicio());
		parameters.put("p_distrito_id", req.getIdDistrito());
		parameters.put("p_sede_id", req.getIdSede());
		parameters.put("p_mes_id", req.getMes());
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
	public ResponseBeanGeneric getPatrocinioNuevoGeneroDiario(ConsultaPatrocinioGeneroRequest req) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_patrocinio_nuevo_genero_diario").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_anio", Types.INTEGER),
						new SqlParameter("p_grupo_servicio_id", Types.INTEGER),
						new SqlParameter("p_distrito_id", Types.INTEGER),
						new SqlParameter("p_sede_id", Types.INTEGER),
						new SqlParameter("p_mes_id", Types.INTEGER)						
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_grupo_servicio_id", req.getIdGrupoServicio());
		parameters.put("p_distrito_id", req.getIdDistrito());
		parameters.put("p_sede_id", req.getIdSede());
		parameters.put("p_mes_id", req.getMes());
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
	public ResponseBeanGeneric getPatrocinioNuevoMesCerrado(ConsultaPatrocinioMesRequest req) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_patrocinio_nuevo_mes_cerrado").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_anio", Types.INTEGER),
						new SqlParameter("p_grupo_servicio_id", Types.INTEGER),
						new SqlParameter("p_distrito_id", Types.INTEGER),
						new SqlParameter("p_sede_id", Types.INTEGER),
						new SqlOutParameter("@p_total", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_grupo_servicio_id", req.getIdGrupoServicio());
		parameters.put("p_distrito_id", req.getIdDistrito());
		parameters.put("p_sede_id", req.getIdSede());
		Map<String, Object> resultado = simpleJdbcCall.execute(parameters);
		Integer total = (Integer) resultado.get("@p_total");
		
		if(total>0) {
//		if (resultado.size() > 0) {
			response = new ResponseBeanGeneric("0000", Mensaje.CONSULTA_EXITOSA.getMensaje(),
					resultado.get("#result-set-1"));
		} else {
			response = new ResponseBeanGeneric("0000", Mensaje.SIN_RESULTADO.getMensaje(), null);
		}
		return response;
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoMesDiario(ConsultaPatrocinioMesRequest req) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_patrocinio_nuevo_mes_diario").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_anio", Types.INTEGER),
						new SqlParameter("p_grupo_servicio_id", Types.INTEGER),
						new SqlParameter("p_distrito_id", Types.INTEGER),
						new SqlParameter("p_sede_id", Types.INTEGER),
						new SqlOutParameter("@p_total", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_grupo_servicio_id", req.getIdGrupoServicio());
		parameters.put("p_distrito_id", req.getIdDistrito());
		parameters.put("p_sede_id", req.getIdSede());
		Map<String, Object> resultado = simpleJdbcCall.execute(parameters);
		Integer total = (Integer) resultado.get("@p_total");
		
		if(total>0) {
		//if (resultado.size() > 0) {
			response = new ResponseBeanGeneric("0000", Mensaje.CONSULTA_EXITOSA.getMensaje(),
					resultado.get("#result-set-1"));
		} else {
			response = new ResponseBeanGeneric("0000", Mensaje.SIN_RESULTADO.getMensaje(), null);
		}
		return response;
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoAnioCerrado(ConsultaPatrocinioAnioRequest req) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_patrocinio_nuevo_anio_cerrado").withoutProcedureColumnMetaDataAccess()
				.declareParameters(
						new SqlParameter("p_anio", Types.VARCHAR),
						new SqlParameter("p_mes_id", Types.INTEGER),
						new SqlParameter("p_grupo_servicio_id", Types.INTEGER),
						new SqlParameter("p_distrito_id", Types.INTEGER),
						new SqlParameter("p_sede_id", Types.INTEGER),
						new SqlOutParameter("@p_total", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_mes_id", req.getMes());
		parameters.put("p_grupo_servicio_id", req.getIdGrupoServicio());
		parameters.put("p_distrito_id", req.getIdDistrito());
		parameters.put("p_sede_id", req.getIdSede());
		Map<String, Object> resultado = simpleJdbcCall.execute(parameters);
		Integer total = (Integer) resultado.get("@p_total");
		
		if(total>0) {
		//if (resultado.size() > 0) {
			response = new ResponseBeanGeneric("0000", Mensaje.CONSULTA_EXITOSA.getMensaje(),
					resultado.get("#result-set-1"));
		} else {
			response = new ResponseBeanGeneric("0000", Mensaje.SIN_RESULTADO.getMensaje(), null);
		}
		return response;
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoAnioDiario(ConsultaPatrocinioAnioRequest req) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_patrocinio_nuevo_anio_diario").withoutProcedureColumnMetaDataAccess()
				.declareParameters(
						new SqlParameter("p_anio", Types.VARCHAR),
						new SqlParameter("p_mes_id", Types.INTEGER),
						new SqlParameter("p_grupo_servicio_id", Types.INTEGER),
						new SqlParameter("p_distrito_id", Types.INTEGER),
						new SqlParameter("p_sede_id", Types.INTEGER),
						new SqlOutParameter("@p_total", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_mes_id", req.getMes());
		parameters.put("p_grupo_servicio_id", req.getIdGrupoServicio());
		parameters.put("p_distrito_id", req.getIdDistrito());
		parameters.put("p_sede_id", req.getIdSede());
		Map<String, Object> resultado = simpleJdbcCall.execute(parameters);
		Integer total = (Integer) resultado.get("@p_total");
		
		if(total>0) {
		//if (resultado.size() > 0) {
			response = new ResponseBeanGeneric("0000", Mensaje.CONSULTA_EXITOSA.getMensaje(),
					resultado.get("#result-set-1"));
		} else {
			response = new ResponseBeanGeneric("0000", Mensaje.SIN_RESULTADO.getMensaje(), null);
		}
		return response;
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoRangoEdadCerrado(ConsultaPatrocinioRangoEdadRequest req) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_patrocinio_nuevo_rango_edad_cerrado").withoutProcedureColumnMetaDataAccess()
				.declareParameters(
						new SqlParameter("p_id_rango", Types.VARCHAR),
						new SqlParameter("p_mes_id", Types.INTEGER),
						new SqlParameter("p_anio", Types.VARCHAR),
						new SqlParameter("p_grupo_servicio_id", Types.INTEGER),
						new SqlParameter("p_distrito_id", Types.INTEGER),
						new SqlParameter("p_sede_id", Types.INTEGER),
						new SqlOutParameter("@p_total", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_id_rango", req.getRangoEdad());
		parameters.put("p_mes_id", req.getMes());
		parameters.put("p_anio", req.getAnio());		
		parameters.put("p_grupo_servicio_id", req.getIdGrupoServicio());
		parameters.put("p_distrito_id", req.getIdDistrito());
		parameters.put("p_sede_id", req.getIdSede());
		Map<String, Object> resultado = simpleJdbcCall.execute(parameters);
		Integer total = (Integer) resultado.get("@p_total");
		
		if(total>0) {
		//if (resultado.size() > 0) {
			response = new ResponseBeanGeneric("0000", Mensaje.CONSULTA_EXITOSA.getMensaje(),
					resultado.get("#result-set-1"));
		} else {
			response = new ResponseBeanGeneric("0000", Mensaje.SIN_RESULTADO.getMensaje(), null);
		}
		return response;
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoRangoEdadDiario(ConsultaPatrocinioRangoEdadRequest req) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_patrocinio_nuevo_rango_edad_diario").withoutProcedureColumnMetaDataAccess()
				.declareParameters(
						new SqlParameter("p_id_rango", Types.VARCHAR),
						new SqlParameter("p_mes_id", Types.INTEGER),
						new SqlParameter("p_anio", Types.VARCHAR),
						new SqlParameter("p_grupo_servicio_id", Types.INTEGER),
						new SqlParameter("p_distrito_id", Types.INTEGER),
						new SqlParameter("p_sede_id", Types.INTEGER),
						new SqlOutParameter("@p_total", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_id_rango", req.getRangoEdad());
		parameters.put("p_mes_id", req.getMes());
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_grupo_servicio_id", req.getIdGrupoServicio());
		parameters.put("p_distrito_id", req.getIdDistrito());
		parameters.put("p_sede_id", req.getIdSede());
		Map<String, Object> resultado = simpleJdbcCall.execute(parameters);
		Integer total = (Integer) resultado.get("@p_total");
		
		if(total>0) {
		//if (resultado.size() > 0) {
			response = new ResponseBeanGeneric("0000", Mensaje.CONSULTA_EXITOSA.getMensaje(),
					resultado.get("#result-set-1"));
		} else {
			response = new ResponseBeanGeneric("0000", Mensaje.SIN_RESULTADO.getMensaje(), null);
		}
		return response;
	}

	@Override
	public ResponseBeanGeneric getEventoDistritoCerrado(ConsultaEventoDistritoRequest req) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_evento_distrito_cerrado").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_anio", Types.INTEGER),
								   new SqlParameter("p_sede_id", Types.INTEGER),
								   new SqlParameter("p_tipo_evento_id", Types.VARCHAR),
								   new SqlParameter("p_temario_id", Types.INTEGER),
								   new SqlParameter("p_mes_id", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_sede_id", req.getIdSede());
		parameters.put("p_tipo_evento_id", req.getIdTipoEvento());
		parameters.put("p_temario_id", req.getIdTemario());
		parameters.put("p_mes_id", req.getIdMes());
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
	public ResponseBeanGeneric getEventoDistritoDiario(ConsultaEventoDistritoRequest req) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_evento_distrito_diario").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_anio", Types.INTEGER),
								   new SqlParameter("p_sede_id", Types.INTEGER),
								   new SqlParameter("p_tipo_evento_id", Types.VARCHAR),
								   new SqlParameter("p_temario_id", Types.INTEGER),
								   new SqlParameter("p_mes_id", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_sede_id", req.getIdSede());
		parameters.put("p_tipo_evento_id", req.getIdTipoEvento());
		parameters.put("p_temario_id", req.getIdTemario());
		parameters.put("p_mes_id", req.getIdMes());
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
	public ResponseBeanGeneric getEventoTemarioCerrado(ConsultaEventoTemarioRequest req) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_evento_temario_cerrado").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_anio", Types.INTEGER),
								   new SqlParameter("p_distrito_id", Types.INTEGER),
								   new SqlParameter("p_sede_id", Types.INTEGER),
								   new SqlParameter("p_tipo_evento_id", Types.VARCHAR),								   
								   new SqlParameter("p_mes_id", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_distrito_id", req.getIdDistrito());
		parameters.put("p_sede_id", req.getIdSede());
		parameters.put("p_tipo_evento_id", req.getIdTipoEvento());
		parameters.put("p_mes_id", req.getIdMes());
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
	public ResponseBeanGeneric getEventoTemarioDiario(ConsultaEventoTemarioRequest req) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_evento_temario_diario").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_anio", Types.INTEGER),
								   new SqlParameter("p_distrito_id", Types.INTEGER),
								   new SqlParameter("p_sede_id", Types.INTEGER),
								   new SqlParameter("p_tipo_evento_id", Types.VARCHAR),								   
								   new SqlParameter("p_mes_id", Types.INTEGER),
								   new SqlParameter("p_temario_id", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", req.getAnio());
		parameters.put("p_distrito_id", req.getIdDistrito());
		parameters.put("p_sede_id", req.getIdSede());
		parameters.put("p_tipo_evento_id", req.getIdTipoEvento());
		parameters.put("p_mes_id", req.getIdMes());
		parameters.put("p_temario_id", req.getIdTemario());
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
