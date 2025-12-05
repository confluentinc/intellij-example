package io.confluent.templatesvc.configuration;

public class Hello {

  private String greeting;

  public Hello() {
    this.greeting = "Hello World";
  }

  public String getGreeting() {
    return greeting;
  }

  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }
}