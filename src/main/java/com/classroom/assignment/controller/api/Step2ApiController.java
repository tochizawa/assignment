package com.classroom.assignment.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.classroom.assignment.model.response.Greeting;

@RestController
@RequestMapping("/api/step2")
public class Step2ApiController {

  private static final String template = "Hello, %s!";

  @GetMapping
  public String index() {
    return "index";
  }

  @GetMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "id", defaultValue = "1") final String id,
      @RequestParam(value = "name", defaultValue = "World") final String name) {
    return new Greeting(id, String.format(template, name));
  }
}
