package de.muenchen.referenzarchitektur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceDApplication {

    @RequestMapping("nixda")
    String nixda() {
        return "Nixda! Kein Zugriff über Zuul!";
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceDApplication.class, args);
    }
}
