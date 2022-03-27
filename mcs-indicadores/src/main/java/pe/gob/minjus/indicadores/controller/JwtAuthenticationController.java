package pe.gob.minjus.indicadores.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.ExpiredJwtException;
import pe.gob.minjus.indicadores.bean.JwtRequest;
import pe.gob.minjus.indicadores.bean.JwtResponse;
import pe.gob.minjus.indicadores.bean.ResponseBeanGeneric;
import pe.gob.minjus.indicadores.util.Mensaje;
import pe.gob.minjus.indicadores.util.MyException;




@RestController
@RequestMapping("auth")
@CrossOrigin
public class JwtAuthenticationController {
		
	@Autowired
	private AuthenticationManager authenticationManager;
	
//	@Autowired
//	private JwtTokenUtility jwtTokenUtility;
//	
//	@Autowired
//	private UsuarioDao usuarioDao;
//	
//	@Autowired
//	private UsuarioSeguridadDao usuarioSeguridadDao;
//	
//	@Autowired 
//	private UserDetailsServiceImpl userDetailsServiceImpl;
//	
	@PostMapping("/login")
	public JwtResponse login (@RequestBody JwtRequest body) throws Exception {
		
		JwtResponse rpt = new JwtResponse();
//		usuarioSeguridadDao.getValidarVigencia(body.getUsuario());
//		this.authenticate(body.getUsuario(), body.getContrasenia());
//		
//		final UserDetails userDetails = userDetailsServiceImpl.loadUserByUsername(body.getUsuario());
//		Usuario usuario = usuarioDao.buscarUsuarioPorUsername(body.getUsuario());
//		final String token = jwtTokenUtility.generateToken(userDetails, usuario);
		rpt.setToken(null);
		return rpt;
	}
	
	
//	private void authenticate(String username, String password) throws Exception {
//		try {
//			
//			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
//			
//		} catch (DisabledException e) {
//			throw new Exception(Mensaje.USUARIO_INHABILITADO.getMensaje(), e);
//		} catch (BadCredentialsException e) {
//			throw new Exception(Mensaje.CREDENCIALES_INVALIDAS.getMensaje(), e);
//		} catch (ExpiredJwtException e) {
//			throw new Exception(Mensaje.JWT_EXPIRADO.getMensaje(), e);
//		} catch (MyException e) {
//			ResponseBeanGeneric.error(e.getMessage());
//		} 
//	}

}
