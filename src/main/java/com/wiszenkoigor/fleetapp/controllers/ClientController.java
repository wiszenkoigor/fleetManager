package com.wiszenkoigor.fleetapp.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
    @GetMapping("/clients")
    public String getClients() {
        return "client";
    }
}
