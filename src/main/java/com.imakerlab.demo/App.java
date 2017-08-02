package com.imakerlab.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.SpringApplicationConfiguration;

/**
 * @author qiancheng
 */
@SpringApplicationConfiguration
@EnableConfigurationProperties
public class App {

    /**
     * start
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
