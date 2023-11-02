package com.security.springboot.security.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

  @GetMapping("/")
  public String showHome() {
    return "home";
  }

  // add a request mapping for /leaders
  @GetMapping("/leaders")
  public String showLeaders() {
    return "leaders";
  }

  // add a request mapping for /systems
  @GetMapping("/systems")
  public String showSystems() {
    return "systems";
  }
}
