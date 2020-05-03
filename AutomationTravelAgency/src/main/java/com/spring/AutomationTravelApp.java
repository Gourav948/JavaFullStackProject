
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
    public void testMyMethod() 
    {
    	System.out.println("testtesttesttesttest");
    	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@2");
    	System.out.println("###################333");
    }
    public void testMyMethodagain() 
    {
    	int i=10;
    	if(i>5)
    	{
    	System.out.println("somethings changed again");
    	System.out.print("Changed Method Name2");
    	}
    	System.out.println("added login again and again");
    }
    
}

