package com.techreturners.cats;

public abstract class Cat implements Animal{
  private boolean sleeping;
  private int height;
  private String setting;

  public Cat(String setting, int height) {
    this.setting = setting;
    this.height = height;
    this.sleeping = false;
  }

  public boolean isAsleep() {
    return sleeping;
  }

  public String getSetting() {
    return setting;
  }

  public int getAverageHeight() {
    return height;
  }

  @Override
  public void wakeUp() {
    this.sleeping = false;
  }

  @Override
  public void goToSleep() {
    this.sleeping = true; 
  }

  @Override
  public String eat() {
    return null;
  }
}
