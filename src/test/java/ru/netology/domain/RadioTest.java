package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
  @Test
  void shouldClickNextRadiostation() {
    Radio radioStation = new Radio();
    radioStation.setCurrentRadiostation(0);
    radioStation.nextRadiostation();
    assertEquals(1, radioStation.getCurrentRadiostation());
  }

  @Test
  void shouldClickNextRadiostationLast() {
    Radio radiostation = new Radio();
    radiostation.setCurrentRadiostation(8);
    radiostation.nextRadiostation();
    assertEquals(9, radiostation.getCurrentRadiostation());
  }

  @Test
  void shouldClickNextRadiostationReset() {
    Radio radiostation = new Radio();
    radiostation.setCurrentRadiostation(9);
    radiostation.nextRadiostation();
    assertEquals(0, radiostation.getCurrentRadiostation());
  }

  @Test
  void shouldClickPrevRadiostation() {
    Radio radiostation = new Radio();
    radiostation.setCurrentRadiostation(0);
    radiostation.prevRadiostation();
    assertEquals(9, radiostation.getCurrentRadiostation());
  }

  @Test
  void shouldClickPrevtMinRadiostation() {
    Radio radiostation = new Radio();
    radiostation.setCurrentRadiostation(1);
    radiostation.prevRadiostation();
    assertEquals(0, radiostation.getCurrentRadiostation());
  }

  @Test
  void shouldUnderInitialCRadiostation() {
    Radio radiostation = new Radio();
    radiostation.setCurrentRadiostation(-1);
    assertEquals(0, radiostation.getCurrentRadiostation());
  }

  @Test
  void shouldOverInitialRadiostation() {
    Radio radiostation = new Radio();
    radiostation.setCurrentRadiostation(10);
    assertEquals(0, radiostation.getCurrentRadiostation());
  }

  @Test
  void shouldClickIncreaseVolume() {
    Radio volume = new Radio();
    volume.setCurrentVolume(0);
    volume.increaseVolume();
    assertEquals(1, volume.getCurrentVolume());
  }

  @Test
  void shouldClickIncreaseVolumeMax() {
    Radio volume = new Radio();
    volume.setCurrentVolume(10);
    volume.increaseVolume();
    assertEquals(10, volume.getCurrentVolume());
  }

  @Test
  void shouldClickIncreaseVolumeMin() {
    Radio volume = new Radio();
    volume.setCurrentVolume(0);
    volume.increaseVolume();
    assertEquals(1, volume.getCurrentVolume());
  }
  @Test
  void shouldClickDownVolumeMin() {
    Radio volume = new Radio();
    volume.setCurrentVolume(0);
    volume.downVolume();
    assertEquals(0, volume.getCurrentVolume());
  }
  @Test
  void shouldClickDownVolume() {
    Radio volume = new Radio();
    volume.setCurrentVolume(5);
    volume.downVolume();
    assertEquals(4, volume.getCurrentVolume());
  }
  @Test
  void shouldInitialVolume() {
    Radio volume = new Radio();
    volume.setCurrentVolume(-1);
    assertEquals(0, volume.getCurrentVolume());
  }
}