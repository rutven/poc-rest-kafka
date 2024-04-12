package name.legkodymov.poc.kafka.restservice;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

	@Bean
	public NewTopic topic() {
		return new NewTopic(MessageProducer.TOPIC_NAME, 2, (short) 1);
	}

}
