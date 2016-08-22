package com.example.jafs.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jafs.entity.Repository;

/**
 * This controller sets the path of the repo where we will be keeping all the
 * files and the python repo
 * @author pulgupta
 * @version : 1.0.0.0
 */
@RestController
public class RepoController {

	private static String repoPath ="";
	Logger logger = LoggerFactory.getLogger(RepoController.class);
	
	@RequestMapping(value="/setPath", method = POST, consumes="application/json")
	public ResponseEntity<String> setRepo(@RequestBody Repository path) {
		RepoController.repoPath = path.getEndpointUrl();
		//Copy the initial files at the location
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("pyRepo/endpoints.py").getFile());
		File dest = new File(repoPath + "/endpoints.py");
		logger.info("Source is " + file.toPath());
		logger.info("Destination is " + dest.toPath());
		try {
			Files.copy(file.toPath(), dest.toPath());
			Runtime.getRuntime().exec("/usr/bin/python " + dest.toPath() + " &");
		}
		catch (IOException e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}

	public static String getRepoPath() {
		return repoPath;
	}
}
