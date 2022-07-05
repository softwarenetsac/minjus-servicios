package pe.gob.minjus.indicadores.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.minjus.indicadores.bean.ResponseBeanGeneric;
import pe.gob.minjus.indicadores.dao.MaestrosDao;
import pe.gob.minjus.indicadores.service.MaestrosService;

@Service
public class MaestrosServiceImpl implements MaestrosService {

	@Autowired
	private MaestrosDao maestroDao;

	@Override
	public ResponseBeanGeneric listaMateria() {
		return maestroDao.listaMateria();
	}

	@Override
	public ResponseBeanGeneric listaDistritoJudicial() {
		return maestroDao.listaDistritoJudicial();
	}

	@Override
	public ResponseBeanGeneric listaAnio() {
		return maestroDao.listaAnio();
	}

	@Override
	public ResponseBeanGeneric listaMes() {
		return maestroDao.listaMes();
	}

	@Override
	public ResponseBeanGeneric listaSede(Integer idSede) {
		return maestroDao.listaSede(idSede);
	}

	@Override
	public ResponseBeanGeneric listaGrupoServicio() {
		return maestroDao.listaGrupoServicio();
	}
	
	@Override
	public ResponseBeanGeneric listaEvento() {
		return maestroDao.listaEvento();
	}

	@Override
	public ResponseBeanGeneric listaTemario(Integer anio) {
		return maestroDao.listaTemario(anio);
	}

	@Override
	public ResponseBeanGeneric listaRango() {
		return maestroDao.listaRango();
	}

	@Override
	public ResponseBeanGeneric getListaRangoEdadDiario() {
		return maestroDao.getListaRangoEdadDiario();
	}

	@Override
	public ResponseBeanGeneric getListaRangoEdadCerrado() {
		return maestroDao.getListaRangoEdadCerrado();
	}

	@Override
	public ResponseBeanGeneric listaDelito() {
		return maestroDao.listaDelito();
	}

}
