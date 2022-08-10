package de.bhtberlin.tiersitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration;

@SpringBootApplication
public class TiersitterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiersitterApplication.class, args);
    }

}
