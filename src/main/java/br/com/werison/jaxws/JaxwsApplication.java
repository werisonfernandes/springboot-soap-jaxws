package br.com.werison.jaxws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.sun.xml.ws.transport.http.servlet.WSSpringServlet;

@SpringBootApplication
@ImportResource(locations = "jaxwsconfig.xml")
public class JaxwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaxwsApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		return new ServletRegistrationBean(new WSSpringServlet(), "/hello");
	}
}
