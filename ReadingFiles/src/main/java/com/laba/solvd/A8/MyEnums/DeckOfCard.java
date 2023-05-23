package com.laba.solvd.A8.MyEnums;

public enum DeckOfCard {

  ACE("Ace", 11),
  KING("King", 10),
  QUEEN("Queen", 10),
  JACK("Jack", 10),
  TEN("10", 10),
  NINE("9", 9),
  EIGHT("8", 8),
  SEVEN("7", 7),
  SIX("6", 6),
  FIVE("5", 5),
  FOUR("4", 4),
  THREE("3", 3),
  TWO("2", 2);

  private final String name;
  private final int value;

  DeckOfCard(String name, int value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public int getValue() {
    return value;
  }

  public boolean isAce() {
    return this == ACE;
  }
}
