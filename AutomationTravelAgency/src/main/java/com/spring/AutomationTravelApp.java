package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.spring.rest.repository")
public class AutomationTravelApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(AutomationTravelApp.class, args);
     /*   System.out.print("Gourav Check");
        System.out.print("Ritika Checked");
        System.out.println("sai checked");
        System.out.print("Gourav Checked 2nd");
        System.out.println("hail mufasa");*/
    }
}
