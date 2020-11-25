package com.github.conference.app.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @Value("${app.version}")
  private String appVersion;

  @GetMapping()
  public Map<String, String> getStatus() {
    final Map<String, String> map = new HashMap<>();
    map.put("version", appVersion);
    return map;
  }

}
