package com.tuzylak.simpleSpringBootApp;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Mike Tuzylak (07-02-2019)
 *
 */
@Controller
public class MyController
{

  @GetMapping("/home")
  public String home (Model theModel)
  {
    LocalDate localDate = LocalDate.now();
    LocalTime now = LocalTime.now();
    theModel.addAttribute("serverTime", now);
    return "welcome";
  }
}
