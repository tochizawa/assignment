package com.classroom.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/step2")
public class Step2Controller {

  @GetMapping
  public String index(Model model) {
    return "step2/index";
  }
}
