package pe.gob.minsa.indicadores.service;

import java.io.ByteArrayInputStream;

import pe.gob.minsa.indicadores.bean.RequestBeanGeneric;
import pe.gob.minsa.indicadores.bean.ResponseBeanGeneric;

public interface ExportarService {

	public ResponseBeanGeneric getCerradoExcel(RequestBeanGeneric req);
	public ResponseBeanGeneric getDiarioExcel(RequestBeanGeneric req);
	public ResponseBeanGeneric getDiligenciaLibreCerradoExcel(RequestBeanGeneric req);
	public ResponseBeanGeneric getDiligenciaLibreDiarioExcel(RequestBeanGeneric req);
	public ResponseBeanGeneric getEventoCerradoExcel(RequestBeanGeneric req);
	public ResponseBeanGeneric getEventoDiarioExcel(RequestBeanGeneric req);
	public ResponseBeanGeneric getPatrocinioCerradoExcel(RequestBeanGeneric req);
	public ResponseBeanGeneric getPatrocinioDiarioExcel(RequestBeanGeneric req);
	public ResponseBeanGeneric getPatrocinioDelitoCerradoExcel(RequestBeanGeneric req);
	public ResponseBeanGeneric getPatrocinioDelitoDiarioExcel(RequestBeanGeneric req);
	
	public ByteArrayInputStream exportCerradoExcel(Object obj) throws Exception;
	public ByteArrayInputStream exportDiarioExcel(Object obj) throws Exception;
	public ByteArrayInputStream exportDiligenciaLibreCerradoExcel(Object obj) throws Exception;
	public ByteArrayInputStream exportDiligenciaLibreDiarioExcel(Object obj) throws Exception;
	public ByteArrayInputStream exportEventoCerradoExcel(Object obj) throws Exception;
	public ByteArrayInputStream exportEventoDiarioExcel(Object obj) throws Exception;
	public ByteArrayInputStream exportPatrocinioCerradoExcel(Object obj) throws Exception;
	public ByteArrayInputStream exportPatrocinioDiarioExcel(Object obj) throws Exception;
	public ByteArrayInputStream exportPatrocinioDelitoCerradoExcel(Object obj) throws Exception;
	public ByteArrayInputStream exportPatrocinioDelitoDiarioExcel(Object obj) throws Exception;

}
