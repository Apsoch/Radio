package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
  @Test
  public void shouldUserSetterGEtter() {
    Conditioner conditioner = new Conditioner();
    conditioner.setName("Кондиционер 3000");
    assertEquals("Кондиционер 3000", conditioner.getName());
  }

  @Test
  public void shouldSetTemp() {
    Conditioner conditioner = new Conditioner();
    conditioner.setMaxTemperature(30);
    conditioner.setMinTemperature(10);
    conditioner.setCurrentTemperature(11);
    conditioner.setCurrentTemperature(0);
    assertEquals(11, conditioner.getCurrentTemperature());
  }
}