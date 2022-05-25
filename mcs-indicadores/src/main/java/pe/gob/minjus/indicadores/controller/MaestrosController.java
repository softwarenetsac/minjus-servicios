package pe.gob.minjus.indicadores.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import pe.gob.minjus.indicadores.bean.ResponseBeanGeneric;
import pe.gob.minjus.indicadores.service.MaestrosService;
import pe.gob.minjus.indicadores.util.JwtTokenUtility;

@RestController
@RequestMapping("/servicios/v1.0")
@Api(value = "microservicio", description = "Interfáz servicio maestros")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class MaestrosController {

	@Autowired
	private MaestrosService maestrosService;

	@GetMapping(value = "/listaMateria", produces = "application/json;charset=UTF-8")
	public ResponseBeanGeneric getListaMateria(HttpServletRequest request)
			throws Exception {
		return maestrosService.listaMateria();
	}

	@GetMapping(value = "/listaDistritoJudicial", produces = "application/json;charset=UTF-8")
	public ResponseBeanGeneric getListaDistritoJudicial(HttpServletRequest request)
			throws Exception {
		return maestrosService.listaDistritoJudicial();
	}

	@GetMapping(value = "/listaAnio", produces = "application/json;charset=UTF-8")
	public ResponseBeanGeneric getListaAnio(HttpServletRequest request)
			throws Exception {
		return maestrosService.listaAnio();
	}
	
	@GetMapping(value = "/listaMes", produces = "application/json;charset=UTF-8")
	public ResponseBeanGeneric getListaMes(HttpServletRequest request)
			throws Exception {
		return maestrosService.listaMes();
	}
	
	@GetMapping(value = "/listaSede", produces = "application/json;charset=UTF-8")
	public ResponseBeanGeneric getListaSede(@RequestParam("idDistrito") Integer idDistrito, HttpServletRequest request)
			throws Exception {
		return maestrosService.listaSede(idDistrito);
	}
	
	@GetMapping(value = "/listaGrupoServicio", produces = "application/json;charset=UTF-8")
	public ResponseBeanGeneric getListaGrupoServicio(HttpServletRequest request)
			throws Exception {
		return maestrosService.listaGrupoServicio();
	}
	
	@GetMapping(value = "/listaEvento", produces = "application/json;charset=UTF-8")
	public ResponseBeanGeneric getListaEvento(HttpServletRequest request)
			throws Exception {
		return maestrosService.listaEvento();
	}
	
	@GetMapping(value = "/listaTemario", produces = "application/json;charset=UTF-8")
	public ResponseBeanGeneric getListaTemario(@RequestParam("anio") Integer anio,HttpServletRequest request)
			throws Exception {
		return maestrosService.listaTemario(anio);
	}
	
	@GetMapping(value = "/listaRango", produces = "application/json;charset=UTF-8")
	public ResponseBeanGeneric getListaRango(HttpServletRequest request)
			throws Exception {
		return maestrosService.listaRango();
	}
	
	@GetMapping(value = "/listaRangoEdadDiario", produces = "application/json;charset=UTF-8")
	public ResponseBeanGeneric getListaRangoEdadDiario(HttpServletRequest request)
			throws Exception {
		return maestrosService.getListaRangoEdadDiario();
	}
	
	@GetMapping(value = "/listaRangoEdadCerrado", produces = "application/json;charset=UTF-8")
	public ResponseBeanGeneric getListaRangoEdadCerrado(HttpServletRequest request)
			throws Exception {
		return maestrosService.getListaRangoEdadCerrado();
	}

}
