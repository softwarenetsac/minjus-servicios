package pe.gob.minjus.indicadores.service;

import pe.gob.minjus.indicadores.bean.ResponseBeanGeneric;

public interface MaestrosService {

	public ResponseBeanGeneric listaMateria();
	public ResponseBeanGeneric listaDistritoJudicial();
	public ResponseBeanGeneric listaAnio();
	public ResponseBeanGeneric listaMes();
	public ResponseBeanGeneric listaSede(Integer idSede);
	public ResponseBeanGeneric listaGrupoServicio();
	public ResponseBeanGeneric listaEvento();
	public ResponseBeanGeneric listaTemario(Integer anio);
	public ResponseBeanGeneric listaRango();
	public ResponseBeanGeneric getListaRangoEdadDiario();
	public ResponseBeanGeneric getListaRangoEdadCerrado();
}
