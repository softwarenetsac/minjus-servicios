package pe.gob.minjus.indicadores.service;

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
import pe.gob.minjus.indicadores.bean.ResponseBeanGeneric;

public interface IndicadorService {

	public ResponseBeanGeneric getMesCerrado(ConsultaMesRequest req);

	public ResponseBeanGeneric getMesdiario(ConsultaMesRequest req);

	public ResponseBeanGeneric getAnualCerrado(ConsultaAnualRequest req);

	public ResponseBeanGeneric getAnualDiario(ConsultaAnualRequest req);

	public ResponseBeanGeneric getDistritoJudicialCerrado(ConsultaJudicialRequest req);

	public ResponseBeanGeneric getDistritoJudicialDiario(ConsultaJudicialRequest req);

	public ResponseBeanGeneric getPatrocinioNuevoDistritoCerrado(ConsultaPatrocinioDistritoRequest req);

	public ResponseBeanGeneric getPatrocinioNuevoDistritoDiario(ConsultaPatrocinioDistritoRequest req);

	public ResponseBeanGeneric getPatrocinioNuevoGeneroCerrado(ConsultaPatrocinioGeneroRequest req);

	public ResponseBeanGeneric getPatrocinioNuevoGeneroDiario(ConsultaPatrocinioGeneroRequest req);

	public ResponseBeanGeneric getPatrocinioNuevoMesCerrado(ConsultaPatrocinioMesRequest req);

	public ResponseBeanGeneric getPatrocinioNuevoMesDiario(ConsultaPatrocinioMesRequest req);

	public ResponseBeanGeneric getPatrocinioNuevoAnioCerrado(ConsultaPatrocinioAnioRequest req);

	public ResponseBeanGeneric getPatrocinioNuevoAnioDiario(ConsultaPatrocinioAnioRequest req);

	public ResponseBeanGeneric getPatrocinioNuevoRangoEdadCerrado(ConsultaPatrocinioRangoEdadRequest req);

	public ResponseBeanGeneric getPatrocinioNuevoRangoEdadDiario(ConsultaPatrocinioRangoEdadRequest req);

	public ResponseBeanGeneric getEventoDistritoCerrado(ConsultaEventoDistritoRequest req);

	public ResponseBeanGeneric getEventoDistritoDiario(ConsultaEventoDistritoRequest req);

	public ResponseBeanGeneric getEventoTemarioCerrado(ConsultaEventoTemarioRequest req);

	public ResponseBeanGeneric getEventoTemarioDiario(ConsultaEventoTemarioRequest req);

	public ResponseBeanGeneric getPatrocinioNuevoGrupoServicioCerrado(ConsultaPatrocinioNuevoGrupoServicioRequest req);

	public ResponseBeanGeneric getPatrocinioNuevoGrupoServicioDiario(ConsultaPatrocinioNuevoGrupoServicioRequest req);
	
	public ResponseBeanGeneric getPatrocinioNuevoTipoDelitoCerrado(ConsultaPatrocinioNuevoTipoDelitoRequest req);

	public ResponseBeanGeneric getPatrocinioNuevoTipoDelitoDiario(ConsultaPatrocinioNuevoTipoDelitoRequest req);

	
}
