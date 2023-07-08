package in.catalyst.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("in.catalyst.*")
public class TestprojectApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/testproject");
		SpringApplication.run(TestprojectApplication.class, args);
	}

}
