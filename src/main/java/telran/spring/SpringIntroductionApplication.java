package telran.spring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;

import telran.spring.model.Message;

@SpringBootApplication
public class SpringIntroductionApplication {

	public static void main(String[] args) {
		Message message = new Message();
		ObjectMapper mapper = new ObjectMapper();
		SpringApplication.run(SpringIntroductionApplication.class, args);
		
		
	}

}
