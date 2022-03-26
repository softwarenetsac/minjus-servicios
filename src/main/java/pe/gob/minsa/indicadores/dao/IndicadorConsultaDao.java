package pe.gob.minsa.indicadores.dao;

import pe.gob.minsa.indicadores.bean.ConsultaAnualRequest;
import pe.gob.minsa.indicadores.bean.ConsultaEventoDistritoRequest;
import pe.gob.minsa.indicadores.bean.ConsultaEventoTemarioRequest;
import pe.gob.minsa.indicadores.bean.ConsultaJudicialRequest;
import pe.gob.minsa.indicadores.bean.ConsultaMesRequest;
import pe.gob.minsa.indicadores.bean.ConsultaPatrocinioAnioRequest;
import pe.gob.minsa.indicadores.bean.ConsultaPatrocinioDistritoRequest;
import pe.gob.minsa.indicadores.bean.ConsultaPatrocinioGeneroRequest;
import pe.gob.minsa.indicadores.bean.ConsultaPatrocinioMesRequest;
import pe.gob.minsa.indicadores.bean.ConsultaPatrocinioRangoEdadRequest;
import pe.gob.minsa.indicadores.bean.ResponseBeanGeneric;

public interface IndicadorConsultaDao {

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

}
