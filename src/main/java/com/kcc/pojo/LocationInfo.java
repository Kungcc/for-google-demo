package com.kcc.pojo;

public class LocationInfo extends LineInfo {

  private String locationCode;

  private String locationName;

  public LocationInfo() {
    super();
  }

  public LocationInfo(String areaCode, String areaName, String lineCode, String lineName,
      String locationCode, String locationName) {
    this.areaCode = areaCode;
    this.areaName = areaName;
    this.lineCode = lineCode;
    this.lineName = lineName;
    this.locationCode = locationCode;
    this.locationName = locationName;
  }

  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

}
