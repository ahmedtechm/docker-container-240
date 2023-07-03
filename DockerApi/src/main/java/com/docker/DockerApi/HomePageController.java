package com.docker.DockerApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/home")
public class HomePageController {
    @GetMapping
    public String getHomePage() {
        return "Hello AHMED, Welcome to Tech Code Tribe ";
    }
}
