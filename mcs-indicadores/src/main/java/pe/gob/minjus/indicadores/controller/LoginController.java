package pe.gob.minjus.indicadores.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.BindingProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import pe.gob.minjus.indicadores.config.PropertiesBean;
import pe.gob.minjus.indicadores.wsdl.SecurityServiceWS;
import pe.gob.minjus.indicadores.wsdl.SecurityServiceWS_Service;

@RestController
@RequestMapping("/servicios/v1.0")
@Api(value = "microservicio", description = "Interfáz servicio login")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class LoginController {

	@Autowired
	private PropertiesBean propertiesBean;

	@GetMapping(value = "/login", produces = "application/json;charset=UTF-8")
//	public ResponseEntity<InputStreamResource> getLogin(@RequestParam String usuario,
//			@RequestParam String password, HttpServletRequest request) throws Exception {
	public String getLogin(@RequestParam String usuario, @RequestParam String password, HttpServletRequest request)
			throws Exception {

		SecurityServiceWS_Service service = new SecurityServiceWS_Service();
		SecurityServiceWS servicePort = service.getPort(SecurityServiceWS.class);

		setupIpService((BindingProvider) servicePort);
		String ip = servicePort.ipClient();

		String rpta = servicePort.login(propertiesBean.getIdApp(), usuario, password, ip, "AAAAAAAA", false);

		return rpta;
	}

	private static void setupIpService(BindingProvider provider) {
		Map<String, Object> map = provider.getRequestContext();
		map.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"http://desarrollo2.minjus.gob.pe/sgsi-security-ws/SecurityServiceWS");
	}

}
