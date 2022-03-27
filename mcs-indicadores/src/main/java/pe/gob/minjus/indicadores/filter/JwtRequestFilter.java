package pe.gob.minjus.indicadores.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;
import pe.gob.minjus.indicadores.util.JwtTokenUtility;



@Component
public class JwtRequestFilter extends OncePerRequestFilter{
	
//	@Autowired
//	UserDetailsServiceImpl userDetailsServiceImpl;
	
	@Autowired
	JwtTokenUtility jwtTokenUtility;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		final String requestTokenHeader = request.getHeader("Authorization");

		String username = null;
		String jwtToken = null;

		if (requestTokenHeader != null && requestTokenHeader.startsWith("Bearer ")) {
			jwtToken = requestTokenHeader.substring(7);

			try {
				
				username = jwtTokenUtility.getUsernameFromToken(jwtToken);
			} catch (IllegalArgumentException e) {
				System.out.println("No se puede obtener el JWT Token");
			} catch (ExpiredJwtException e) {
				System.out.println("JWT Token ha expirado");
			} catch (SignatureException e) {
				System.out.println("JWT Token es inválido");
			}
		} else {
			System.out.println("El JWT Token no fue encontrado como atributo en la cabecera");
		}

		if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			UserDetails userDetails = null; //this.userDetailsServiceImpl.loadUserByUsername(username);

			if (jwtTokenUtility.validateToken(jwtToken, userDetails)) {
				UsernamePasswordAuthenticationToken usernamePasswordAuthentication = new UsernamePasswordAuthenticationToken(
						userDetails, null, userDetails.getAuthorities());
				usernamePasswordAuthentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthentication);
			}
		}

		filterChain.doFilter(request, response);
		
	}

}
