package io.lishman.userms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Configuration
@RestController
public class UserMsApplication {

    // TODO docker run -p5432:5432 --name ref-db -e POSTGRES_PASSWORD=secret -d postgres

    @Value("${message}")
    private String name = "Hi there!";

    @GetMapping("/")
    public String message() {
        return name;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserMsApplication.class, args);
    }
}
