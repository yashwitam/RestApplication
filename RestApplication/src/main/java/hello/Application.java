package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	//Use the command to start application: java -jar target/RestApplication.jar --server.port=8181
	//Access it on: http://localhost:8181/greeting
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
