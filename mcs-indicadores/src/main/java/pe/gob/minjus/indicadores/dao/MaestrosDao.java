package pe.gob.minjus.indicadores.dao;

import pe.gob.minjus.indicadores.bean.ResponseBeanGeneric;

public interface MaestrosDao {

	public ResponseBeanGeneric listaMateria();
	public ResponseBeanGeneric listaDistritoJudicial();
	public ResponseBeanGeneric listaAnio();
	public ResponseBeanGeneric listaMes();
	public ResponseBeanGeneric listaSede(Integer idSede);
	public ResponseBeanGeneric listaGrupoServicio();
	public ResponseBeanGeneric listaEvento();
	public ResponseBeanGeneric listaTemario(Integer anio);

}
