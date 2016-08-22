package com.example.jafs.dao.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.jafs.controllers.EndpointControllers;
import com.example.jafs.controllers.RepoController;
import com.example.jafs.dao.DataManipulation;
import com.example.jafs.entity.Endpoint;

/**
 * The class contains the DAO functions like
 * add
 * list
 * edit(include delete as well)
 * end-points in the persistent storage. To start with our .py file will be 
 * considered as a persistent storage. All the sample JSON files will be saved 
 * Separately
 * @author pulgupta 
 * @version 1.0.0.0
 */

@Repository
public class FileDataManipulation implements DataManipulation {

	Logger logger = LoggerFactory.getLogger(EndpointControllers.class);
	private static int counter =0;
	@Override
	//Check if the end point is already there
	//In case it is already there throw an error
	//Add it the end point is not existing
	public boolean addEndpoint(Endpoint endpoint) {
		try {
			if(RepoController.getRepoPath().equals(""))
				return false;

			File file = new File(RepoController.getRepoPath() + "endpoints.py");
			try(Scanner in = new Scanner(file)){
				while(in.hasNextLine()){
					String line = in.nextLine();
					if(line.contains("@app.route")){
						String point = line.substring(line.indexOf("'")+1, line.lastIndexOf("'"));
						logger.info("Line is : " + point);
						if(point.equals(endpoint.getEndpointUrl()))
							return false;
					}
				}
			}
			//We have checked and we have not found the end point
			//We can now add the end point in the python file.
			logger.info("Endpoint not found lets add!!!!");
			String line1 = "@app.route('" + endpoint.getEndpointUrl() + "')";
			String line2 = "def hello_world_" + ++counter +"():";
			String line3 = "/t return " + endpoint.getJsonBody();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean listEndpoint(Endpoint endpoint) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editEndpoint(Endpoint endpoint) {
		// TODO Auto-generated method stub
		return false;
	}

}
