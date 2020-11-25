package one.digitalinnovation.personapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication Não precisa se preocupar em abrir e fechar conexao
@SpringBootApplication
public class PersonapiApplication {

	public static void main(String[] args) {

		SpringApplication.run(PersonapiApplication.class, args);
	}

}
