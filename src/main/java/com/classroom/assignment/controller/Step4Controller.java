package com.classroom.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/step4")
public class Step4Controller {

  @GetMapping
  public String index(Model model) {
    model.addAttribute("title", "ここを書き換えてみよう");
    return "step4/index";
  }
}
