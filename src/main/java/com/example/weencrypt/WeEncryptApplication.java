package com.example.weencrypt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({EnigmaConfig.class})
public class WeEncryptApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeEncryptApplication.class, args);
    }

}
