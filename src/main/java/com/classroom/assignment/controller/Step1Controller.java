package com.classroom.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/step1")
public class Step1Controller {

  @RequestMapping(path = "next", method = RequestMethod.GET)
  public String next() {
    return "step1/index";
  }
}
