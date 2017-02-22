# course-manager

Proofs of concept that shows how to generate Spring Boot multimodule
applications.

=== Description

This project is an Spring Boot multimodule application for course scheduling.

=== Test

Follow these instructions to execute application using embedded tomcat server:

* Generate project distribution using *mvn clean install* command on Parent
  module.
* Execute *mvn spring-boot:run* command on Application module (contains .war)
* Open browser on *http://localhost:8080*