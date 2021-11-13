package com.classroom.assignment.model.response;

/** あいさつ */
public class Greeting {

  /** id */
  private final long id;
  /** content */
  private final String content;

  /** constractor */
  public Greeting(final long id, final String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return this.id;
  }

  public String getContent() {
    return this.content;
  }
}
