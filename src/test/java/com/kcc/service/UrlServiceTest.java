package com.kcc.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.kcc.ForGoogleDemoApplicationTests;

public class UrlServiceTest extends ForGoogleDemoApplicationTests {

  @Autowired
  private UrlService urlService;

  @Test
  public void testTourUrl() {
      System.out.println(urlService.getTourUrl("北海道", "2019-07-02"));
  }
  
  @Test
  public void testHotelUrl() {
      System.out.println(urlService.getHotelUrl("北海道", "2019-07-02"));
  }
  
}
