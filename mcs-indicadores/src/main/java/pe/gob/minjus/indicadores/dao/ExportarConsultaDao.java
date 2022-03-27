package pe.gob.minjus.indicadores.dao;

import pe.gob.minjus.indicadores.bean.RequestBeanGeneric;
import pe.gob.minjus.indicadores.bean.ResponseBeanGeneric;

public interface ExportarConsultaDao {

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
	
}
