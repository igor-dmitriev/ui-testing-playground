package com.uitesting.playground;

import com.codeborne.selenide.Selenide;

import org.junit.Test;

public class SimpleTest {
  @Test
  public void shouldLoginToTheSystem() {
    Selenide.open("http://testapp.galenframework.com");
  }
}
