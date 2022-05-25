package pe.gob.minjus.indicadores.dao.impl;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import pe.gob.minjus.indicadores.bean.ResponseBeanGeneric;
import pe.gob.minjus.indicadores.dao.MaestrosDao;
import pe.gob.minjus.indicadores.util.Mensaje;

@Component
public class MaestrosDaoImpl implements MaestrosDao {

	JdbcTemplate jdbcTemplate;

	public MaestrosDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	@Override
	public ResponseBeanGeneric listaMateria() {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_listar_consulta_materia").withoutProcedureColumnMetaDataAccess();
//				.declareParameters();
		Map<String, Object> parameters = new HashMap<>();
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
	public ResponseBeanGeneric listaDistritoJudicial() {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_listar_distrito_judicial").withoutProcedureColumnMetaDataAccess();
		Map<String, Object> parameters = new HashMap<>();
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
	public ResponseBeanGeneric listaAnio() {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_listar_anio").withoutProcedureColumnMetaDataAccess();
		Map<String, Object> parameters = new HashMap<>();
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
	public ResponseBeanGeneric listaMes() {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_listar_mes").withoutProcedureColumnMetaDataAccess();
		Map<String, Object> parameters = new HashMap<>();
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
	public ResponseBeanGeneric listaSede(Integer idSede) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_listar_sede").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_distrito_id", Types.INTEGER)
				);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_distrito_id", idSede);
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
	public ResponseBeanGeneric listaGrupoServicio() {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_listar_grupo_servicio").withoutProcedureColumnMetaDataAccess();
		Map<String, Object> parameters = new HashMap<>();
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
	public ResponseBeanGeneric listaEvento() {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_listar_tipo_evento").withoutProcedureColumnMetaDataAccess();
		Map<String, Object> parameters = new HashMap<>();
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
	public ResponseBeanGeneric listaTemario(Integer anio) {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_listar_temario").withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("p_anio", Types.INTEGER) );
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("p_anio", anio);
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
	public ResponseBeanGeneric listaRango() {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_listar_grupo_servicio").withoutProcedureColumnMetaDataAccess();
		Map<String, Object> parameters = new HashMap<>();
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
	public ResponseBeanGeneric getListaRangoEdadDiario() {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_listar_rango_edad_diario").withoutProcedureColumnMetaDataAccess();
		Map<String, Object> parameters = new HashMap<>();
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
	public ResponseBeanGeneric getListaRangoEdadCerrado() {
		ResponseBeanGeneric response = null;
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("dgdpaj_indicador")
				.withProcedureName("usp_listar_rango_edad_cerrado").withoutProcedureColumnMetaDataAccess();
		Map<String, Object> parameters = new HashMap<>();
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
