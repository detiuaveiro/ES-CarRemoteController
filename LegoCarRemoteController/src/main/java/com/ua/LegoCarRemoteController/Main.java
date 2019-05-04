package com.ua.LegoCarRemoteController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * This annotations tells that this is the starting point of the springboot
 * application 
 */
@SpringBootApplication
public class Main 
{
	/**
	 * This is where we are going to bootstrap a Springboot application.
	 * 
	 * Why create a class with the main method:
	 *   - Springboot creates a standalone spring application, it doenst need a 
	 *   servlet container, it doesnt need to be deployed on a server.
	 *   
	 * We can start the application like any other java program, through the main method.
	 * O main method creates a servlet container, starts it and hosts the application
	 * 
	 */
	public static void main(String[] args) 
	{
		/*
		 *  This static method creates a servlet container, starts it and hosts the application
		 *  first param: class annotated with SpringBootApplication
		 *  second param: whatever arguments the Main class receives, they are 
		 *  going to be passed to the run method.
		 */
		SpringApplication.run(Main.class, args);
	}

}
