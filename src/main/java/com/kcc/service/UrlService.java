package com.kcc.service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kcc.pojo.LocationInfo;

@Service
public class UrlService {

  private static final Logger logger = LoggerFactory.getLogger(UrlService.class);

  @Autowired
  private CodeService codeService;

  public String getTourUrl(String destination, String depDateStr) {
    LocalDate depDate = LocalDate.parse(depDateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    LocalDate endDate = depDate.plusDays(30L);

    StringBuilder url = new StringBuilder(500);
    url.append(
        "https://travel.liontravel.com/search?Country=TW&WebCode=B2C&TravelType=1&Page=1&PageSize=20&");
    url.append("GoDateStart=").append(depDate.toString()).append("&");
    url.append("GoDateEnd=").append(endDate.toString()).append("&");
    url.append("IsEnsureGroup=false&");

    LocationInfo locationInfo = codeService.getTourCode(destination);
    if (locationInfo == null) {
      return null;
    }
    StringBuilder arriveId = new StringBuilder(20);
    arriveId.append(locationInfo.getLocationCode().substring(1));
    arriveId.append(locationInfo.getLineCode());

    url.append("ArriveID=").append(arriveId.toString().replaceAll("_", "-")).append("&");
    url.append("ArriveTEXT=")
        .append(locationInfo.getLocationName() + "-" + locationInfo.getLineName());
    return url.toString();
  }

  public String getHotelUrl(String destination, String depDateStr) {
    LocalDate depDate = LocalDate.parse(depDateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    LocalDate endDate = depDate.plusDays(1L);

    String[] keywords = getHotelKeyword(destination);
    if (keywords == null || keywords.length != 3) {
      return null;
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    StringBuilder url = new StringBuilder(500);
    url.append("https://hotel.liontravel.com/search?searchParam=");
    url.append("{\"CheckIn\":\"").append(depDate.format(formatter));
    url.append("\",\"CheckOut\":\"").append(endDate.format(formatter));
    url.append("\",\"Rooms\":[{\"AdultQty\":\"2\",\"ChildQty\":\"0\",\"ChildAges\":[]}]");
    url.append(",\"Filter\":{\"Allotment\":\"1\"},\"Destination\":{\"Code\":\"")
        .append(keywords[0]);
    url.append("\",\"Kind\":").append(keywords[1]);
    url.append(",\"Txt\":\"").append(keywords[2]);
    url.append("\"}}");

    return url.toString();
  }

  public String getFlightUrl(String destinationAirport, String destinationCity,
      String destinationCountry, String depDateStr) {
    LocalDate depDate = LocalDate.parse(depDateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    LocalDate endDate = depDate.plusDays(5L);

    StringBuilder url = new StringBuilder(500);
    url.append(
        "https://flight.liontravel.com/search?Rtow=1&NoTrans=F&Adt=1&Chd=0&Inf=0&ClsType=1&HaveSeat=1&DepCity1=TPE&DepCountry1=TW&ArrCity1=");
    url.append(destinationCity).append("&ArrCountry1=");
    url.append(destinationCountry).append("&DepDate1=");
    url.append(depDate.toString()).append("&Arrive1=");
    url.append(destinationAirport).append("&Depart1=&DepCity2=");
    url.append(destinationCity).append("&DepCountry2=");
    url.append(destinationCountry).append("&ArrCity2=TPE&ArrCountry2=TW&DepDate2=");
    url.append(endDate.toString()).append("&Arrive2=");
    url.append(destinationAirport).append("&Depart2=");
    return url.toString();
  }

  private String[] getHotelKeyword(String destination) {
    String[] keywords = null;

    HttpGet httpGet =
        new HttpGet("https://hotel.liontravel.com/search/keyword?keyWord=" + destination);

    try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
      CloseableHttpResponse response = httpClient.execute(httpGet);
      HttpEntity entity = response.getEntity();
      if (entity != null) {
        String result = EntityUtils.toString(entity, "UTF-8");
        JSONObject root = JSONObject.parseObject(result);
        JSONArray detinations = root.getJSONArray("Destinations");
        JSONObject detination = detinations.getJSONObject(0);
        keywords = new String[3];
        keywords[0] = detination.getString("Code");
        keywords[1] = detination.getString("Kind");
        keywords[2] = detination.getString("Name");
        EntityUtils.consume(entity);
      }
    } catch (IOException e) {
      logger.error("ErrorMsg={}", e.getMessage(), e);
    }
    return keywords;
  }
}

