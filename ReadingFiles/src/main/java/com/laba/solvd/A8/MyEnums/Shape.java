package com.laba.solvd.A8.MyEnums;

public enum Shape {


  CIRCLE("2 * PI * r"),
  SQUARE("4 * s"),
  TRIANGLE("(b * h) / 2"),
  RECTANGLE("l * w");

  private final String formula;

  Shape(String formula) {
    this.formula = formula;
  }


  public String getFormula() {
    return formula;
  }
}
