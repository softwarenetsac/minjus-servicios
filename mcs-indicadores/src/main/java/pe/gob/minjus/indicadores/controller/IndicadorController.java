package pe.gob.minjus.indicadores.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import pe.gob.minjus.indicadores.bean.ConsultaAnualRequest;
import pe.gob.minjus.indicadores.bean.ConsultaEventoDistritoRequest;
import pe.gob.minjus.indicadores.bean.ConsultaEventoTemarioRequest;
import pe.gob.minjus.indicadores.bean.ConsultaJudicialRequest;
import pe.gob.minjus.indicadores.bean.ConsultaMesRequest;
import pe.gob.minjus.indicadores.bean.ConsultaPatrocinioAnioRequest;
import pe.gob.minjus.indicadores.bean.ConsultaPatrocinioNuevoTipoDelitoRequest;
import pe.gob.minjus.indicadores.bean.ConsultaPatrocinioDistritoRequest;
import pe.gob.minjus.indicadores.bean.ConsultaPatrocinioGeneroRequest;
import pe.gob.minjus.indicadores.bean.ConsultaPatrocinioMesRequest;
import pe.gob.minjus.indicadores.bean.ConsultaPatrocinioNuevoGrupoServicioRequest;
import pe.gob.minjus.indicadores.bean.ConsultaPatrocinioRangoEdadRequest;
import pe.gob.minjus.indicadores.bean.RequestBeanGeneric;
import pe.gob.minjus.indicadores.bean.ResponseBeanGeneric;
import pe.gob.minjus.indicadores.service.IndicadorService;

@RestController
@RequestMapping("/servicios/v1.0")
@Api(value = "microservicio", description = "Interfáz servicio reportes")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class IndicadorController {

	@Autowired
	private IndicadorService indicadorService;
	
	@PostMapping(value="/getMesCerrado", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getMesCerrado(@RequestBody ConsultaMesRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getMesCerrado(consultaReq);
	}
	
	@PostMapping(value="/getMesDiario", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getMesdiario(@RequestBody ConsultaMesRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getMesdiario(consultaReq);
	}
	
	@PostMapping(value="/getAnualCerrado", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getAnualCerrado(@RequestBody ConsultaAnualRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getAnualCerrado(consultaReq);
	}
	
	@PostMapping(value="/getAnualDiario", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getAnualDiario(@RequestBody ConsultaAnualRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getAnualDiario(consultaReq);
	}
	
	@PostMapping(value="/getDistritoJudicialCerrado", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getDistritoJudicialCerrado(@RequestBody ConsultaJudicialRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getDistritoJudicialCerrado(consultaReq);
	}
	
	@PostMapping(value="/getDistritoJudicialDiario", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getDistritoJudicialDiario(@RequestBody ConsultaJudicialRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getDistritoJudicialDiario(consultaReq);
	}	
	
	
	@PostMapping(value="/getPatrocinioNuevoDistritoCerrado", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getPatrocinioNuevoDistritoCerrado(@RequestBody ConsultaPatrocinioDistritoRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getPatrocinioNuevoDistritoCerrado(consultaReq);
	}
	
	@PostMapping(value="/getPatrocinioNuevoDistritoDiario", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getPatrocinioNuevoDistritoDiario(@RequestBody ConsultaPatrocinioDistritoRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getPatrocinioNuevoDistritoDiario(consultaReq);
	}	
	
	@PostMapping(value="/getPatrocinioNuevoGeneroCerrado", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getPatrocinioNuevoGeneroCerrado(@RequestBody ConsultaPatrocinioGeneroRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getPatrocinioNuevoGeneroCerrado(consultaReq);
	}
	
	@PostMapping(value="/getPatrocinioNuevoGeneroDiario", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getPatrocinioNuevoGeneroDiario(@RequestBody ConsultaPatrocinioGeneroRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getPatrocinioNuevoGeneroDiario(consultaReq);
	}	
	
	@PostMapping(value="/getPatrocinioNuevoMesCerrado", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getPatrocinioNuevoMesCerrado(@RequestBody ConsultaPatrocinioMesRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getPatrocinioNuevoMesCerrado(consultaReq);
	}
	
	@PostMapping(value="/getPatrocinioNuevoMesDiario", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getPatrocinioNuevoMesDiario(@RequestBody ConsultaPatrocinioMesRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getPatrocinioNuevoMesDiario(consultaReq);
	}	
	
	@PostMapping(value="/getPatrocinioNuevoAnioCerrado", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getPatrocinioNuevoAnioCerrado(@RequestBody ConsultaPatrocinioAnioRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getPatrocinioNuevoAnioCerrado(consultaReq);
	}
	
	@PostMapping(value="/getPatrocinioNuevoAnioDiario", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getPatrocinioNuevoAnioDiario(@RequestBody ConsultaPatrocinioAnioRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getPatrocinioNuevoAnioDiario(consultaReq);
	}	
	
	@PostMapping(value="/getPatrocinioNuevoRangoEdadCerrado", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getPatrocinioNuevoRangoEdadCerrado(@RequestBody ConsultaPatrocinioRangoEdadRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getPatrocinioNuevoRangoEdadCerrado(consultaReq);
	}
	
	@PostMapping(value="/getPatrocinioNuevoRangoEdadDiario", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getPatrocinioNuevoRangoEdadDiario(@RequestBody ConsultaPatrocinioRangoEdadRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getPatrocinioNuevoRangoEdadDiario(consultaReq);
	}	

	@PostMapping(value="/getEventoDistritoCerrado", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getEventoDistritoCerrado(@RequestBody ConsultaEventoDistritoRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getEventoDistritoCerrado(consultaReq);
	}
	
	@PostMapping(value="/getEventoDistritoDiario", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getEventoDistritoDiario(@RequestBody ConsultaEventoDistritoRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getEventoDistritoDiario(consultaReq);
	}	
	
	@PostMapping(value="/getEventoTemarioCerrado", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getEventoTemarioCerrado(@RequestBody ConsultaEventoTemarioRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getEventoTemarioCerrado(consultaReq);
	}
	
	@PostMapping(value="/getEventoTemarioDiario", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getEventoTemarioDiario(@RequestBody ConsultaEventoTemarioRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getEventoTemarioDiario(consultaReq);
	}	
	
	@PostMapping(value="/getPatrocinioNuevoGrupoServicioCerrado", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getPatrocinioNuevoGrupoServicioCerrado(@RequestBody ConsultaPatrocinioNuevoGrupoServicioRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getPatrocinioNuevoGrupoServicioCerrado(consultaReq);
	}
	
	@PostMapping(value="/getPatrocinioNuevoGrupoServicioDiario", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getPatrocinioNuevoGrupoServicioDiario(@RequestBody ConsultaPatrocinioNuevoGrupoServicioRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getPatrocinioNuevoGrupoServicioDiario(consultaReq);
	}	
	
	@PostMapping(value="/getPatrocinioNuevoTipoDelitoCerrado", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getPatrocinioNuevoTipoDelitoCerrado(@RequestBody ConsultaPatrocinioNuevoTipoDelitoRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getPatrocinioNuevoTipoDelitoCerrado(consultaReq);
	}
	
	@PostMapping(value="/getPatrocinioNuevoTipoDelitoDiario", produces= "application/json;charset=UTF-8")
	public ResponseBeanGeneric getPatrocinioNuevoTipoDelitoDiario(@RequestBody ConsultaPatrocinioNuevoTipoDelitoRequest consultaReq,HttpServletRequest request) throws Exception {
		return indicadorService.getPatrocinioNuevoTipoDelitoDiario(consultaReq);
	}	
}
