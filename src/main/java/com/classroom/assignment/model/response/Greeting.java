package com.classroom.assignment.model.response;

/** あいさつ */
public class Greeting {

  /** id */
  private final String id;
  /** content */
  private final String content;

  /** constractor */
  public Greeting(final String id, final String content) {
    this.id = id;
    this.content = content;
  }

  public String getId() {
    return this.id;
  }

  public String getContent() {
    return this.content;
  }
}
