package com.zl.bifrost;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication(
        scanBasePackages = {"com.zl.bifrost"}
)
public class Application {

    public  static void main(String[] args) {
        log.info("bifrost starting...");
        SpringApplication.run(Application.class, args);
    }

}
