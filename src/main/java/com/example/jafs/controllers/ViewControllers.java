package com.example.jafs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The controllers to handle the view requests for the web app.
 * The main function of the controllers will be to show the web page
 * of the application.
 * All the data transfer on the web app will be handled by the rest controllers
 * defined under com.example.jafs.controllers.RestControllers class.
 * @author pulgupta
 * 
 * As of now we are creating a single page application which will have all the 
 * four functionality of dealing with the end points hence we will have only 
 * a single page mapping in this class
 * @version 1.0.0.0
 */
@Controller
public class ViewControllers {
	
	@RequestMapping("/")
	public String loadApplication() {
		return "index.html";
	}
	
}
