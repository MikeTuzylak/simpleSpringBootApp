package com.tuzylak.simpleSpringBootApp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @author Mike Tuzylak (07-02-2019)
 *
 */
@Controller
public class MyController
{
  
  Map<String, String> towns = new HashMap<>();
  
  @ModelAttribute("towns")
  public Map<String, String> populateTown()
  {
    towns.put("BU", "Bury");
    towns.put("BO", "Bolton");
    towns.put("SA", "Salford");
    return towns;
    
  }

  @GetMapping("/home")
  public String home ()
  {
    return "welcome";
  }
}
