package com.example.bankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.bankapp", "com.engee.bank"})
public class BankappApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankappApplication.class, args);
    }
}
