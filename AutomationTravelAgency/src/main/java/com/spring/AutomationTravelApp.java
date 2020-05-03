
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
    }
    public void test() {
    	System.out.println("somethings");
    	System.out.println("added login");
    }
}

