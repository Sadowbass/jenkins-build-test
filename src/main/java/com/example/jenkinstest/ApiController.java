package com.example.jenkinstest;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class ApiController {

    private final Environment environment;

    public ApiController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/")
    public String api() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println("inetAddress.getHostAddress() = " + inetAddress.getHostAddress());
        System.out.println("inetAddress.getCanonicalHostName() = " + inetAddress.getCanonicalHostName());
        System.out.println("inetAddress.getHostName() = " + inetAddress.getHostName());
        return environment.getProperty("server.ip");
    }
}
