package com.kcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.google.maps.model.GeocodingResult;
import com.kcc.pojo.UrlType;
import com.kcc.service.UrlService;
import com.kcc.service.google.GoogleMapService;

@RestController
public class RestV1Controller {

  @Autowired
  private GoogleMapService googleMapService;

  @Autowired
  private UrlService urlService;

  @GetMapping(value = "/geocoding")
  @ResponseStatus(HttpStatus.OK)
  public GeocodingResult geocoding(@RequestParam("latitude") Double latitude,
      @RequestParam("longitude") Double longitude) {
    return googleMapService.geoCoding(latitude, longitude);
  }

  @GetMapping(value = "/promourl")
  @ResponseStatus(HttpStatus.OK)
  public UrlType[] promourl(@RequestParam("destination") String destination,
      @RequestParam("depDate") String depDate) {

    UrlType[] urlTypes = new UrlType[2];
    UrlType tour = new UrlType();
    String tourUrl = urlService.getTourUrl(destination, depDate);
    tour.setUrl(tourUrl);
    tour.setProductType("TOUR");
    urlTypes[0] = tour;

    UrlType hotel = new UrlType();
    String hotelUrl = urlService.getHotelUrl(destination, depDate);
    hotel.setUrl(hotelUrl);
    hotel.setProductType("HOTEL");
    urlTypes[1] = hotel;

    return urlTypes;
  }

  @GetMapping(value = "/promoflighturl")
  @ResponseStatus(HttpStatus.OK)
  public UrlType promoflighturl(@RequestParam("destinationAirport") String destinationAirport,
      @RequestParam("destinationCity") String destinationCity,
      @RequestParam("destinationCountry") String destinationCountry,
      @RequestParam("depDate") String depDate) {

    UrlType flight = new UrlType();
    String tourUrl =
        urlService.getFlightUrl(destinationAirport, destinationCity, destinationCountry, depDate);
    flight.setUrl(tourUrl);
    flight.setProductType("FLIGHT");
    return flight;
  }

}
