package com.payment.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration()
@EnableJpaRepositories(basePackages = "com.payment.repository")
@ComponentScan(basePackages="com.payment")
@EntityScan(basePackages = "com.payment.model")
public class PaymentApp {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApp.class,args);
    }
}
