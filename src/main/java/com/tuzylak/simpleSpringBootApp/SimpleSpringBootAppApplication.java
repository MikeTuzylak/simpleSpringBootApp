package com.tuzylak.simpleSpringBootApp;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SimpleSpringBootAppApplication extends SpringBootServletInitializer
{
  
  private static final Logger LOGGER = LogManager.getLogger(SimpleSpringBootAppApplication.class);
  
	public static void main(String[] args) {
	  SpringApplication.run(SimpleSpringBootAppApplication.class, args);
		
    
    LOGGER.info("Info level log message");
    LOGGER.debug("Debug level log message");
    LOGGER.error("Error level log message");
}

}

