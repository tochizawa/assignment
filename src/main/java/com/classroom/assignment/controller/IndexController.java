package com.classroom.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

  @GetMapping()
  public String index() {
    return "index";
  }
  
  @GetMapping(path = "step1")
  public String step1() {
    return "step1/index";
  }

  @GetMapping(path = "step2")
  public String step2() {
    return "step2/index";
  }
}
