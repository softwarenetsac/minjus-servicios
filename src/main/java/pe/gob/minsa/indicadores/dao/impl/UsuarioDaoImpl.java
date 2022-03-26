package pe.gob.minsa.indicadores.dao.impl;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.gob.minsa.indicadores.dao.UsuarioDao;

@Repository
public class UsuarioDaoImpl extends JdbcDaoSupport implements UsuarioDao {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public UsuarioDaoImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

//	@Override
//	public Usuario buscarUsuarioPorUsername(String username) {
//		Usuario user = null;
//		List<Map<String, Object>> getUserBd = null;
//		List<Map<String, Object>> getUserUe = null;
//		List<Map<String, Object>> getUserDtl = null;
//
//		List<Dependencia> dependencia = new ArrayList<>();
//		List<Disa> disa = new ArrayList<>();
//		List<Red> red = new ArrayList<>();
//		List<MicroRed> microred = new ArrayList<>();
//		List<Establecimiento> establecimiento = new ArrayList<>();
//		List<UnidadEjecutora> unidadEjecutora = new ArrayList<>();
//		try {
//
//			String sql1 = "select * from public.sp_consulta_usuario_detalle_v1('" + username + "')";
//			String sql2 = "select * from public.sp_consulta_usuario_v1('" + username + "')";
//			String sql3 = "select * from public.sp_consulta_usuario_ue_v1('" + username + "')";
//
//			getUserDtl = getJdbcTemplate().queryForList(sql1);
//			getUserBd = getJdbcTemplate().queryForList(sql2);
//			getUserUe = getJdbcTemplate().queryForList(sql3);
//			System.out.println("getUserDtl: "+getUserDtl.toString());
//			System.out.println("getUserBd: "+getUserBd.toString());
//			System.out.println("getUserUe: "+getUserUe.toString());
//			if (!getUserDtl.isEmpty() && getUserDtl != null) {
//				user = new Usuario();
//
//				for (Map<String, Object> item : getUserDtl) {
//					String codigo = (String) item.get("v_codigo");
//					if (codigo.equals("0000")) {
//						user.setId((Integer) item.get("v_id"));
//						user.setUsuario(username);
//						user.setNombre((String) item.get("v_nombre"));
//						user.setContrasenia((String) item.get("v_contrasenia"));
//						user.setVerificado((boolean) item.get("v_verificado"));
//						user.setIdRol((Integer) item.get("v_idrol"));
//						user.setRol((String) item.get("v_rol"));
//						user.setIdRol((Integer) item.get("v_idRol"));
//					}
//				}
//
//				if (!getUserBd.isEmpty() && getUserBd != null) {
//					for (Map<String, Object> item : getUserBd) {
//						String codigo = (String) item.get("v_codigo");
//						if (codigo.equals("0000")) {
//							
//							if((Integer) item.get("v_dependencia") != null)
//								dependencia.add(new Dependencia((Integer) item.get("v_dependencia"),
//										(String) item.get("v_dcrp_dep")));
//							else
//								dependencia.add(new Dependencia());
//							
//							if((Integer) item.get("v_disa") != null)
//								disa.add(new Disa((Integer) item.get("v_disa"), (String) item.get("v_dcrp_disa")));
//							else
//								disa.add(new Disa());
//							
//							red.add(new Red((String) item.get("v_red"), (String) item.get("v_dcrp_red")));
//							microred.add(new MicroRed((String) item.get("v_microred"), (String) item.get("v_dcrp_mred")));
//							
//							if((Integer) item.get("v_establecimiento") != null)
//								establecimiento.add(new Establecimiento((Integer) item.get("v_establecimiento"),
//									(String) item.get("v_dcrp_est")));
//							else
//								establecimiento.add(new Establecimiento());
//						}
//					}
//
//					user.setDependencia(dependencia);
//					user.setDisa(disa);
//					user.setRed(red);					
//					user.setMicrored(microred);
//					user.setEstablecimiento(establecimiento);
//				}
//
//				if (!getUserUe.isEmpty() && getUserUe != null) {
//					for (Map<String, Object> item : getUserUe) {
//						unidadEjecutora
//								.add(new UnidadEjecutora((String) item.get("v_idue"), (String) item.get("v_dcrp_ue")));
//					}
//					user.setUnidadEjecutora(unidadEjecutora);
//				}
//
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			logger.debug("Error buscarUsuarioPorUsername  - > " + e.getMessage());
//		}
//		return user;
//	}

}
