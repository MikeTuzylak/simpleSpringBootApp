package com.tuzylak.simpleSpringBootApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Mike Tuzylak (07-02-2019)
 *
 */
@Controller
public class MyController
{

  @GetMapping("/home")
  public String home ()
  {
    return "welcome";
  }
}
