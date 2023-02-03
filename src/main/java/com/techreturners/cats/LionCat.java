package com.techreturners.cats;

public class LionCat extends Cat {

  public LionCat() {
    super("wild", 1100);
  }

  @Override
  public String eat() {
    return "Roar!!!!";
  }

}
