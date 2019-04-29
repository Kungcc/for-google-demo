package com.kcc.service.google;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;

@Service
public class GoogleMapService {

  private static final Logger LOGGER = LoggerFactory.getLogger(GoogleMapService.class);

  @Value("${google.api.key}")
  private String apiKey;

  public GeocodingResult geoCoding(Double latitude, Double longitude) {
    GeoApiContext context = new GeoApiContext.Builder().apiKey(apiKey).build();
    GeocodingResult[] results;
    GeocodingResult result = null;
    try {
      LatLng latLng = new LatLng(latitude.doubleValue(), longitude.doubleValue());
      results = GeocodingApi.reverseGeocode(context, latLng).await();
      Gson gson = new GsonBuilder().setPrettyPrinting().create();

      if (results.length == 1) {
        result = results[0];
      } else {
        result = results[results.length - 2];
      }
      
      String jsonStr = gson.toJson(result);
      LOGGER.info("result={}", jsonStr);
    } catch (ApiException | InterruptedException | IOException e) {
      LOGGER.error("ErrorMsg={}", e.getMessage(), e);
      Thread.currentThread().interrupt();
    }
    return result;
  }
  
}
