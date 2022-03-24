package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "docks")
public class Controller {

    @Autowired
    private PortService portService;

    @GetMapping
    public String findPorts(@RequestParam(required = false) String id) {

        Port port = portService.findById(Long.valueOf(id));
        return port.toString();
    }
}
