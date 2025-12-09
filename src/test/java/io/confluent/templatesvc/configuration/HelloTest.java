package io.confluent.templatesvc.configuration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloTest {

  private Hello hello;
  private String greeting;

  @BeforeEach
  void setUp() {
    hello = new Hello();
    greeting = hello.getGreeting();
  }

  @Test
  void testHelloWorld() {
    assertNotNull(greeting);
    assertEquals("Hello World", greeting);
  }

  @Test
  void testGreetingNotEmpty() {
    assertFalse(greeting.isEmpty());
    assertTrue(greeting.length() > 0);
  }

  @Test
  void testGreetingContainsHello() {
    assertTrue(greeting.contains("Hello"));
    assertTrue(greeting.startsWith("Hello"));
  }

  @Test
  void testGreetingContainsWorld() {
    assertTrue(greeting.contains("World"));
    assertTrue(greeting.endsWith("World"));
  }

  @Test
  void testGreetingLength() {
    assertEquals(11, greeting.length());
  }

  @Test
  void testGreetingFormat() {
    String expected = "Hello World";
    assertEquals(expected, greeting);
    assertDoesNotThrow(() -> greeting.toString());
  }
}
