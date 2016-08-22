package com.example.jafs.dao.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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

			File file = new File(RepoController.getRepoPath() + "/endpoints.py");
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
			String line1 = "\n@app.route('" + endpoint.getEndpointUrl() + "')\n";
			String line2 = "def hello_world_" + ++counter +"():\n";
			String line3 = "\treturn '" + endpoint.getJsonBody() +"'\n\n";
			
			Scanner in = new Scanner(file);
			File file_temp = new File(RepoController.getRepoPath() + "/endpoints_temp.py");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file_temp, true));
			while(in.hasNextLine()){
				String line = in.nextLine();
				if(line.equals("if __name__ == '__main__':")){
					bw.append(line1);
					bw.append(line2);
					bw.append(line3);
				}
				
				bw.write(line + "\n");
			}
			bw.close();
			in.close();
			Runtime.getRuntime().exec("mv " + RepoController.getRepoPath() + "/endpoints_temp.py " + RepoController.getRepoPath() +  "/endpoints.py");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
