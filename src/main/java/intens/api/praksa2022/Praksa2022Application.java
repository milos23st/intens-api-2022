package intens.api.praksa2022;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Praksa2022Application {

	@Value("${PORT}")
	private int port;

	public static void main(String[] args) {
		SpringApplication.run(Praksa2022Application.class, args);
	}

}
