package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
public class GatewayController {

    // ✅ Public endpoint (no authentication required)
    @GetMapping("/hello")
    public String hello() {
        return "Secure API Gateway is Running 🚀";
    }

    // 🔐 Secure endpoint (JWT authentication required)
    @GetMapping("/secure")
    public String secureHello() {
        return "You have accessed a Secure Endpoint 🔐";
    }
}
