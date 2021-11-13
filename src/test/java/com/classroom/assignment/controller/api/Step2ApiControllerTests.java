package com.classroom.assignment.controller.api;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class Step2ApiControllerTests {

  @Autowired
  private MockMvc mockMvc;
  @Autowired
  private Step2ApiController controller;

  @Test
  void contextLoads() {
    // given
    // when
    // then
    assertThat(controller).isNotNull();
  }

  @Test
  public void shouldReturnDefaultMessage() throws Exception {
    // given
    // when
    // then
    this.mockMvc.perform(get("/api/step2")).andDo(print()).andExpect(status().isOk())
        .andExpect(content().string(containsString("index")));
  }

  @Test
  public void shouldReturnDefaultJsonMessage() throws Exception {
    // given
    // when
    // then
    this.mockMvc.perform(get("/api/step2/greeting")).andDo(print()).andExpect(status().isOk())
        .andExpect(jsonPath("$.id", is(1))).andExpect(jsonPath("$.content", is("Hello, World!")));
  }
  
  @Test
  public void shouldReturnJsonMessage() throws Exception {
    // given
    // when
    // then
    this.mockMvc.perform(get("/api/step2/greeting").param("name", "123")).andDo(print()).andExpect(status().isOk())
        .andExpect(jsonPath("$.id", is(1))).andExpect(jsonPath("$.content", is("Hello, 123!")));
  }
}
