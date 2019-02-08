package com.tuzylak.simpleSpringBootApp;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mike Tuzylak (07-02-2019)
 *
 */
@Controller
public class MyController
{
  private static final Logger LOGGER = LogManager.getLogger(SimpleSpringBootAppApplication.class);
  
  
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
  
  @RequestMapping("/logger")
  public String logger() {
   
    LOGGER.debug("This is a debug message");
    LOGGER.info("This is an info message");
    LOGGER.warn("This is a warn message");
    LOGGER.error("This is an error message");
   
    return "welcome";
  }
  
  
}
