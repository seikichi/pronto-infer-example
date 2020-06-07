package com.github.seikichi.pronto.infer.example;

import net.jcip.annotations.ThreadSafe;

public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }
}
