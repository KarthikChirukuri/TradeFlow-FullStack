package com.stock.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/check-auth")
    public ResponseEntity<String> checkAuth() {

        System.out.println("Inside checkAuth");

        return ResponseEntity.ok("Authenticated");
    }
}