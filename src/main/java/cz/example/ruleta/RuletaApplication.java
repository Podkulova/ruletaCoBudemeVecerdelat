package cz.example.ruleta;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RuletaApplication {
	private static final Logger logger = LoggerFactory.getLogger(RuletaApplication.class);
	public static void main(String... args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(RuletaApplication.class, args);
		logger.info("Aplikace běží na adrese: http://localhost:{}", applicationContext.getEnvironment().getProperty("local.server.port"));
	}

}
