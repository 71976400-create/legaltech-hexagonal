package com.legaltech.legaltech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LegaltechApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(LegaltechApplication.class, args);

        System.out.println("===== CONTROLLERS =====");

        for (String bean : ctx.getBeanDefinitionNames()) {
            if (bean.toLowerCase().contains("controller")) {
                System.out.println(bean);
            }
        }
    }
}