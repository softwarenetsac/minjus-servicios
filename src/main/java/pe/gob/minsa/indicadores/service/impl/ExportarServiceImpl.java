package pe.gob.minsa.indicadores.service.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import com.fasterxml.jackson.core.type.TypeReference;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import pe.gob.minsa.indicadores.bean.ConsultaAnualRequest;
import pe.gob.minsa.indicadores.bean.ConsultaJudicialRequest;
import pe.gob.minsa.indicadores.bean.ConsultaMesRequest;
import pe.gob.minsa.indicadores.bean.RequestBeanGeneric;
import pe.gob.minsa.indicadores.bean.ResponseBeanGeneric;
import pe.gob.minsa.indicadores.dao.ExportarConsultaDao;
import pe.gob.minsa.indicadores.dao.IndicadorConsultaDao;
import pe.gob.minsa.indicadores.service.ExportarService;
import pe.gob.minsa.indicadores.service.IndicadorService;

@Service
public class ExportarServiceImpl implements ExportarService{

	@Autowired
	private ExportarConsultaDao exportarDao;
	
	@Override
	public ResponseBeanGeneric getCerradoExcel(RequestBeanGeneric req) {
		return exportarDao.getCerradoExcel(req);
	}

	@Override
	public ResponseBeanGeneric getDiarioExcel(RequestBeanGeneric req) {
		return exportarDao.getDiarioExcel(req);
	}

	@Override
	public ResponseBeanGeneric getDiligenciaLibreCerradoExcel(RequestBeanGeneric req) {
		return exportarDao.getDiligenciaLibreCerradoExcel(req);
	}

	@Override
	public ResponseBeanGeneric getDiligenciaLibreDiarioExcel(RequestBeanGeneric req) {
		return exportarDao.getDiligenciaLibreDiarioExcel(req);
	}

	@Override
	public ResponseBeanGeneric getEventoCerradoExcel(RequestBeanGeneric req) {
		return exportarDao.getEventoCerradoExcel(req);
	}

	@Override
	public ResponseBeanGeneric getEventoDiarioExcel(RequestBeanGeneric req) {
		return exportarDao.getEventoDiarioExcel(req);
	}

	@Override
	public ResponseBeanGeneric getPatrocinioCerradoExcel(RequestBeanGeneric req) {
		return exportarDao.getPatrocinioCerradoExcel(req);
	}

	@Override
	public ResponseBeanGeneric getPatrocinioDiarioExcel(RequestBeanGeneric req) {
		return exportarDao.getPatrocinioDiarioExcel(req);
	}

	@Override
	public ResponseBeanGeneric getPatrocinioDelitoCerradoExcel(RequestBeanGeneric req) {
		return exportarDao.getPatrocinioDelitoCerradoExcel(req);
	}

	@Override
	public ResponseBeanGeneric getPatrocinioDelitoDiarioExcel(RequestBeanGeneric req) {
		return exportarDao.getPatrocinioDelitoDiarioExcel(req);
	}

	@Override
	public ByteArrayInputStream exportCerradoExcel(Object obj) throws Exception {
		ObjectMapper mapper = new ObjectMapper();	
		String[] columns = {
				"CON_DISTRITOJUDICIAL"
				,"CON_SEDE"
			    ,"CON_DEFENSOR"
			    ,"CONSULTAMATERIA"
			    ,"CON_UBICACION"
			    ,"CON_MASCULINO"
			    ,"CON_FEMENINO"
			    ,"CON_ANIO"
			    ,"CON_MESNUM"
			    ,"CON_MESNOM"
			    ,"CONSULTA"
			  };
		
		ByteArrayOutputStream stream = new ByteArrayOutputStream();	
		
		try {
			Workbook workbook = new HSSFWorkbook();					
			Sheet sheet = workbook.createSheet("ConsultaCerrado");			
			Row row = sheet.createRow(0);
			for (int i = 0; i < columns.length; i++) {
				Cell cell = row.createCell(i);
				cell.setCellValue(columns[i]);
			}
			
			List<Map<String, String>> consultaCerradoMaps = mapper.convertValue(obj, new TypeReference<List<Map<String, String>>>() {});
			Integer initRow = 1;
	        for (Map<String, String> map : consultaCerradoMaps) {
	        	row = sheet.createRow(initRow);
	        	int countKey = 0;
	        	for(Map.Entry<String, String> entry: map.entrySet()) {
	        		// System.out.println("clave : "+entry.getKey()+", valor : "+entry.getValue());
	        		row.createCell(countKey).setCellValue(entry.getValue());
	        		countKey++;
	        	}
	        	countKey = 0;
	        	initRow++;
	        }
	        workbook.write(stream);
			workbook.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return new ByteArrayInputStream(stream.toByteArray());
	}	
	
	@Override
	public ByteArrayInputStream exportDiarioExcel(Object obj) throws Exception {
		ObjectMapper mapper = new ObjectMapper();	
		String[] columns = {
				"CON_DISTRITOJUDICIAL"
				,"CON_SEDE"
			    ,"CON_DEFENSOR"
			    ,"CONSULTAMATERIA"
			    ,"CON_UBICACION"
			    ,"CON_MASCULINO"
			    ,"CON_FEMENINO"
			    ,"CON_ANIO"
			    ,"CON_MESNUM"
			    ,"CON_MESNOM"
			    ,"CONSULTA"
			  };
		
		ByteArrayOutputStream stream = new ByteArrayOutputStream();	
		
		try {
			Workbook workbook = new HSSFWorkbook();					
			Sheet sheet = workbook.createSheet("ConsultaDiario");			
			Row row = sheet.createRow(0);
			for (int i = 0; i < columns.length; i++) {
				Cell cell = row.createCell(i);
				cell.setCellValue(columns[i]);
			}
			
			List<Map<String, String>> consultaDiarioMaps = mapper.convertValue(obj, new TypeReference<List<Map<String, String>>>() {});
			Integer initRow = 1;
	        for (Map<String, String> map : consultaDiarioMaps) {
	        	row = sheet.createRow(initRow);
	        	int countKey = 0;
	        	for(Map.Entry<String, String> entry: map.entrySet()) {
	        		// System.out.println("clave : "+entry.getKey()+", valor : "+entry.getValue());
	        		row.createCell(countKey).setCellValue(entry.getValue());
	        		countKey++;
	        	}
	        	countKey = 0;
	        	initRow++;
	        }
	        workbook.write(stream);
			workbook.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return new ByteArrayInputStream(stream.toByteArray());
	}

	@Override
	public ByteArrayInputStream exportDiligenciaLibreCerradoExcel(Object obj) throws Exception {
		ObjectMapper mapper = new ObjectMapper();	
		String[] columns = {
				"PDI_COD",
				"PDI_PATROCINADO",
				"PDI_PATROCINADO_SEXO",
				"PDI_TIPODILIGENCIA",
				"PDI_DILIGENCIA",
				"PDI_SITUACIONJURIDICA",
				"PDI_GRUPOSERVICIO",
				"PDI_DISTRITOJUDICIAL",
				"PDI_SEDE",
				"PDI_DEFENSOR",
				"PDI_FECHA_ANIO",
				"PDI_FECHA_MESNUM",
				"PDI_FECHA_MESNOM",
				"PDI_FECHA",
				"PDI_ORIGENREQ",
				"PDI_TIPOFICHA",
				"PDI_ETAPAPROCESAL",
				"PDI_UBICACION",
				"DRS_COD",
				"DRS_RESULTADO",
				"DRS_FECHA_ANIO",
				"DRS_FECHA_MESNUM",
				"DRS_FECHA_MESNOM"
			  };
		
		ByteArrayOutputStream stream = new ByteArrayOutputStream();	
		
		try {
			Workbook workbook = new HSSFWorkbook();					
			Sheet sheet = workbook.createSheet("DiligenciaLibreCerrado");			
			Row row = sheet.createRow(0);
			for (int i = 0; i < columns.length; i++) {
				Cell cell = row.createCell(i);
				cell.setCellValue(columns[i]);
			}
			
			List<Map<String, String>> diligenciaLibreCerradoMaps = mapper.convertValue(obj, new TypeReference<List<Map<String, String>>>() {});
			Integer initRow = 1;
	        for (Map<String, String> map : diligenciaLibreCerradoMaps) {
	        	row = sheet.createRow(initRow);
	        	int countKey = 0;
	        	for(Map.Entry<String, String> entry: map.entrySet()) {
	        		// System.out.println("clave : "+entry.getKey()+", valor : "+entry.getValue());
	        		row.createCell(countKey).setCellValue(entry.getValue());
	        		countKey++;
	        	}
	        	countKey = 0;
	        	initRow++;
	        }
	        workbook.write(stream);
			workbook.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return new ByteArrayInputStream(stream.toByteArray());
	}

	@Override
	public ByteArrayInputStream exportDiligenciaLibreDiarioExcel(Object obj) throws Exception {
		ObjectMapper mapper = new ObjectMapper();	
		String[] columns = {
				"PDI_COD",
				"PDI_PATROCINADO",
				"PDI_PATROCINADO_SEXO",
				"PDI_TIPODILIGENCIA",
				"PDI_DILIGENCIA",
				"PDI_SITUACIONJURIDICA",
				"PDI_GRUPOSERVICIO",
				"PDI_DISTRITOJUDICIAL",
				"PDI_SEDE",
				"PDI_DEFENSOR",
				"PDI_FECHA_ANIO",
				"PDI_FECHA_MESNUM",
				"PDI_FECHA_MESNOM",
				"PDI_FECHA",
				"PDI_ORIGENREQ",
				"PDI_TIPOFICHA",
				"PDI_ETAPAPROCESAL",
				"PDI_UBICACION",
				"DRS_COD",
				"DRS_RESULTADO",
				"DRS_FECHA_ANIO",
				"DRS_FECHA_MESNUM",
				"DRS_FECHA_MESNOM"
			  };
		
		ByteArrayOutputStream stream = new ByteArrayOutputStream();	
		
		try {
			Workbook workbook = new HSSFWorkbook();					
			Sheet sheet = workbook.createSheet("DiligenciaLibreDiario");			
			Row row = sheet.createRow(0);
			for (int i = 0; i < columns.length; i++) {
				Cell cell = row.createCell(i);
				cell.setCellValue(columns[i]);
			}
			
			List<Map<String, String>> diligenciaLibreDiarioMaps = mapper.convertValue(obj, new TypeReference<List<Map<String, String>>>() {});
			Integer initRow = 1;
	        for (Map<String, String> map : diligenciaLibreDiarioMaps) {
	        	row = sheet.createRow(initRow);
	        	int countKey = 0;
	        	for(Map.Entry<String, String> entry: map.entrySet()) {
	        		// System.out.println("clave : "+entry.getKey()+", valor : "+entry.getValue());
	        		row.createCell(countKey).setCellValue(entry.getValue());
	        		countKey++;
	        	}
	        	countKey = 0;
	        	initRow++;
	        }
	        workbook.write(stream);
			workbook.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return new ByteArrayInputStream(stream.toByteArray());
	}

	@Override
	public ByteArrayInputStream exportEventoCerradoExcel(Object obj) throws Exception {
		ObjectMapper mapper = new ObjectMapper();	
		String[] columns = {
				"EVENTO_ID",
				"ANIO",
				"MES",
				"DIA",
				"FECHA_EVENTO",
				"HOMBRES",
				"MUJERES",
				"PERSONAS",
				"DIRECCION_DISTRITAL",
				"SEDE",
				"EVENTO",
				"TEMARIO",
				"GRUPO_SERVICIO"
			  };
		
		ByteArrayOutputStream stream = new ByteArrayOutputStream();	
		
		try {
			Workbook workbook = new HSSFWorkbook();					
			Sheet sheet = workbook.createSheet("ConsultaEventoCerrado");			
			Row row = sheet.createRow(0);
			for (int i = 0; i < columns.length; i++) {
				Cell cell = row.createCell(i);
				cell.setCellValue(columns[i]);
			}
			
			List<Map<String, String>> consultaEventoCerradoMaps = mapper.convertValue(obj, new TypeReference<List<Map<String, String>>>() {});
			Integer initRow = 1;
	        for (Map<String, String> map : consultaEventoCerradoMaps) {
	        	row = sheet.createRow(initRow);
	        	int countKey = 0;
	        	for(Map.Entry<String, String> entry: map.entrySet()) {
	        		// System.out.println("clave : "+entry.getKey()+", valor : "+entry.getValue());
	        		row.createCell(countKey).setCellValue(entry.getValue());
	        		countKey++;
	        	}
	        	countKey = 0;
	        	initRow++;
	        }
	        workbook.write(stream);
			workbook.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return new ByteArrayInputStream(stream.toByteArray());
	}

	@Override
	public ByteArrayInputStream exportEventoDiarioExcel(Object obj) throws Exception {
		ObjectMapper mapper = new ObjectMapper();	
		String[] columns = {
				"EVENTO_ID",
				"ANIO",
				"MES",
				"DIA",
				"FECHA_EVENTO",
				"HOMBRES",
				"MUJERES",
				"PERSONAS",
				"DIRECCION_DISTRITAL",
				"SEDE",
				"EVENTO",
				"TEMARIO",
				"GRUPO_SERVICIO"
			  };
		
		ByteArrayOutputStream stream = new ByteArrayOutputStream();	
		
		try {
			Workbook workbook = new HSSFWorkbook();					
			Sheet sheet = workbook.createSheet("ConsultaEventoDiario");			
			Row row = sheet.createRow(0);
			for (int i = 0; i < columns.length; i++) {
				Cell cell = row.createCell(i);
				cell.setCellValue(columns[i]);
			}
			
			List<Map<String, String>> consultaEventoDiarioMaps = mapper.convertValue(obj, new TypeReference<List<Map<String, String>>>() {});
			Integer initRow = 1;
	        for (Map<String, String> map : consultaEventoDiarioMaps) {
	        	row = sheet.createRow(initRow);
	        	int countKey = 0;
	        	for(Map.Entry<String, String> entry: map.entrySet()) {
	        		// System.out.println("clave : "+entry.getKey()+", valor : "+entry.getValue());
	        		row.createCell(countKey).setCellValue(entry.getValue());
	        		countKey++;
	        	}
	        	countKey = 0;
	        	initRow++;
	        }
	        workbook.write(stream);
			workbook.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return new ByteArrayInputStream(stream.toByteArray());
	}

	@Override
	public ByteArrayInputStream exportPatrocinioCerradoExcel(Object obj) throws Exception {
		ObjectMapper mapper = new ObjectMapper();	
		String[] columns = {
				"CAS_COD",
				"CAS_DISTRITOJUDICIAL",
				"CAS_SEDE",
				"CAS_NATURALEZA",
				"CAS_UBICACION",
				"CAS_CODIGO",
				"CAS_DEFENSOR",
				"CAS_FACHAINICIO",
				"PNI_COD",
				"PNI_TIPOPROCESO",
				"PNI_PATROCINADO_COD",
				"PNI_PATROCINADO",
				"PNI_PATROCINADO_SEXO",
				"PNI_PATROCINADO_DISCAPACIDAD",
				"PNI_PATROCINADO_DISCAPACIDADEQUI",
				"PNI_PATROCINADO_EDAD",
				"PNI_PATROCINADO_RANGOEDAD",
				"PNI_SITUACIONJURIDICA",
				"PNI_GRUPOSERVICIO",
				"PNI_DEFENSOR",
				"PNI_FECHAAPERTURA_ANIO",
				"PNI_FECHAAPERTURA_MESNUM",
				"PNI_FECHAAPERTURA_MESNOM",
				"PNI_TIPOFICHA",
				"PNI_COMUNIDADNATIVA",
				"PDI_COD",
				"PDI_TIPODILIGENCIA",
				"PDI_DILIGENCIA",
				"PDI_SITUACIONJURIDICA",
				"PDI_GRUPOSERVICIO",
				"PDI_DISTRITOJUDICIAL",
				"PDI_SEDE",
				"PDI_DEFENSOR",
				"PDI_FECHA_ANIO",
				"PDI_FECHA_MESNUM",
				"PDI_FECHA_MESNOM",
				"PDI_ORIGENREQ",
				"PDI_TIPOFICHA",
				"PDI_ETAPAPROCESAL",
				"PDI_UBICACION",
				"DRS_COD",
				"DRS_RESULTADO",
				"DRS_FECHA_ANIO",
				"DRS_FECHA_MESNUM",
				"DRS_FECHA_MESNOM"
			  };
		
		ByteArrayOutputStream stream = new ByteArrayOutputStream();	
		
		try {
			Workbook workbook = new HSSFWorkbook();					
			Sheet sheet = workbook.createSheet("ConsultaPatrocinioCerrado");			
			Row row = sheet.createRow(0);
			for (int i = 0; i < columns.length; i++) {
				Cell cell = row.createCell(i);
				cell.setCellValue(columns[i]);
			}
			
			List<Map<String, String>> consultaPatrocinioCerradoMaps = mapper.convertValue(obj, new TypeReference<List<Map<String, String>>>() {});
			Integer initRow = 1;
	        for (Map<String, String> map : consultaPatrocinioCerradoMaps) {
	        	row = sheet.createRow(initRow);
	        	int countKey = 0;
	        	for(Map.Entry<String, String> entry: map.entrySet()) {
	        		// System.out.println("clave : "+entry.getKey()+", valor : "+entry.getValue());
	        		row.createCell(countKey).setCellValue(entry.getValue());
	        		countKey++;
	        	}
	        	countKey = 0;
	        	initRow++;
	        }
	        workbook.write(stream);
			workbook.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return new ByteArrayInputStream(stream.toByteArray());
	}

	@Override
	public ByteArrayInputStream exportPatrocinioDiarioExcel(Object obj) throws Exception {
		ObjectMapper mapper = new ObjectMapper();	
		String[] columns = {
				"CAS_COD",
				"CAS_DISTRITOJUDICIAL",
				"CAS_SEDE",
				"CAS_NATURALEZA",
				"CAS_UBICACION",
				"CAS_CODIGO",
				"CAS_DEFENSOR",
				"CAS_FACHAINICIO",
				"PNI_COD",
				"PNI_TIPOPROCESO",
				"PNI_PATROCINADO_COD",
				"PNI_PATROCINADO",
				"PNI_PATROCINADO_SEXO",
				"PNI_PATROCINADO_DISCAPACIDAD",
				"PNI_PATROCINADO_DISCAPACIDADEQUI",
				"PNI_PATROCINADO_EDAD",
				"PNI_PATROCINADO_RANGOEDAD",
				"PNI_SITUACIONJURIDICA",
				"PNI_GRUPOSERVICIO",
				"PNI_DEFENSOR",
				"PNI_FECHAAPERTURA_ANIO",
				"PNI_FECHAAPERTURA_MESNUM",
				"PNI_FECHAAPERTURA_MESNOM",
				"PNI_TIPOFICHA",
				"PNI_COMUNIDADNATIVA",
				"PDI_COD",
				"PDI_TIPODILIGENCIA",
				"PDI_DILIGENCIA",
				"PDI_SITUACIONJURIDICA",
				"PDI_GRUPOSERVICIO",
				"PDI_DISTRITOJUDICIAL",
				"PDI_SEDE",
				"PDI_DEFENSOR",
				"PDI_FECHA_ANIO",
				"PDI_FECHA_MESNUM",
				"PDI_FECHA_MESNOM",
				"PDI_ORIGENREQ",
				"PDI_TIPOFICHA",
				"PDI_ETAPAPROCESAL",
				"PDI_UBICACION",
				"DRS_COD",
				"DRS_RESULTADO",
				"DRS_FECHA_ANIO",
				"DRS_FECHA_MESNUM",
				"DRS_FECHA_MESNOM"
			  };
		
		ByteArrayOutputStream stream = new ByteArrayOutputStream();	
		
		try {
			Workbook workbook = new HSSFWorkbook();					
			Sheet sheet = workbook.createSheet("ConsultaPatrocinioDiario");			
			Row row = sheet.createRow(0);
			for (int i = 0; i < columns.length; i++) {
				Cell cell = row.createCell(i);
				cell.setCellValue(columns[i]);
			}
			
			List<Map<String, String>> consultaPatrocinioDiarioMaps = mapper.convertValue(obj, new TypeReference<List<Map<String, String>>>() {});
			Integer initRow = 1;
	        for (Map<String, String> map : consultaPatrocinioDiarioMaps) {
	        	row = sheet.createRow(initRow);
	        	int countKey = 0;
	        	for(Map.Entry<String, String> entry: map.entrySet()) {
	        		// System.out.println("clave : "+entry.getKey()+", valor : "+entry.getValue());
	        		row.createCell(countKey).setCellValue(entry.getValue());
	        		countKey++;
	        	}
	        	countKey = 0;
	        	initRow++;
	        }
	        workbook.write(stream);
			workbook.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return new ByteArrayInputStream(stream.toByteArray());
	}

	@Override
	public ByteArrayInputStream exportPatrocinioDelitoCerradoExcel(Object obj) throws Exception {
		ObjectMapper mapper = new ObjectMapper();	
		String[] columns = {
				"CAS_COD",
				"CAS_DISTRITOJUDICIAL",
				"CAS_SEDE",
				"CAS_NATURALEZA",
				"CAS_UBICACION",
				"CAS_CODIGO",
				"CAS_DEFENSOR",
				"CAS_FECHAINICIO",
				"PNI_COD",
				"PNI_TIPOPROCESO",
				"PNI_PATROCINADO_COD",
				"PNI_PATROCINADO",
				"PNI_PATROCINADO_SEXO",
				"PNI_PATROCINADO_DISCAPACIDAD",
				"PNI_PATROCINADO_DISCAPACIDADEQUI",
				"PNI_PATROCINADO_EDAD",
				"PNI_PATROCINADO_RANGOEDAD",
				"PNI_SITUACIONJURIDICA",
				"PNI_GRUPOSERVICIO",
				"PNI_DEFENSOR",
				"PNI_FECHAAPERTURA_ANIO",
				"PNI_FECHAAPERTURA_MESNUM",
				"PNI_FECHAAPERTURA_MESNOM",
				"PNI_TIPOFICHA",
				"PNI_COMUNIDADNATIVA",
				"PNI_DELITO_COD",
				"PNI_DELITO",
				"PDI_COD",
				"PDI_TIPODILIGENCIA",
				"PDI_DILIGENCIA",
				"PDI_SITUACIONJURIDICA",
				"PDI_GRUPOSERVICIO",
				"PDI_DISTRITOJUDICIAL",
				"PDI_SEDE",
				"PDI_DEFENSOR",
				"PDI_FECHA_ANIO",
				"PDI_FECHA_MESNUM",
				"PDI_FECHA_MESNOM",
				"PDI_ORIGENREQ",
				"PDI_TIPOFICHA",
				"PDI_ETAPAPROCESAL",
				"PDI_UBICACION",
				"DRS_COD",
				"DRS_RESULTADO",
				"DRS_FECHA_ANIO",
				"DRS_FECHA_MESNUM",
				"DRS_FECHA_MESNOM"
			  };
		
		ByteArrayOutputStream stream = new ByteArrayOutputStream();	
		
		try {
			Workbook workbook = new HSSFWorkbook();					
			Sheet sheet = workbook.createSheet("ConsultaPatrocinioDelitoCerrado");			
			Row row = sheet.createRow(0);
			for (int i = 0; i < columns.length; i++) {
				Cell cell = row.createCell(i);
				cell.setCellValue(columns[i]);
			}
			
			List<Map<String, String>> consultaCerradoMaps = mapper.convertValue(obj, new TypeReference<List<Map<String, String>>>() {});
			Integer initRow = 1;
	        for (Map<String, String> map : consultaCerradoMaps) {
	        	row = sheet.createRow(initRow);
	        	int countKey = 0;
	        	for(Map.Entry<String, String> entry: map.entrySet()) {
	        		// System.out.println("clave : "+entry.getKey()+", valor : "+entry.getValue());
	        		row.createCell(countKey).setCellValue(entry.getValue());
	        		countKey++;
	        	}
	        	countKey = 0;
	        	initRow++;
	        }
	        workbook.write(stream);
			workbook.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return new ByteArrayInputStream(stream.toByteArray());
	}

	@Override
	public ByteArrayInputStream exportPatrocinioDelitoDiarioExcel(Object obj) throws Exception {
		ObjectMapper mapper = new ObjectMapper();	
		String[] columns = {
				"CAS_COD",
				"CAS_DISTRITOJUDICIAL",
				"CAS_SEDE",
				"CAS_NATURALEZA",
				"CAS_UBICACION",
				"CAS_CODIGO",
				"CAS_DEFENSOR",
				"CAS_FECHAINICIO",
				"PNI_COD",
				"PNI_TIPOPROCESO",
				"PNI_PATROCINADO_COD",
				"PNI_PATROCINADO",
				"PNI_PATROCINADO_SEXO",
				"PNI_PATROCINADO_DISCAPACIDAD",
				"PNI_PATROCINADO_DISCAPACIDADEQUI",
				"PNI_PATROCINADO_EDAD",
				"PNI_PATROCINADO_RANGOEDAD",
				"PNI_SITUACIONJURIDICA",
				"PNI_GRUPOSERVICIO",
				"PNI_DEFENSOR",
				"PNI_FECHAAPERTURA_ANIO",
				"PNI_FECHAAPERTURA_MESNUM",
				"PNI_FECHAAPERTURA_MESNOM",
				"PNI_TIPOFICHA",
				"PNI_COMUNIDADNATIVA",
				"PNI_DELITO_COD",
				"PNI_DELITO",
				"PDI_COD",
				"PDI_TIPODILIGENCIA",
				"PDI_DILIGENCIA",
				"PDI_SITUACIONJURIDICA",
				"PDI_GRUPOSERVICIO",
				"PDI_DISTRITOJUDICIAL",
				"PDI_SEDE",
				"PDI_DEFENSOR",
				"PDI_FECHA_ANIO",
				"PDI_FECHA_MESNUM",
				"PDI_FECHA_MESNOM",
				"PDI_ORIGENREQ",
				"PDI_TIPOFICHA",
				"PDI_ETAPAPROCESAL",
				"PDI_UBICACION",
				"DRS_COD",
				"DRS_RESULTADO",
				"DRS_FECHA_ANIO",
				"DRS_FECHA_MESNUM",
				"DRS_FECHA_MESNOM"
			  };
		
		ByteArrayOutputStream stream = new ByteArrayOutputStream();	
		
		try {
			Workbook workbook = new HSSFWorkbook();					
			Sheet sheet = workbook.createSheet("ConsultaPatrocinioDelitoDiario");			
			Row row = sheet.createRow(0);
			for (int i = 0; i < columns.length; i++) {
				Cell cell = row.createCell(i);
				cell.setCellValue(columns[i]);
			}
			
			List<Map<String, String>> consultaPatrocinioDelitoDiarioMaps = mapper.convertValue(obj, new TypeReference<List<Map<String, String>>>() {});
			Integer initRow = 1;
	        for (Map<String, String> map : consultaPatrocinioDelitoDiarioMaps) {
	        	row = sheet.createRow(initRow);
	        	int countKey = 0;
	        	for(Map.Entry<String, String> entry: map.entrySet()) {
	        		// System.out.println("clave : "+entry.getKey()+", valor : "+entry.getValue());
	        		row.createCell(countKey).setCellValue(entry.getValue());
	        		countKey++;
	        	}
	        	countKey = 0;
	        	initRow++;
	        }
	        workbook.write(stream);
			workbook.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return new ByteArrayInputStream(stream.toByteArray());
	}	

	
}
