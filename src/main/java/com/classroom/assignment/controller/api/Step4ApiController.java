package com.classroom.assignment.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/step4")
public class Step4ApiController {

  @GetMapping
  public String index() {
    return "step4";
  }
}
