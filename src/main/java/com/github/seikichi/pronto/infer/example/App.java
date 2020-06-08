package com.github.seikichi.pronto.infer.example;

import net.jcip.annotations.ThreadSafe;

public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }

  public int test1() {
    String s = null;
    return s.length();
  }

  @ThreadSafe
  public static class Dinner {
    private int mTemperature;

    public void makeDinner() {
      boilWater();
    }

    private void boilWater() {
      mTemperature = 100; // unprotected write.
    }
  }
}
