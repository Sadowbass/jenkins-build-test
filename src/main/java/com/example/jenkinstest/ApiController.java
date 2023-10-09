package com.example.jenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class ApiController {

    @GetMapping("/")
    public String api() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println("inetAddress.getHostAddress() = " + inetAddress.getHostAddress());
        System.out.println("inetAddress.getCanonicalHostName() = " + inetAddress.getCanonicalHostName());
        System.out.println("inetAddress.getHostName() = " + inetAddress.getHostName());
        return inetAddress.getHostAddress();
    }
}
