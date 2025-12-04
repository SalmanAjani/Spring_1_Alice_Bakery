package com.spring.alice_bakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliceBakeryApplication implements CommandLineRunner {

    // @Autowired
    // No need for Autowired because this class has only one constructor, so Spring auto performs DI.
    // It is called 'Implicit Constructor Injection'.
    final CakeBaker cakeBaker;

    public AliceBakeryApplication(CakeBaker cakeBaker) {
        this.cakeBaker = cakeBaker; // Constructor DI
    }

    public static void main(String[] args) {
		SpringApplication.run(AliceBakeryApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        cakeBaker.bakeCake();
    }
}