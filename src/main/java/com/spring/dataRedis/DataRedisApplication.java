package com.spring.dataRedis;

import com.spring.dataRedis.model.Student;
import com.spring.dataRedis.repository.StudentRepository;
import javafx.scene.canvas.GraphicsContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DataRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataRedisApplication.class, args);
	}

}
