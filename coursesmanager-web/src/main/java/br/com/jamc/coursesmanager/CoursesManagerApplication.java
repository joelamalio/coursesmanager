package br.com.jamc.coursesmanager;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

//@EnableAutoConfiguration
@SpringBootApplication
public class CoursesManagerApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

   public static void main(String[] args) {
      SpringApplication.run(CoursesManagerApplication.class, args);
   }

   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
      return builder.sources(CoursesManagerApplication.class);
   }
}
