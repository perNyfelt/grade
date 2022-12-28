package se.alipsa.gade.code;

public enum CodeType {
  TXT("Text file"),
  XML("Xml file"),
  SQL("SQL script"),
  GMD("Groovy Markdown"),
  MD("Markdown file"),
  JAVA("Java code"),
  GROOVY("Groovy code"),
  JAVA_SCRIPT("Javascript code"),
  R("R code"),
  SAS("SAS code");

  CodeType(String displayValue) {
    this.displayValue = displayValue;
  }

  private final String displayValue;

  public String getDisplayValue() {
    return displayValue;
  }
}
