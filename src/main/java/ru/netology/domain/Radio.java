package ru.netology.domain;

public class Radio {
  private int currentVolume;
  private int currentRadiostation;

  //Если прибавить радиостанцию на 9, то переключится на 0
  public void nextRadiostation() {
    if (currentRadiostation == 9) {
      currentRadiostation = 0;
      return;
    }
    currentRadiostation++;
  }

  //Если убавить радиостанцию на 0, то переключится на 9
  public void prevRadiostation() {
    if (currentRadiostation == 0) {
      currentRadiostation = 9;
      return;
    }
    currentRadiostation--;
  }

  //Если звук меньше 10, то прибавляется на 1
  public void increaseVolume() {
    if (currentVolume < 10) {
      currentVolume++;
    }
  }

  //Если звук больше 0, то прибавляется на 1
  public void downVolume() {
    if (currentVolume > 0) {
      currentVolume--;
    }
  }

  public int getCurrentVolume() {
    return currentVolume;
  }

  public void setCurrentVolume(int currentVolume) {
    if (currentVolume > 10) {
      return;
    }
    if (currentVolume < 0) {
      return;
    }
    this.currentVolume = currentVolume;
  }

  public int getCurrentRadiostation() {
    return currentRadiostation;
  }

  public void setCurrentRadiostation(int currentRadiostation) {
    if (currentRadiostation > 9) {
      return;
    }
    if (currentRadiostation < 0) {
      return;
    }
    this.currentRadiostation = currentRadiostation;
  }
}
