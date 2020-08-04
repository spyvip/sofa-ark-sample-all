package com.github.spy.sofa.ark.hostapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * module name
 *
 * @author spy
 * @version 1.0 2020/8/4
 * @since 1.0
 */
@Slf4j
@SpringBootApplication
public class HostApplication {

    public static void main(String[] args) {
        SpringApplication.run(HostApplication.class, args);
    }
}
