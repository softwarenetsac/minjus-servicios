package pe.gob.minsa.indicadores.service;

import pe.gob.minsa.indicadores.bean.ResponseBeanGeneric;

public interface MaestrosService {

	public ResponseBeanGeneric listaMateria();
	public ResponseBeanGeneric listaDistritoJudicial();
	public ResponseBeanGeneric listaAnio();
	public ResponseBeanGeneric listaMes();
	public ResponseBeanGeneric listaSede(Integer idSede);
	public ResponseBeanGeneric listaGrupoServicio();
}
