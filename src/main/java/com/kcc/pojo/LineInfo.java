package com.kcc.pojo;

public class LineInfo extends AreaInfo {

  protected String lineCode;

  protected String lineName;

  public LineInfo() {
    super();
  }

  public LineInfo(String areaCode, String areaName, String lineCode, String lineName) {
    this.areaCode = areaCode;
    this.areaName = areaName;
    this.lineCode = lineCode;
    this.lineName = lineName;
  }

  public String getLineCode() {
    return lineCode;
  }

  public void setLineCode(String lineCode) {
    this.lineCode = lineCode;
  }

  public String getLineName() {
    return lineName;
  }

  public void setLineName(String lineName) {
    this.lineName = lineName;
  }

}
