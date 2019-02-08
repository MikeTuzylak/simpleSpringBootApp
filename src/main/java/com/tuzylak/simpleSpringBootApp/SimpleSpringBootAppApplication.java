package com.tuzylak.simpleSpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SimpleSpringBootAppApplication extends SpringBootServletInitializer
{
  public static void main(String[] args)
  {
    SpringApplication.run(SimpleSpringBootAppApplication.class, args);

  }

}
