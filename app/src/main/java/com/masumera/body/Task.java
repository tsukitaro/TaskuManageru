package com.masumera.body;

/**
 * Task
 */
public class Task {

  private int id;


  private String name;;


  
  public int getId() {
    return id;
  }

  

  public Task(int id, String name) {
    this.id = id;
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
}
