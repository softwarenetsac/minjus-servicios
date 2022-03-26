package pe.gob.minsa.indicadores.controller;

import java.io.ByteArrayInputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import pe.gob.minsa.indicadores.bean.RequestBeanGeneric;
import pe.gob.minsa.indicadores.bean.ResponseBeanGeneric;
import pe.gob.minsa.indicadores.service.ExportarService;

@RestController
@RequestMapping("/servicios/v1.0")
@Api(value = "microservicio", description = "Interfáz servicio exportar")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class ExportarController {

	@Autowired
	private ExportarService exportarService;		
	
	@GetMapping(value="/getCerradoExcel", produces= "application/json;charset=UTF-8")
	public ResponseEntity<InputStreamResource> getCerradoExcel(@RequestParam Integer fechaInicio, @RequestParam Integer fechaFin, HttpServletRequest request) throws Exception {
		
		RequestBeanGeneric consultaReq = new RequestBeanGeneric();
		consultaReq.setFechaInicio(fechaInicio);
		consultaReq.setFechaFin(fechaFin);
		
		ResponseBeanGeneric responseCerrado = exportarService.getCerradoExcel(consultaReq);
		ByteArrayInputStream stream =  exportarService.exportCerradoExcel(responseCerrado.getDatos());
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment; filename=consultacerrado.xls");
		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(stream));
	}	
	
	@GetMapping(value="/getDiarioExcel", produces= "application/json;charset=UTF-8")
	public ResponseEntity<InputStreamResource> getDiarioExcel(@RequestParam Integer fechaInicio, @RequestParam Integer fechaFin,HttpServletRequest request) throws Exception {
		RequestBeanGeneric consultaReq = new RequestBeanGeneric();
		consultaReq.setFechaInicio(fechaInicio);
		consultaReq.setFechaFin(fechaFin);
		
		ResponseBeanGeneric responseDiario = exportarService.getDiarioExcel(consultaReq);
		ByteArrayInputStream stream =  exportarService.exportDiarioExcel(responseDiario.getDatos());
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment; filename=consultadiario.xls");
		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(stream));
	}
	
	@GetMapping(value="/getDiligenciaLibreCerradoExcel", produces= "application/json;charset=UTF-8")
	public ResponseEntity<InputStreamResource> getDiligenciaLibreCerradoExcel(@RequestParam Integer fechaInicio, @RequestParam Integer fechaFin,HttpServletRequest request) throws Exception {
		RequestBeanGeneric consultaReq = new RequestBeanGeneric();
		consultaReq.setFechaInicio(fechaInicio);
		consultaReq.setFechaFin(fechaFin);
		
		ResponseBeanGeneric responseDiligenciaLibreCerrado = exportarService.getDiligenciaLibreCerradoExcel(consultaReq);
		ByteArrayInputStream stream =  exportarService.exportDiligenciaLibreCerradoExcel(responseDiligenciaLibreCerrado.getDatos());
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment; filename=diligenciaLibreCerrado.xls");
		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(stream));
	}
	
	@GetMapping(value="/getDiligenciaLibreDiarioExcel", produces= "application/json;charset=UTF-8")
	public  ResponseEntity<InputStreamResource> getDiligenciaLibreDiarioExcel(@RequestParam Integer fechaInicio, @RequestParam Integer fechaFin,HttpServletRequest request) throws Exception {
		RequestBeanGeneric consultaReq = new RequestBeanGeneric();
		consultaReq.setFechaInicio(fechaInicio);
		consultaReq.setFechaFin(fechaFin);
		
		ResponseBeanGeneric responseDiligenciaLibreDiario = exportarService.getDiligenciaLibreDiarioExcel(consultaReq);
		ByteArrayInputStream stream =  exportarService.exportDiligenciaLibreDiarioExcel(responseDiligenciaLibreDiario.getDatos());
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment; filename=diligenciaLibreDiario.xls");
		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(stream));
	}
	
	@GetMapping(value="/getEventoCerradoExcel", produces= "application/json;charset=UTF-8")
	public ResponseEntity<InputStreamResource> getEventoCerradoExcel(@RequestParam Integer fechaInicio, @RequestParam Integer fechaFin,HttpServletRequest request) throws Exception {
		RequestBeanGeneric consultaReq = new RequestBeanGeneric();
		consultaReq.setFechaInicio(fechaInicio);
		consultaReq.setFechaFin(fechaFin);
		
		ResponseBeanGeneric responseEventoCerrado = exportarService.getEventoCerradoExcel(consultaReq);
		ByteArrayInputStream stream =  exportarService.exportEventoCerradoExcel(responseEventoCerrado.getDatos());
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment; filename=consultaEventoCerrado.xls");
		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(stream));
	}
	
	@GetMapping(value="/getEventoDiarioExcel", produces= "application/json;charset=UTF-8")
	public ResponseEntity<InputStreamResource> getEventoDiarioExcel(@RequestParam Integer fechaInicio, @RequestParam Integer fechaFin,HttpServletRequest request) throws Exception {
		RequestBeanGeneric consultaReq = new RequestBeanGeneric();
		consultaReq.setFechaInicio(fechaInicio);
		consultaReq.setFechaFin(fechaFin);
		
		ResponseBeanGeneric responseEventoDiario = exportarService.getEventoDiarioExcel(consultaReq);
		ByteArrayInputStream stream =  exportarService.exportEventoDiarioExcel(responseEventoDiario.getDatos());
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment; filename=consultaEventoDiario.xls");
		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(stream));
	}
	
	@GetMapping(value="/getPatrocinioCerradoExcel", produces= "application/json;charset=UTF-8")
	public ResponseEntity<InputStreamResource> getPatrocinioCerradoExcel(@RequestParam Integer fechaInicio, @RequestParam Integer fechaFin,HttpServletRequest request) throws Exception {
		RequestBeanGeneric consultaReq = new RequestBeanGeneric();
		consultaReq.setFechaInicio(fechaInicio);
		consultaReq.setFechaFin(fechaFin);
		
		ResponseBeanGeneric responsePatrocinioCerrado = exportarService.getPatrocinioCerradoExcel(consultaReq);
		ByteArrayInputStream stream =  exportarService.exportPatrocinioCerradoExcel(responsePatrocinioCerrado.getDatos());
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment; filename=consultaPatrocinioCerrado.xls");
		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(stream));
	}
	
	@GetMapping(value="/getPatrocinioDiarioExcel", produces= "application/json;charset=UTF-8")
	public ResponseEntity<InputStreamResource> getPatrocinioDiarioExcel(@RequestParam Integer fechaInicio, @RequestParam Integer fechaFin,HttpServletRequest request) throws Exception {
		RequestBeanGeneric consultaReq = new RequestBeanGeneric();
		consultaReq.setFechaInicio(fechaInicio);
		consultaReq.setFechaFin(fechaFin);
		
		ResponseBeanGeneric responsePatrocinioDiario = exportarService.getPatrocinioDiarioExcel(consultaReq);
		ByteArrayInputStream stream =  exportarService.exportPatrocinioDiarioExcel(responsePatrocinioDiario.getDatos());
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment; filename=consultaPatrocinioDiario.xls");
		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(stream));
	}
	
	@GetMapping(value="/getPatrocinioDelitoCerradoExcel", produces= "application/json;charset=UTF-8")
	public ResponseEntity<InputStreamResource> getPatrocinioDelitoCerradoExcel(@RequestParam Integer fechaInicio, @RequestParam Integer fechaFin,HttpServletRequest request) throws Exception {
		RequestBeanGeneric consultaReq = new RequestBeanGeneric();
		consultaReq.setFechaInicio(fechaInicio);
		consultaReq.setFechaFin(fechaFin);
		
		ResponseBeanGeneric responsePatrocinioDelitoCerrado = exportarService.getPatrocinioDelitoCerradoExcel(consultaReq);
		ByteArrayInputStream stream =  exportarService.exportPatrocinioDelitoCerradoExcel(responsePatrocinioDelitoCerrado.getDatos());
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment; filename=consultaPatrocinioDelitoCerrado.xls");
		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(stream));
	}
	
	@GetMapping(value="/getPatrocinioDelitoDiarioExcel", produces= "application/json;charset=UTF-8")
	public ResponseEntity<InputStreamResource> getPatrocinioDelitoDiarioExcel(@RequestParam Integer fechaInicio, @RequestParam Integer fechaFin,HttpServletRequest request) throws Exception {
		RequestBeanGeneric consultaReq = new RequestBeanGeneric();
		consultaReq.setFechaInicio(fechaInicio);
		consultaReq.setFechaFin(fechaFin);
		
		ResponseBeanGeneric responsePatrocinioDelitoDiario = exportarService.getPatrocinioDelitoDiarioExcel(consultaReq);
		ByteArrayInputStream stream =  exportarService.exportPatrocinioDelitoDiarioExcel(responsePatrocinioDelitoDiario.getDatos());
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment; filename=consultaPatrocinioDelitoDiario.xls");
		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(stream));
		
	}

}
