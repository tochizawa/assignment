package com.classroom.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/step3")
public class Step3Controller {

  @GetMapping
  public String index() {
    return "step3/index";
  }
  
  @GetMapping("/next")
  public String next() {
    return "step3/index";
  }
}
