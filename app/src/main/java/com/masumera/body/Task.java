package com.masumera.body;

/**
 * Task
 */
public class Task {

  private String name;
  private String body;

  private boolean status; 

  

  

  public Task(boolean status, String name, String body) {
    this.status = status;
    this.name = name;
    this.body = body;
  }
  
  public boolean isStatus() {
    return status;
  }
  public void setStatus(boolean status) {
    this.status = status;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

  
}
