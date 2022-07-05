package pe.gob.minjus.indicadores.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import pe.gob.minjus.indicadores.dao.IndicadorConsultaDao;
import pe.gob.minjus.indicadores.service.IndicadorService;

@Service
public class IndicadorServiceImpl implements IndicadorService{

	@Autowired
	private IndicadorConsultaDao indicadorDao;


	@Override
	public ResponseBeanGeneric getMesCerrado(ConsultaMesRequest req) {
		return indicadorDao.getMesCerrado(req);
	}

	@Override
	public ResponseBeanGeneric getMesdiario(ConsultaMesRequest req) {
		return indicadorDao.getMesdiario(req);
	}

	@Override
	public ResponseBeanGeneric getAnualCerrado(ConsultaAnualRequest req) {
		return indicadorDao.getAnualCerrado(req);
	}

	@Override
	public ResponseBeanGeneric getAnualDiario(ConsultaAnualRequest req) {
		return indicadorDao.getAnualCerrado(req);
	}

	@Override
	public ResponseBeanGeneric getDistritoJudicialCerrado(ConsultaJudicialRequest req) {
		return indicadorDao.getDistritoJudicialCerrado(req);
	}

	@Override
	public ResponseBeanGeneric getDistritoJudicialDiario(ConsultaJudicialRequest req) {
		return indicadorDao.getDistritoJudicialDiario(req);
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoDistritoCerrado(ConsultaPatrocinioDistritoRequest req) {
		return indicadorDao.getPatrocinioNuevoDistritoCerrado(req);
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoDistritoDiario(ConsultaPatrocinioDistritoRequest req) {
		return indicadorDao.getPatrocinioNuevoDistritoDiario(req);
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoGeneroCerrado(ConsultaPatrocinioGeneroRequest req) {
		return indicadorDao.getPatrocinioNuevoGeneroCerrado(req);
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoGeneroDiario(ConsultaPatrocinioGeneroRequest req) {
		return indicadorDao.getPatrocinioNuevoGeneroDiario(req);
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoMesCerrado(ConsultaPatrocinioMesRequest req) {
		return indicadorDao.getPatrocinioNuevoMesCerrado(req);
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoMesDiario(ConsultaPatrocinioMesRequest req) {
		return indicadorDao.getPatrocinioNuevoMesDiario(req);
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoAnioCerrado(ConsultaPatrocinioAnioRequest req) {
		return indicadorDao.getPatrocinioNuevoAnioCerrado(req);
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoAnioDiario(ConsultaPatrocinioAnioRequest req) {
		return indicadorDao.getPatrocinioNuevoAnioDiario(req);
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoRangoEdadCerrado(ConsultaPatrocinioRangoEdadRequest req) {
		return indicadorDao.getPatrocinioNuevoRangoEdadCerrado(req);
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoRangoEdadDiario(ConsultaPatrocinioRangoEdadRequest req) {
		return indicadorDao.getPatrocinioNuevoRangoEdadDiario(req);
	}

	@Override
	public ResponseBeanGeneric getEventoDistritoCerrado(ConsultaEventoDistritoRequest req) {
		return indicadorDao.getEventoDistritoCerrado(req);
	}

	@Override
	public ResponseBeanGeneric getEventoDistritoDiario(ConsultaEventoDistritoRequest req) {
		return indicadorDao.getEventoDistritoDiario(req);
	}

	@Override
	public ResponseBeanGeneric getEventoTemarioCerrado(ConsultaEventoTemarioRequest req) {
		return indicadorDao.getEventoTemarioCerrado(req);
	}

	@Override
	public ResponseBeanGeneric getEventoTemarioDiario(ConsultaEventoTemarioRequest req) {
		return indicadorDao.getEventoTemarioDiario(req);
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoGrupoServicioCerrado(ConsultaPatrocinioNuevoGrupoServicioRequest req) {
		return indicadorDao.getPatrocinioNuevoGrupoServicioCerrado(req);
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoGrupoServicioDiario(ConsultaPatrocinioNuevoGrupoServicioRequest req) {
		return indicadorDao.getPatrocinioNuevoGrupoServicioDiario(req);
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoTipoDelitoCerrado(ConsultaPatrocinioNuevoTipoDelitoRequest req) {
		return indicadorDao.getPatrocinioNuevoTipoDelitoCerrado(req);
	}

	@Override
	public ResponseBeanGeneric getPatrocinioNuevoTipoDelitoDiario(ConsultaPatrocinioNuevoTipoDelitoRequest req) {
		return indicadorDao.getPatrocinioNuevoTipoDelitoDiario(req);
	}


}
