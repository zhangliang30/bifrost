package com.zl.bifrost;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication(
        scanBasePackages = {"com.zl.bifrost"}
)
@MapperScan(value = {"com.zl.bifrost.db.dao", "com.zl.bifrost.mysql.dao"})
public class Application {

    public  static void main(String[] args) {
        log.info("bifrost starting...");
        SpringApplication.run(Application.class, args);
    }

}
