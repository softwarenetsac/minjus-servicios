package pe.gob.minsa.indicadores.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.minsa.indicadores.bean.ResponseBeanGeneric;
import pe.gob.minsa.indicadores.dao.MaestrosDao;
import pe.gob.minsa.indicadores.service.MaestrosService;

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

}
