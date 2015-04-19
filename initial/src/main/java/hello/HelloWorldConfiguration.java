package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//The @SpringBootApplication annotation provides a load of defaults (like the embedded servlet container) depending on the contents of your classpath, 
//and other things. It also turns on Spring MVC’s @EnableWebMvc annotation that activates web endpoints.
//
//In a conventional Spring MVC application, you would add @EnableWebMvc to turn on key behaviors including configuration of a DispatcherServlet. 
//But Spring Boot turns on this annotation automatically when it detects spring-webmvc on your classpath. This sets you up to build a controller in an upcoming step.
//
//The @SpringBootApplication also brings in a @ComponentScan, which tells Spring to scan the hello package for those controllers 
//(along with any other annotated component classes).

@SpringBootApplication
public class HelloWorldConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldConfiguration.class, args);
    }

} 
